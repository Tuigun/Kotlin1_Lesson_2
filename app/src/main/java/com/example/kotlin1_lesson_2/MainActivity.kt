package com.example.kotlin1_lesson_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin1_lesson_2.databinding.ActivityMainBinding
import com.example.kotlin1_lesson_2.extensions.load
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val image = mutableListOf(
        "https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__480.jpg",
        "https://p4.wallpaperbetter.com/wallpaper/39/346/426/digital-art-men-city-futuristic-night-hd-wallpaper-thumb.jpg",
        "https://c4.wallpaperflare.com/wallpaper/410/867/750/vector-forest-sunset-forest-sunset-forest-wallpaper-thumb.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTAt8K4K1vYA_RbixL3ODgQq_WB80tHMCEow&usqp=CAU",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYL6nIvJP72d-YQO2iUXcwZfh8875iKYUyTg&usqp=CAU"
    )

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener{
            image.add(binding.edText.text.toString())
        }
        binding.randomBtn.setOnClickListener{
            binding.im1.load(image[Random.nextInt(image.size)])
        }

    }
}

