package com.dilip.kotlin.webview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.dilip.kotlin.R
import kotlinx.android.synthetic.main.activity_webview.*

class webview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        BT_Web.setOnClickListener {
            WebView.webViewClient=MyWebViewClient(this)
            WebView.loadUrl("https://www.javatpoint.com/")

        }


    }
    class MyWebViewClient internal constructor(private val activity:webview):WebViewClient(){

        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            return super.shouldOverrideUrlLoading(view, url)
        }

        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
            return super.shouldOverrideUrlLoading(view, request)
        }

        override fun onReceivedError(view: WebView?, request: WebResourceRequest?, error: WebResourceError?) {
            super.onReceivedError(view, request, error)
        }
    }
}
