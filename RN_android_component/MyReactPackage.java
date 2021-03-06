package com.RN0405;

import com.RN0405.NativeModules.MyToastAndroid.MyToastAndroid;
import com.RN0405.ViewManagers.GestureLockViewManager;
import com.RN0405.ViewManagers.MyTextViewManager;
import com.RN0405.ViewManagers.PieChartViewManager;
import com.RN0405.ViewManagers.PieChartViewManager2;
import com.caimi.testnativeout.TestNativeOut;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyReactPackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Arrays.<NativeModule>asList(
                new MyToastAndroid(reactContext),
                new TestNativeOut(reactContext)
        );
    }


    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Arrays.<ViewManager>asList(
                new PieChartViewManager(),
                new MyTextViewManager(),
                new GestureLockViewManager()
        );
    }
}
