package com.iotek.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TelephonyManager mTelephonyManager ;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.tv);

        mTelephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
        int simCarrierId = mTelephonyManager.getSimCarrierId();
        CharSequence simCarrierIdName = mTelephonyManager.getSimCarrierIdName();
        mTextView.setText(simCarrierId + "" + "----" + simCarrierIdName);
    }
}