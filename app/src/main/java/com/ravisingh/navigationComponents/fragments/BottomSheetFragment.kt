package com.ravisingh.navigationComponents.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.ravisingh.navigationComponents.R
import kotlinx.android.synthetic.main.fragment_bottom_sheet.*

class BottomSheetFragment : BottomSheetDialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_sheet, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        list_item1.setOnClickListener {
            //handle click event
            Toast.makeText(context, "First List Item Clicked", Toast.LENGTH_SHORT).show()
        }
        list_item2.setOnClickListener {
            //handle click event
            Toast.makeText(context, "Second List Item Clicked", Toast.LENGTH_SHORT).show()
        }
        list_item3.setOnClickListener {
            //handle click event
            Toast.makeText(context, "Third List Item Clicked", Toast.LENGTH_SHORT).show()
        }

        list_item4.setOnClickListener {
            //handle click event
            Toast.makeText(context, "Fourth List Item Clicked", Toast.LENGTH_SHORT).show()
        }

        list_item5.setOnClickListener {
            //handle click event
            Toast.makeText(context, "Fifth List Item Clicked", Toast.LENGTH_SHORT).show()
        }

    }
}