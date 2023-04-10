package com.example.flutter_application_1

import android.content.Context
import android.widget.Toast
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugins.MessageApi

class MainActivity : FlutterActivity() {

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        MessageApi.setUp(flutterEngine.dartExecutor.binaryMessenger, MyToastMessage(applicationContext)
        )
    }

    private class MyToastMessage(applicationContext: Context) : MessageApi {
        var context = applicationContext
        override fun toastMessage(message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}