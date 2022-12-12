package com.example.lesson7;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Radiobtn#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Radiobtn extends Fragment implements RadioGroup.OnCheckedChangeListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Radiobtn() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Radiobtn.
     */
    // TODO: Rename and change types and number of parameters
    public static Radiobtn newInstance(String param1, String param2) {
        Radiobtn fragment = new Radiobtn();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    RadioGroup delivery;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_radiobtn, container, false);

        delivery = root.findViewById(R.id.delivery);
        delivery.setOnCheckedChangeListener(this);

        return root;
    }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        switch (checkedId) {
            case R.id.same_day:
                Toast toast_same = Toast.makeText(getContext(), "Chosen: Some day messenger service", Toast.LENGTH_SHORT);
                toast_same.show();
                break;

            case R.id.next_day:
                Toast toast_next = Toast.makeText(getContext(), "Choosen: Next day ground delivery", Toast.LENGTH_SHORT);
                toast_next.show();
                break;

            case R.id.pick_up:
                Toast toast_pick = Toast.makeText(getContext(), "Choosen: Pick up", Toast.LENGTH_SHORT);
                toast_pick.show();
                break;
        }
    }
}