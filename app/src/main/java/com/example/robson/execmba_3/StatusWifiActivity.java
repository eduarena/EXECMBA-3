package com.example.robson.execmba_3;

import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class StatusWifiActivity extends AppCompatActivity {

    private ImageView ivWifi;
    private TextView tvConexao;
    BitmapDrawable img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_wifi);

        ivWifi = (ImageView) findViewById(R.id.ivWifi);
        tvConexao = (TextView) findViewById(R.id.tvConexao);

        Bundle status = getIntent().getExtras();
        String conexao = status.getString("conexao");

        tvConexao.setText(conexao);

        if (conexao.contains("Ativo")) {
            ivWifi.setImageResource(R.drawable.wifi_connected);
        }else {
            ivWifi.setImageResource(R.drawable.wifi_disconected);
        }
    }


}
