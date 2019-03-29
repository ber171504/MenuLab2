package com.example.menulab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.util.ArrayList
import android.widget.Toast
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener



class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit)
        val back = findViewById<Button>(R.id.Back)
        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val listView =findViewById<ListView>(R.id.ListaPre);
        val num = findViewById<TextView>(R.id.contador)
        val add = findViewById<Button>(R.id.add)

        val predeter = ArrayList<Int>()
        predeter.add(1)
        predeter.add(3)
        predeter.add(5)
        var counter = 0
        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            predeter)
        listView.setAdapter(adapter);
        listView.onItemClickListener = object : OnItemClickListener {

            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                // ListView Clicked item index

                // ListView Clicked item value
                val itemValue = listView.getItemAtPosition(position) as Int
                counter = itemValue
                num.text = Integer.toString(counter)

                // Show Alert
                Toast.makeText(
                    applicationContext,
                    "Position :$position  ListItem : $itemValue", Toast.LENGTH_LONG
                )
                    .show()

            }

        }
        add.setOnClickListener{
            counter ++
            num.text = Integer.toString(counter)
        }
        val res = findViewById<Button>(R.id.less)
        res.setOnClickListener{
            counter --
            num.text = Integer.toString(counter)
        }
        val crear = findViewById<Button>(R.id.create)
        crear.setOnClickListener{
            //agregar cosas a laps
        }
}
}
