package com.udacity.shoestore.scenes.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {

    lateinit var binding: FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_details,
            container, false
        )
        binding.backBtn.setOnClickListener {
            NavHostFragment.findNavController(this)
                .navigate(DetailsFragmentDirections.actionShoeDetailsToShoeListings())
        }

        binding.buyBtn.setOnClickListener {
            Toast.makeText(context, "Item bought", Toast.LENGTH_LONG).show()
        }

        return binding.root
    }
}