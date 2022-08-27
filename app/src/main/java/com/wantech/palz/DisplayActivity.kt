package com.wantech.palz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.wantech.palz.databinding.ActivityDispalyBinding
import com.wantech.palz.model.SupportStaff
import com.wantech.palz.utils.GroupAdapter
import com.wantech.palz.utils.StudentsAdapter
import com.wantech.palz.utils.SupportStaffAdapter
import com.wantech.palz.utils.TeachersAdapter

class DisplayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDispalyBinding
    private lateinit var displayGroupAdapter: GroupAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDispalyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayGroupAdapter = GroupAdapter()

        binding.tittleRv.apply {
            adapter = displayGroupAdapter
            layoutManager = LinearLayoutManager(
                this@DisplayActivity,
                LinearLayoutManager.HORIZONTAL, false
            )
        }
        binding.contentRv.apply {
            adapter = StudentsAdapter()
            layoutManager = LinearLayoutManager(this@DisplayActivity)
        }
        setUpContentList(binding)

    }

    private fun setUpContentList(binding: ActivityDispalyBinding) {
        displayGroupAdapter.setOnItemCLickListener { groupModel ->
            when (groupModel.groupName) {
                "Students" -> {
                    binding.contentRv.apply {
                        adapter = StudentsAdapter()
                        layoutManager = LinearLayoutManager(this@DisplayActivity)
                    }
                }
                "Teachers" ->{
                    binding.contentRv.apply {
                        adapter = TeachersAdapter()
                        layoutManager = LinearLayoutManager(this@DisplayActivity)
                    }
                }
                "Support Staff" ->{
                    binding.contentRv.apply {
                        adapter=SupportStaffAdapter()
                        layoutManager=LinearLayoutManager(this@DisplayActivity)
                    }
                }

            }

        }
    }
}