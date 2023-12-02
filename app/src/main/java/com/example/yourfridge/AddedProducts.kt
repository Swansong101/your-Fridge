package com.example.yourfridge

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class AddedProducts : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_addedproducts, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.add_product_button).setOnClickListener {
            findNavController().navigate(R.id.action_addedProducts_to_productsFragment)
        }

        view.findViewById<View>(R.id.back_button).setOnClickListener {
            findNavController().navigate(R.id.action_addedProducts_to_SecondFragment)
        }

    }
}