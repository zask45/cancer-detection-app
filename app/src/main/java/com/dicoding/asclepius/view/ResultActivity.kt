package com.dicoding.asclepius.view

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.asclepius.R
import com.dicoding.asclepius.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_URI = "extra-uri"
        const val EXTRA_RESULT = "extra-result"
    }

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageUri = Uri.parse(intent.getStringExtra(EXTRA_URI))
        val result = intent.getStringExtra(EXTRA_RESULT)

        binding.resultImage.setImageURI(imageUri)
        binding.resultText.text = result

        onBackIconPressed()

    }

    private fun onBackIconPressed() {
        binding.appBar.setNavigationOnClickListener {
            this.finish()
        }
    }


}