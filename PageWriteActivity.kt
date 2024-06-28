package com.example.m

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.m.databinding.ActivityPageWriteBinding

class PageWriteActivity : AppCompatActivity() {

    lateinit var binding: ActivityPageWriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPageWriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pageWriteBtn.setOnClickListener {
        }
        getPost()
        postUpload()
        
        initClickListener()
    }

    private fun initClickListener() {
        binding.pageWriteCloseIv.setOnClickListener {
            finish()
        }
    }

    private fun getPost() : Post {
        val title : String = binding.pageWriteTitleTv.text.toString()
        val price : Int = binding.pageWriteEditPriceEt.text.toString().toInt()
        val body : String = binding.pageWriteEditBodyEt.text.toString()

        return Post(title,price,body)
    }

    private fun postUpload(){
        if (binding.pageWriteEditTitleEt.text.toString().isEmpty()) {
            Toast.makeText(this, "제목을 입력해주세요.", Toast.LENGTH_SHORT).show()
        }
        if (binding.pageWriteEditPriceEt.text.toString().isEmpty()) {
            Toast.makeText(this, "가격을 입력해주세요.", Toast.LENGTH_SHORT).show()
        }
        if (binding.pageWriteEditBodyEt.text.toString().isEmpty()) {
            Toast.makeText(this, "내용을 입력해주세요.", Toast.LENGTH_SHORT).show()
        }

    }

}