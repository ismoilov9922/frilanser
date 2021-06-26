package uz.pdp.frilanser.spash_screen

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import uz.pdp.frilanser.MainActivity
import uz.pdp.frilanser.databinding.ActivitySplashBinding
import java.util.concurrent.Executors

class SplashActivity : AppCompatActivity() {

    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Executors.newSingleThreadExecutor().execute {
            Thread.sleep(2000)
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }

    override fun onStart() {
        super.onStart()
        MainActivity().actionBar?.hide()
    }

    override fun onDestroy() {
        super.onDestroy()
        MainActivity().actionBar?.show()
    }
}