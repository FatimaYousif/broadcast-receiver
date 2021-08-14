package com.example.broadcast_receiver;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastReceiver extends android.content.BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "broadcast reciver received", Toast.LENGTH_LONG).show();
    }
}
