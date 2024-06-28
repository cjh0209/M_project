package com.example.m_project

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.m_project.databinding.ActivityTransactionBinding

class TransactionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTransactionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransactionBinding.inflate(layoutInflater)
        val actionBar = supportActionBar
        actionBar!!.hide()
        setContentView(binding.root)
        var i = 0
        binding.likeButton.setOnClickListener(){
            if(i==0){
                i=1
                binding.likeButton.setImageResource(R.drawable.ic_like_on)
            }
            else{
                i=0
                binding.likeButton.setImageResource(R.drawable.ic_like_off)
            }
        }
        binding.headerClose.setOnClickListener(){
            finish()
        }


    }
    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        //intent.putExtra("message", "뒤로가기 버튼 클릭")

        //setResult(RESULT_OK, intent)
        finish()
    }
}