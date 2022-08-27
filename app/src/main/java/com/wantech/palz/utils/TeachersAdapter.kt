package com.wantech.palz.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wantech.palz.databinding.TeachersBinding
import com.wantech.palz.model.Teacher

class TeachersAdapter : RecyclerView.Adapter<TeachersAdapter.TeacherViewHolder>() {
    private val listOfTeachers = Group.listOfTeachers

    inner class TeacherViewHolder(private val binding: TeachersBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(teacher: Teacher) {
            binding.apply {
                tId.text = teacher.teacherId.toString()
                tName.text = teacher.teacherName
                tSubject.text = teacher.subjectT
                imageView.setImageResource(teacher.image)

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewHolder =
        TeacherViewHolder(
            TeachersBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    override fun onBindViewHolder(holder: TeacherViewHolder, position: Int) =
        holder.bind(listOfTeachers[position])


    override fun getItemCount(): Int = listOfTeachers.size
}