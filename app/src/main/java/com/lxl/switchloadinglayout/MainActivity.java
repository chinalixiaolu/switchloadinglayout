package com.lxl.switchloadinglayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Date: 2018年11月7日
 * github: https://github.com/chinalixiaolu/switchloadinglayout
 *
 * @Author: marcus.lee
 * Email: chinalixiaolu@163.com
 * Description:
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        //使用方式
//                DefaultLoadingLayout defaultLayout = SwitchLoadingLayout.createDefaultLayout(this, "目标布局");
//                defaultLayout.onDone();
//                defaultLayout.onEmpty();
//                defaultLayout.onError();
//                defaultLayout.onLoading();
    }
}
