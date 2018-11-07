package com.example.mahmudinm.uts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Mahmudinm on 07/11/2018.
 */

public class FirstFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.first_fragment, container, false);
//        2S - 9R - 8M -> S,R,M
        final EditText nilaiS = (EditText) rootView.findViewById(R.id.nilaiS);
        final EditText nilaiR = (EditText) rootView.findViewById(R.id.nilaiR);
        final EditText nilaiM = (EditText) rootView.findViewById(R.id.nilaiM);
        final EditText hasil = (EditText) rootView.findViewById(R.id.hasil);


        Button button = (Button) rootView.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double S, R, M;

                if (nilaiS.getText().toString().isEmpty()) {
                    S = 0 ;
                } else {
                    S = Double.valueOf(nilaiS.getText().toString());
                }

                if (nilaiR.getText().toString().isEmpty()) {
                    R = 0 ;
                } else {
                    R = Double.valueOf(nilaiR.getText().toString());
                }

                if (nilaiM.getText().toString().isEmpty()) {
                    M = 0 ;
                } else {
                    M = Double.valueOf(nilaiM.getText().toString());
                }

                hasil.setText(String.valueOf((2 * S) - (9 * R) - (8 * M)));
            }
        });

        return rootView;

    }

}
