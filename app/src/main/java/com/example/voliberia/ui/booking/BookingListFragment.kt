package com.example.voliberia.ui.booking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.voliberia.R
import com.example.voliberia.databinding.FragmentBookingListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BookingListFragment : Fragment() {

    private lateinit var binding: FragmentBookingListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentBookingListBinding.inflate(
            inflater,
            container,
            true
        )
        return binding.root
    }

}