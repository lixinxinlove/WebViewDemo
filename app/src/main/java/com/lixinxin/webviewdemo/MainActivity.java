package com.lixinxin.webviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Person> mlist = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            mlist.add(new Person("王亚军"+i,i+"","com"+i));
        }
        webView= (WebView) findViewById(R.id.webView);
        WebSettings settings = webView.getSettings();
        //调用WebView关联的WebSettings中setJavaScriptEnable(true)方法。
        settings.setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/index.html");
        //调用WebView关联的WebSettings中addJavaScriptInterface
        webView.addJavascriptInterface(new MyObject(this,mlist),"lxx");
    }
}
