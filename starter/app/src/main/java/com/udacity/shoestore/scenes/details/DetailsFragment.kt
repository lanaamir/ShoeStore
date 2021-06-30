package com.udacity.shoestore.scenes.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.udacity.shoestore.R
import kotlinx.android.synthetic.main.fragment_details.view.*

class DetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_details, container, false)
        view.back_btn.setOnClickListener {
            NavHostFragment.findNavController(this)
                .navigate(DetailsFragmentDirections.actionShoeDetailsToShoeListings())
        }

        view.buy_btn.setOnClickListener {
            Toast.makeText(context, "Item bought", Toast.LENGTH_LONG).show()
        }

        return view
    }
}