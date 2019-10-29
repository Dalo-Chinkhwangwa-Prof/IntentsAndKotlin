package com.example.intentsapp.view

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.intentsapp.R
import com.example.intentsapp.util.Constants
import kotlinx.android.synthetic.main.activity_2.*

class SecondActivity : AppCompatActivity() {

    //    final int x = 2;
    val x: Int = 2

    var myArray: MutableList<String> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        for (i in 0 until 10) {
            Log.d("TAG_X", "${i}")
        }


        //Java
//        Intent intent = this.getIntent();
//        if(intent != null){
//            String myText = intent.getStringExtra(Constants.MESSAGE_KEY);
//            Toast.makeText(this, myText, Toast.LENGTH_LONG).show();
//        }


        intent
                ?.getStringExtra(Constants.MESSAGE_KEY)
                ?.let { message ->

                    Toast.makeText(this, message, Toast.LENGTH_LONG).show();

                    my_textview.text = message

                    my_textview.setOnClickListener { _ ->
                        Toast.makeText(this, "I was clicked", Toast.LENGTH_LONG).show();
                    }
                }
    }
}

