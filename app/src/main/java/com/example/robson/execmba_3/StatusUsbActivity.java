package com.example.robson.execmba_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class StatusUsbActivity extends AppCompatActivity {

    private ImageView ivUsb;
    private TextView tvUsb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_usb);

        ivUsb = (ImageView) findViewById(R.id.ivUsb);
        tvUsb = (TextView) findViewById(R.id.tvUsb);

        Bundle status = getIntent().getExtras();
        String conexao = status.getString("conexao");

        tvUsb.setText(conexao);

        if (conexao.contains("Conectado")){
            ivUsb.setImageResource(R.drawable.usb_connected);
        }else {
            ivUsb.setImageResource(R.drawable.usb_isconnected);
        }
    }


}
