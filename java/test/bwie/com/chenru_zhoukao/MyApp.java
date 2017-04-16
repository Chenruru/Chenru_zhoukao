package test.bwie.com.chenru_zhoukao;

import android.app.Application;

import org.xutils.x;

/**
 * date: 2017/4/15
 * author:陈茹
 * 类的用途:
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(false); //输出debug  ，开启会影响性能

    }
}
