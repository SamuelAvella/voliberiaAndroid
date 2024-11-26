package com.example.voliberia.ui.boardingPass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.voliberia.R
import com.example.voliberia.databinding.FragmentBoardingPassListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BoardingPassListFragment : Fragment() {

    private lateinit var binding: FragmentBoardingPassListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentBoardingPassListBinding.inflate(
            inflater,
            container,
            true
        )
        return binding.root
    }

}