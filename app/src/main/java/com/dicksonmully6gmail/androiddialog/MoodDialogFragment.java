package com.dicksonmully6gmail.androiddialog;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by dickson on 5/25/17.
 */

public class MoodDialogFragment extends DialogFragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mood_dialog, container, false);
        getDialog().setTitle("Simple Dialog");

        Button cancelButton = (Button) rootView.findViewById(R.id.cancelButton);
        Button submitbutton = (Button) rootView.findViewById(R.id.submitButton);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return rootView;

    }


}
