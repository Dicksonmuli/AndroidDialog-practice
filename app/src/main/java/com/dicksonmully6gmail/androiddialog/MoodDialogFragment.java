package com.dicksonmully6gmail.androiddialog;

import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by dickson on 5/25/17.
 */

public class MoodDialogFragment extends DialogFragment {

//    public void onRadioButtonClicked(View view) {
//        // Is the button now checked?
//        boolean checked = ((RadioButton) view).isChecked();
//
//        // Check which radio button was clicked
//        switch(view.getId()) {
//            case R.id.radioButton1:
//                if (checked)
//                    dismiss();
//                    break;
//            case R.id.radioButton2:
//                if (checked)
//                    // Ninjas rule
//                    break;
//        }
//    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mood_dialog, container, false);
        getDialog().setTitle("Simple Dialog");

        Button cancelButton = (Button) rootView.findViewById(R.id.cancelButton);
        Button submitButton = (Button) rootView.findViewById(R.id.submitButton);

        RadioGroup surveyRadioGroup = (RadioGroup) rootView.findViewById(R.id.moodRadioGroup); //pull group
        final int selectedId = surveyRadioGroup.getCheckedRadioButtonId(); //get selected ID
        final RadioButton selectedRadioButton = (RadioButton) rootView.findViewById(selectedId); //get r button val via ID

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("testing", selectedRadioButton.getText().toString());
//                View radioButton = selectedRadioButton.findViewById(selectedId);
//                Toast.makeText(getApplicationContext(), "Your mood is " + radioButton).show();

                // Add logic here

                dismiss();
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return rootView;



    }


}
