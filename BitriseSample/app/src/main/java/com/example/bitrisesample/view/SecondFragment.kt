package com.example.bitrisesample.view

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

import com.example.bitrisesample.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    private val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        secondTextView.text = args.firstText

        secondButton.setOnClickListener {
            //findNavController().navigate(R.id.action_secondFragment_to_webViewFragment)
        }

        secontToListButton.setOnClickListener {
            //findNavController().navigate(R.id.action_secondFragment_to_listViewFragment)
        }

    }

}
