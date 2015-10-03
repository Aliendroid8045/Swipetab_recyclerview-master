package koshik.SwipeTravel;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import koshik.travelove.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {
   


    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_a, container, false);

        return v;
    }


}
