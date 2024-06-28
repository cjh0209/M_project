package com.example.m

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.m.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var postAdapter: PostAdapter
    private var postList: List<Post> = listOf() // This would be your data source

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        postAdapter = PostAdapter(postList)
        binding.homeTransRv.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = postAdapter
        }

        // Example data - replace with real data
        postList = listOf(
            Post("Platform1", "Category1", "Title1", "Body1", "Photo1", "Price1", "UpdatedAt1"),
            Post("Platform2", "Category2", "Title2", "Body2", "Photo2", "Price2", "UpdatedAt2")
        )

        // Notify the adapter of the data change
        postAdapter.notifyDataSetChanged()
    }
}
