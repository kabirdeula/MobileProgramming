package com.mobileprogramming.fragmentdemo;

import android.os.Bundle;
import android.view.*;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);
        return view;
    }
}
