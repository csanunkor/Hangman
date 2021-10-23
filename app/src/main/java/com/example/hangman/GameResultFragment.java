package com.example.hangman;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class GameResultFragment extends Fragment {
    private TextView gameResultTV;
    private float ourFontsize = 50f;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState ) {
        setUpFragmentGui( container );
        return super.onCreateView( inflater, container,
                savedInstanceState );
    }
    public void setUpFragmentGui( ViewGroup container ) {
        if( gameResultTV == null ) {
            gameResultTV = new TextView(getActivity());
            gameResultTV.setGravity( Gravity.CENTER );
            gameResultTV.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize);
            container.addView( gameResultTV );
        }
    }

    public void onStart( ) {
        super.onStart( );
        gameResultTV.setText("GOOD LUCK");
    }
    public void setResult( String result ) {
        gameResultTV.setText( result );
    }
}
