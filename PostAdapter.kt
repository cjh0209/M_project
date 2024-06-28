package com.example.m

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.m.databinding.ItemTransBinding

class PostAdapter(private val postList: List<Post>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    class PostViewHolder(val binding: ItemTransBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(post: Post) {
            // Bind the data to the views here
            binding.itemClothesTitleTv.text = post.title
            binding.itemClothesKindTv.text = post.body
            // and other fields
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val binding = ItemTransBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(postList[position])
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}
