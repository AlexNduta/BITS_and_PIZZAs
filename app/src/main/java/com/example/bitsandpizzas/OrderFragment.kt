package com.example.bitsandpizzas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.chip.Chip
import com.google.android.material.floatingactionbutton.FloatingActionButton


//@Suppress("UNREACHABLE_CODE")
class OrderFragment :Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        //
        val view = inflater.inflate(R.layout.fragment_order, container, false)
        //Fragments don't include a setSupportActionBar() method
        //we get a refrence to the activity that's displaying the fragment using (activity)
        //we cast that (activity) to an AppcompactActivity to reflect its type and calll its setSupportActionBar() method
        val toolbar = view.findViewById<MaterialToolbar>(R.id.toolbar)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)


        //FAB code
        val fab=view.findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {

            //find ou if a pizza type has been selected
        val pizzaGroup= view.findViewById<RadioGroup>(R.id.pizza_group)
            val pizzaType = pizzaGroup.checkedRadioButtonId

            if (pizzaType == -1){
               //No pizza selcted
                val text= "You need to select a pizza type"
                Toast.makeText(activity,text,Toast.LENGTH_LONG).show()
            }else{
           //Display the order in another message
            }

        }

return view
    }
}
