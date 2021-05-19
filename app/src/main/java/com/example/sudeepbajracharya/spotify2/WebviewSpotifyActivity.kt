package com.example.sudeepbajracharya.spotify2

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class WebviewSpotifyActivity : AppCompatActivity() {
//    var webURL: String = "https://open.spotify.com/playlist/5QhCSa1JDnWWP7IUi1yPRd"
    var webURL: String = "https://www.youtube.com/"
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview_spotify)

        webView = findViewById<WebView>(R.id.webView)
        webView.settings.javaScriptEnabled = true

        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        webView.loadUrl(webURL)

    }
}