package com.example.voliberia.ui.flight

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.voliberia.R
import com.example.voliberia.databinding.FragmentFlightListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FlightListFragment : Fragment() {

    private lateinit var binding: FragmentFlightListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFlightListBinding.inflate(
            inflater,
            container,
            true
        )
        return binding.root
    }

}