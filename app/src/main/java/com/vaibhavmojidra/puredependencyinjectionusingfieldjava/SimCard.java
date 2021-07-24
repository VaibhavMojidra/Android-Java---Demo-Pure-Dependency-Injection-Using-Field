package com.vaibhavmojidra.puredependencyinjectionusingfieldjava;

import android.util.Log;

public class SimCard {
    public ServiceProvider serviceProvider;
    void getConnected(){
        serviceProvider.getService();
        Log.i("MyInfo","Network is available");
    }
}
