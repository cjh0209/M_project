package com.example.m

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.m.databinding.FragmentBuyBinding
import com.example.m.databinding.FragmentSellBinding

class SellFragment : Fragment() {

    lateinit var binding: FragmentSellBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSellBinding.inflate( inflater, container, false)
        return binding.root
    }
}