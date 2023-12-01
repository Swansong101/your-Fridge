package com.example.yourfridge

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set click listeners for the menu items
        view.findViewById<View>(R.id.products_button).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_productsFragment)
        }

        view.findViewById<View>(R.id.shopping_list_button).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_shoppingListFragment)
        }

        view.findViewById<View>(R.id.recipes_button).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_recipesFragment)
        }

        view.findViewById<View>(R.id.profile_button).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_profileFragment)
        }
    }
}