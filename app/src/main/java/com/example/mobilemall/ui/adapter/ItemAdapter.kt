package com.example.mobilemall.ui.adapter

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilemall.R
import com.example.mobilemall.data.entity.Item
import com.example.mobilemall.data.tools.ShoppingCartUtil
import com.example.mobilemall.databinding.ItemBinding
import com.example.mobilemall.ui.activity.ItemDetailActivity
import com.example.mobilemall.ui.adapter.holder.ItemHolder
import com.example.mobilemall.ui.fragment.FragmentList

/*
* 商品列表适配器
* */
class ItemAdapter(private val fragment: FragmentList, private val recyclerView: RecyclerView, private val list: List<Item>) : RecyclerView.Adapter<ItemHolder>(), View.OnClickListener {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val goodItemBinding: ItemBinding = DataBindingUtil.inflate(LayoutInflater.from(fragment.parentActivity), R.layout.item, parent, false)
        return ItemHolder(goodItemBinding.root, goodItemBinding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.setData(list[position], this)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btnAddShoppingCart) {
            val item = v.tag as Item
            Thread(Runnable {

                //添加购物车
                ShoppingCartUtil.addShoppingCart(item)
                fragment.parentActivity.toast("添加购物车成功")
            }).start()
        } else if (v.id == R.id.btnMore) {
            //更多
            val item = v.tag as Item
            val items = arrayOf("查看", "加入购物车")
            AlertDialog.Builder(fragment.parentActivity).setTitle("操作").setItems(items) { dialog: DialogInterface?, which: Int ->
                if (which == 0) {
                    //查看
                    val intent = Intent(fragment.parentActivity, ItemDetailActivity::class.java)
                    intent.putExtra("uuid", item.uuid)
                    fragment.startActivity(intent)
                } else {
                    Thread(Runnable {

                        //添加购物车
                        ShoppingCartUtil.addShoppingCart(item)
                        fragment.parentActivity.toast("添加购物车成功")
                    }).start()
                }
            }.show()
        } else {
            val position = recyclerView.getChildAdapterPosition(v)
            //查看
            val intent = Intent(fragment.parentActivity, ItemDetailActivity::class.java)
            intent.putExtra("uuid", list[position].uuid)
            fragment.startActivity(intent)
        }
    }

}