package com.example.android.navigation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.android.navigation.databinding.FragmentLinkBinding


class LinkFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentLinkBinding>(inflater,
            R.layout.fragment_link,container,false)

        // Create clickable link for "Foodie.fi" link (Doesn't seem to work :D)
        binding.textTumpperilinkki.movementMethod = LinkMovementMethod.getInstance()

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_link, container, false)
    }
}