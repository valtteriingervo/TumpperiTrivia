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

        val url = "https://www.foodie.fi/entry/rainbow-lager-olut-4-3---tolkki-0-33-l/6438460026072"
        val url2 = "https://developer.samsung.com/android-usb-driver"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url2)

        binding.linkButton.setOnClickListener {
            startActivity(i)
        }

        // Create clickable link for "Foodie.fi" link (Doesn't seem
        binding.textTumpperilinkki.movementMethod = LinkMovementMethod.getInstance()

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_link, container, false)
    }
}