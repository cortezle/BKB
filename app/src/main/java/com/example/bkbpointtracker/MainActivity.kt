package com.example.bkbpointtracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.bkbpointtracker.databinding.ActivityMainBinding
import com.example.bkbpointtracker.ScoreViewModel



class MainActivity : AppCompatActivity() {

    lateinit var scoreViewModel: ScoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scoreViewModel= ViewModelProviders.of(this)
            .get(ScoreViewModel::class.java)

        DataBindingUtil.setContentView<ActivityMainBinding>(
            this,R.layout.activity_main
        ).apply {
            this.setLifecycleOwner(this@MainActivity)
            this.score = scoreViewModel
        }
    }




}
