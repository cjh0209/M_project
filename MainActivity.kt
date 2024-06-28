package com.example.m

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.m.databinding.ActivityMainBinding
import com.example.m.ui.theme.MTheme

class MainActivity : ComponentActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //initBottomNavigation()

        // 앱 초기 실행 시 홈화면으로 설정
        if (savedInstanceState == null) {
            binding.mainBnv.selectedItemId = androidx.appcompat.R.id.home
        }

        setContent {
            MTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }

//    private fun initBottomNavigation() {
//
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.main_frm, HomeFragment())
//            .commitAllowingStateLoss()
//
//
//        binding.mainBnv.setOnItemSelectedListener { item ->
//            when (item.itemId) {
//
//
//                R.id.fragment_community -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.main_frm, CommunityFragment())
//                        .commitAllowingStateLoss()
//                    return@setOnItemSelectedListener true
//                }
//
//                R.id.fragment_chat -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.main_frm, ChatFragment())
//                        .commitAllowingStateLoss()
//                    return@setOnItemSelectedListener true
//                }
//
//                R.id.fragment_home -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.main_frm, HomeFragment())
//                        .commitAllowingStateLoss()
//                    return@setOnItemSelectedListener true
//                }
//                R.id.fragment_search -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.main_frm, SearchFragment())
//                        .commitAllowingStateLoss()
//                    return@setOnItemSelectedListener true
//                }
//                R.id.fragment_mypage -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.main_frm, MypageFragment())
//                        .commitAllowingStateLoss()
//                    return@setOnItemSelectedListener true
//                }
//            }
//            false
//        }
//    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MTheme {
        Greeting("Android")
    }
}

