package com.example.newsfragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

private const val NEWS_KEY = "Key"
class detailsFragment : Fragment(R.layout.fragment_data) {

    companion object {
        fun newInstance(data: NewsList) = detailsFragment().apply {
            arguments = Bundle().apply {
                putSerializable(NEWS_KEY, data)
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val news: NewsList = arguments?.getSerializable(NEWS_KEY) as NewsList

        view.findViewById<TextView>(R.id.header).text = news.header
        view.findViewById<TextView>(R.id.author).text = news.author
        view.findViewById<TextView>(R.id.content).text = news.content
    }
}