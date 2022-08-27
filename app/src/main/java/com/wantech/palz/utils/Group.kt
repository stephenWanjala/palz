package com.wantech.palz.utils

import com.wantech.palz.R
import com.wantech.palz.model.GroupModel
import com.wantech.palz.model.Student
import com.wantech.palz.model.SupportStaff
import com.wantech.palz.model.Teacher

object Group {
    val groupList = arrayListOf(
        GroupModel("Students"),
        GroupModel("Teachers"),
        GroupModel("Support Staff")
    )

    val listOfStudents = arrayListOf(
        Student(1, "juma caleb", "Form Two"),
        Student(2, "Celestine namalwa", "Form Two"),
        Student(3, "Catherine wambilianga", "Form Two"),
        Student(4, "Sifuna Beatrice", "Form Four")
    )
    val listOfTeachers = arrayListOf(
        Teacher(1, "Abel juma", "Chemistry", R.drawable.ic_launcher_foreground),
        Teacher(2, "Abel juma", "Chemistry", R.drawable.ic_launcher_foreground),
        Teacher(3, "Abel juma", "Chemistry", R.drawable.ic_launcher_foreground),
        Teacher(4, "Abel juma", "Chemistry", R.drawable.ic_launcher_foreground),
        Teacher(5, "Abel juma", "Chemistry", R.drawable.ic_launcher_foreground),
    )
    val listOfSupportStaff = arrayListOf(
        SupportStaff(1,"papa james","watchMan"),
        SupportStaff(2,"papa james","watchMan"),
        SupportStaff(3,"papa james","watchMan"),
        SupportStaff(4,"papa james","watchMan"),
        SupportStaff(5,"papa james","watchMan"),
    )
}