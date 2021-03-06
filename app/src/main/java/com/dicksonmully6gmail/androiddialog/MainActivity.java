package com.dicksonmully6gmail.androiddialog;

import android.app.FragmentManager;
import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Bind(R.id.moodButton) Button mDialogButton;
    @Bind(R.id.callButton) Button mCallButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mDialogButton.setOnClickListener(this);
        mCallButton.setOnClickListener(this);
    }
    @Override
    public  void onClick(View v) {
        if(v == mDialogButton) {
            FragmentManager fm = getFragmentManager();
            MoodDialogFragment moodDialogFragment = new MoodDialogFragment ();
            moodDialogFragment.show(fm, "Sample Fragment");
        }else if (v == mCallButton) {
            try {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:0723844166"));
                startActivity(intent);
            }catch (SecurityException e) {
                System.out.println("Not allowed " + e.getMessage());
            }
        }
    }


}
