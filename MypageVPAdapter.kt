package com.example.fm

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.m.BuyFragment
import com.example.m.SellFragment

class LockerVPAdapter(fragment:Fragment) : FragmentStateAdapter(fragment){
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> BuyFragment()
            else -> SellFragment()
        }
    }
}