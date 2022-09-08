package com.example.starwarsfilms.ui.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.starwarsfilms.R
import com.example.starwarsfilms.databinding.FragmentFavoriteBinding

class FavoriteFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentFavoriteBinding = FragmentFavoriteBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = FavoriteFragment()

    }
}