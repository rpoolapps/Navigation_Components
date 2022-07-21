package com.ravisingh.navigationComponents.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.ravisingh.navigationComponents.model.SendMyData
import com.ravisingh.navigationComponents.R

class SecondFragment : Fragment() {

    val args : SecondFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val views  = inflater.inflate(R.layout.fragment_second, container, false)
        // val data = requireArguments()["data"] as SendMyData  // Receive data directly from bundle without using safe args


        val data = args.myData
        val textView = views.findViewById<TextView>(R.id.textview)
        textView.text = "${data!!.firstName} ${data.secondName} ${data.lastname}"

        return views
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}