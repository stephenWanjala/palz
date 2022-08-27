package com.wantech.palz.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wantech.palz.databinding.SupportStaffBinding
import com.wantech.palz.model.SupportStaff

class SupportStaffAdapter() :
    RecyclerView.Adapter<SupportStaffAdapter.StudentsViewHolder>() {
    private val listOfSupportStaff = Group.listOfSupportStaff

    inner class StudentsViewHolder(private val binding: SupportStaffBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(supportStaff: SupportStaff) {
            binding.apply {
                staffId.text = supportStaff.staffId.toString()
                name.text = supportStaff.name
                position.text = supportStaff.position
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentsViewHolder =
        StudentsViewHolder(
            SupportStaffBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )


    override fun onBindViewHolder(holder: StudentsViewHolder, position: Int) =
        holder.bind(listOfSupportStaff[position])

    override fun getItemCount(): Int = listOfSupportStaff.size
}