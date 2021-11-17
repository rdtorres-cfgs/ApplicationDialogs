package com.example.applicationdialogs;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity
        implements FireMissilesDialogFragment.NoticeDialogListener {

    private TextView vista2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vista2 = (TextView) findViewById(R.id.Texto);
    }

    public void verDialog(View view) {
        // Create an instance of the dialog fragment and show it
        DialogFragment dialog = new FireMissilesDialogFragment();
        dialog.show(getSupportFragmentManager(), "NoticeDialogFragment");
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog) {
        // User touched the dialog's positive button
        vista2.setText(R.string.PositiveButtonString);

    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {
        // User touched the dialog's negative button
        vista2.setText(R.string.NegativeButtonString);

    }
}
