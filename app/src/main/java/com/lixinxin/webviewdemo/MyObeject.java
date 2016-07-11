package com.lixinxin.webviewdemo;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixinxin on 2016/7/11.
 */
class MyObject {
    public static final String TAG = MyObject.class.getSimpleName();
    private Context context;
    private List<Person> data;

    public MyObject(Context context, List<Person> data) {
        this.context = context;
        this.data = data;
    }
    /**
     * 获取person字符串传Html
     *
     * @return
     */
    @JavascriptInterface
    public String getData() {
        Gson gson = new Gson();
        String mData = gson.toJson(data);
        Log.d(TAG, "getData: dddd" + mData);
        return mData;
    }
}
