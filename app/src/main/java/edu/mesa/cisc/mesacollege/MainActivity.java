package edu.mesa.cisc.mesacollege;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mesaButton;
    Button callButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mesaButton = (Button) findViewById(R.id.buttonMesa);
        mesaButton.setOnClickListener(this);

        callButton = (Button) findViewById(R.id.buttonCall);
        callButton.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.buttonMesa:
                Intent mesaIntent = new Intent(this, MesaActivity.class);
                startActivity(mesaIntent);
                break;

            case R.id.buttonCall:
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:6193882600"));
                startActivity(callIntent);
                break;
        }
    }
}
