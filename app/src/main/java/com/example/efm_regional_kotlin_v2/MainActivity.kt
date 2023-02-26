package com.example.efm_regional_kotlin_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var edittext: EditText
    lateinit var textview1: TextView
    lateinit var textview2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        edittext = findViewById(R.id.edittext)
        textview1 = findViewById(R.id.textview1)
        textview2 = findViewById(R.id.textview2)

        button.setOnClickListener {
            val stringEnterByUser: String = edittext.text.toString()
            estVideOuBlanche(stringEnterByUser)
            textview2.text = stringEnterByUser.sigle()
        }
    }

    fun estVideOuBlanche(str: String) {
        if (str.isBlank()) {
            textview1.text = "est blanche"
        } else if (str.isEmpty()) {
            textview1.text = "est vide"
        } else {
            textview1.text = "n'est pas vide ou blanche"
        }
    }

    fun String.sigle(): String {
        val mots = this.split(" ").filter { it.isNotBlank() }
        val sigle = StringBuilder()
        for (mot in mots) {
            sigle.append(mot[0].toUpperCase())
        }
        return sigle.toString()
    }
}
