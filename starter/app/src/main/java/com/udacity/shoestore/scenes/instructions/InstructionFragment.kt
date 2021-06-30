package com.udacity.shoestore.scenes.instructions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.udacity.shoestore.R
import kotlinx.android.synthetic.main.fragment_instruction.view.*

class InstructionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_instruction, container, false)
        view.go_btn.setOnClickListener {
            NavHostFragment.findNavController(this)
                .navigate(InstructionFragmentDirections.actionToShoeList())
        }
        return view
    }
}