package com.example.robson.execmba_3.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.robson.execmba_3.StatusUsbActivity;


public class BoradcastUsb extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        String param = "";
        if (intent.getAction().equalsIgnoreCase("android.intent.action.ACTION_POWER_CONNECTED")){
            param = "Usb Conectado";
        }

        if (intent.getAction().equalsIgnoreCase("android.intent.action.ACTION_POWER_DISCONNECTED")){
            param = "Usb Desconectado";
        }

        Intent i = new Intent(context, StatusUsbActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.putExtra("conexao",param);
        context.startActivity(i);

    }
}