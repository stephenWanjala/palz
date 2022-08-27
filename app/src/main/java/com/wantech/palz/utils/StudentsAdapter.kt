package com.wantech.palz.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wantech.palz.databinding.StudentsBinding
import com.wantech.palz.model.Student

class StudentsAdapter() :
    RecyclerView.Adapter<StudentsAdapter.StudentsViewHolder>() {
    private val listOfStudents = Group.listOfStudents

    inner class StudentsViewHolder(private val binding: StudentsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(student: Student) {
            binding.apply {
                studName.text = student.studentName
                regNo.text = student.regNumber.toString()
                form.text = student.classForm
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentsViewHolder {
        return StudentsViewHolder(
            StudentsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: StudentsViewHolder, position: Int) =
        holder.bind(listOfStudents[position])

    override fun getItemCount(): Int = listOfStudents.size
}