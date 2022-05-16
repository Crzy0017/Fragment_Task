package com.example.newsfragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class newsFragment : Fragment(R.layout.fragment_news) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val new1 = view.findViewById<TextView>(R.id.news_1)
        val new2 = view.findViewById<TextView>(R.id.news_2)
        val new3 = view.findViewById<TextView>(R.id.news_3)
        val new4 = view.findViewById<TextView>(R.id.news_4)
        val new5 = view.findViewById<TextView>(R.id.news_5)
        val new6 = view.findViewById<TextView>(R.id.news_6)

        view.findViewById<TextView>(R.id.back).setOnClickListener {
            fragmentManager?.popBackStack()
        }

        new1.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.details, detailsFragment.newInstance(Data.new[0]))
                addToBackStack(null)
                commit()
            }
        }

        new2.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.details, detailsFragment.newInstance(Data.new[1]))
                addToBackStack(null)
                commit()
            }
        }

        new3.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.details, detailsFragment.newInstance(Data.new[2]))
                addToBackStack(null)
                commit()
            }
        }

        new4.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.details, detailsFragment.newInstance(Data.new[3]))
                addToBackStack(null)
                commit()
            }
        }

        new5.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.details, detailsFragment.newInstance(Data.new[4]))
                addToBackStack(null)
                commit()
            }
        }

        new6.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.details, detailsFragment.newInstance(Data.new[5]))
                addToBackStack(null)
                commit()
            }
        }
    }
}