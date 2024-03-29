package com.example.cookingnew.ui.what_to_cook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.cookingnew.R

class WhatToCookFragment : Fragment() {


    private lateinit var slideshowViewModel: WhatToCookViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel =
            ViewModelProviders.of(this).get(WhatToCookViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_what_to_cooking, container, false)
        // val textView: TextView = root.findViewById(R.id.text_slideshow)
       // slideshowViewModel.text.observe(this, Observer {
            //   textView.text = it
       // })
        return root
    }
}