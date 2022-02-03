package com.example.android.navigation

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentLinkBinding


class LinkFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentLinkBinding>(inflater,
            R.layout.fragment_link,container,false)

        // Set up the intent for
        val foodieLink = Uri.parse("https://www.foodie.fi/entry/rainbow-lager-olut-4-3---tolkki-0-33-l/6438460026072")
        val webIntent = Intent(Intent.ACTION_VIEW, foodieLink)

        // If the the user clicks the Foodie.fi text we send them to link destination
        binding.textTumpperilinkki.setOnClickListener{
            try {
                startActivity(webIntent)
            } catch (e: ActivityNotFoundException) {
                Toast.makeText(context, "Ei voida näyttää linkkiä, koska selainapplikaatio puuttuu!", Toast.LENGTH_SHORT).show()
            }

        }

        // Ok if we use the binding object we need to return the binding.root at the end of OnCreateView
        return binding.root
    }


}