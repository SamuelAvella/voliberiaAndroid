package com.example.voliberia.ui.userProfile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.voliberia.R
import com.example.voliberia.databinding.FragmentUserProfileBinding

class UserProfileFragment : Fragment() {

    private lateinit var binding : FragmentUserProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUserProfileBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root;
    }

}