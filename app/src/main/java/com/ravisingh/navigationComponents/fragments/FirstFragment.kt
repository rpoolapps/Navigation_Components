package com.ravisingh.navigationComponents.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.ravisingh.navigationComponents.model.SendMyData
import com.ravisingh.navigationComponents.R
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        /* Handler(Looper.myLooper()!!).postDelayed({
             navController.navigate(R.id.action_firstFragment_to_secondFragment)
         }, 2000)*/

        /* Defining the layout components are optional in kotlin after adding the library */

           val button = view.findViewById<Button>(R.id.send_btn)
           val editText1 = view.findViewById<EditText>(R.id.edittext1)
           val editText2 = view.findViewById<EditText>(R.id.edittext2)
           val editText3 = view.findViewById<EditText>(R.id.edittext3)

       /* send_btn.setOnClickListener {
            val bundle = bundleOf("data" to editText1.text.toString())
            navController.navigate(R.id.action_firstFragment_to_secondFragment,bundle)
        }*/

        button.setOnClickListener{
            val firstNameText = editText1.text.toString()
            val MiddleNameText = editText2.text.toString()
            val LastNameText = editText3.text.toString()
            val sendData = SendMyData(firstNameText, MiddleNameText,LastNameText)

            /*
            Send data from From one fragment to another using argument

            val bundle = bundleOf("data" to sendData)
            navController.navigate(R.id.action_firstFragment_to_secondFragment,bundle)*/

            val action= FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            action.myData = sendData
            navController.navigate(action)




        }
    }
}