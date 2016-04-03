package com.androidnanodegree.cr.mylibrary;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private static final String newJoke = "com.androidnanodegree.cr.NEW_JOKE";

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.joke_fragment_main, container, false);

        Intent intent = getActivity().getIntent();
        TextView textView = (TextView) rootView.findViewById(R.id.joke_text_view);
        textView.setText(intent.getStringExtra(newJoke));

        return rootView;
    }
}
