package com.example.service_092

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var  MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.musik)

        btn_Facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.Facebook.com/langitinspirasi"))
            startActivity(i)

        })

        btn_Instagram.setOnClickListener({
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://www.instagram.com/langitinspirasi.co.id")
            )
            startActivity(i)


        })

            btn_Play.setOnClickListener {
                MediaPlayer?.start()

            }
            btn_Pause.setOnClickListener{
                MediaPlayer?.pause()

            }

            btn_Stop.setOnClickListener{
                MediaPlayer?.pause()
                MediaPlayer?.seekTo(0)
            }

        }
    }
