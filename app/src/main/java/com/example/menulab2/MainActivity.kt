package com.example.menulab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.util.ArrayList
import java.util.logging.Logger.global

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prueba)
        val swish = findViewById<Button>(R.id.NewEntreno)
        val listView =findViewById<ListView>(R.id.dynamic);
        swish.setOnClickListener{
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }
        val eliminate = findViewById<Button>(R.id.Eliminate)
        val lapHistory: ArrayList<Int> = ArrayList<Int>()

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lapHistory)
        listView.setAdapter(adapter);
        listView.onItemClickListener = object : AdapterView.OnItemClickListener {

            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                // ListView Clicked item index
                lapHistory.remove(position)

                Toast.makeText(
                    applicationContext,
                    "Se borro Position :$position  ", Toast.LENGTH_LONG
                )
                    .show()

            }
        }
        eliminate.setOnClickListener{
            lapHistory.clear()
            Toast.makeText(
                applicationContext,
                "Se borro el historial", Toast.LENGTH_LONG
            )
                .show()
        }

    }
}
