package com.wantech.palz.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wantech.palz.databinding.GroupListBinding
import com.wantech.palz.model.GroupModel

class GroupAdapter
    : RecyclerView.Adapter<GroupAdapter.GroupViewHolder>() {
    private val groupList= Group.groupList

        inner  class GroupViewHolder(private val binding: GroupListBinding):RecyclerView.ViewHolder(binding.root){
            fun bind(groupModel: GroupModel){
                binding.groupName.text=groupModel.groupName
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        return  GroupViewHolder(
            GroupListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        holder.bind(groupList[position])
        holder.itemView.setOnClickListener {
            itemClickListener?.invoke(groupList[position])
        }
    }

    override fun getItemCount(): Int =groupList.size

    private var itemClickListener:((GroupModel)->Unit)?=null
     fun setOnItemCLickListener(listener:(GroupModel)->Unit){
        itemClickListener =listener
    }
}