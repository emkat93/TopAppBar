package com.example.topappbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ChildActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)

        // my_child_toolbar is defined in the layout file
        setSupportActionBar(findViewById(R.id.my_child_toolbar))

        // Get a support ActionBar corresponding to this toolbar and enable the Up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}