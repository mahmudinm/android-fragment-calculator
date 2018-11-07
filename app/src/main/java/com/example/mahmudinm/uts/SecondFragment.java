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

public class SecondFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        final View rootView = inflater.inflate(R.layout.second_fragment, container, false);
//        2S - 9R - 8M -> S,R,M
        final EditText nilaiA = (EditText) rootView.findViewById(R.id.nilaiA);
        final EditText nilaiB = (EditText) rootView.findViewById(R.id.nilaiB);
        final EditText nilaiC = (EditText) rootView.findViewById(R.id.nilaiC);
        final EditText hasil = (EditText) rootView.findViewById(R.id.hasil);


        Button button = (Button) rootView.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double A, B, C;

                if (nilaiA.getText().toString().isEmpty()) {
                    A = 0 ;
                } else {
                    A = Double.valueOf(nilaiA.getText().toString());
                }

                if (nilaiB.getText().toString().isEmpty()) {
                    B = 0 ;
                } else {
                    B = Double.valueOf(nilaiB.getText().toString());
                }

                if (nilaiC.getText().toString().isEmpty()) {
                    C = 0 ;
                } else {
                    C = Double.valueOf(nilaiC.getText().toString());
                }

                hasil.setText(String.valueOf((4 * B) - (22 * A * C) - (4)));
            }
        });

        return rootView;

    }

}
