package com.example.lesson7;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Dessert#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Dessert extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Dessert() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Dessert.
     */
    // TODO: Rename and change types and number of parameters
    public static Dessert newInstance(String param1, String param2) {
        Dessert fragment = new Dessert();
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

    LinearLayout donut_ly;
    LinearLayout icecream_ly;
    LinearLayout froyo_ly;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_dessert, container, false);

        donut_ly = root.findViewById(R.id.donut_ly);
        donut_ly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(root.getContext(), "You order an donut", Toast.LENGTH_SHORT);
                toast.show();
                Radiobtn f_radio= new Radiobtn();
                FragmentManager fragmentManager = getParentFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.contenedor, f_radio);
                transaction.commit();
            }
        });

        icecream_ly = root.findViewById(R.id.icecream_ly);
        icecream_ly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(root.getContext(), "You order an ice cream sandwich", Toast.LENGTH_SHORT);
                toast.show();
                Radiobtn f_radio= new Radiobtn();
                FragmentManager fragmentManager = getParentFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.contenedor, f_radio);
                transaction.commit();
            }
        });

        froyo_ly = root.findViewById(R.id.froyo_ly);
        froyo_ly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(root.getContext(), "You order an froyo", Toast.LENGTH_SHORT);
                toast.show();
                Radiobtn f_radio= new Radiobtn();
                FragmentManager fragmentManager = getParentFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.contenedor, f_radio);
                transaction.commit();
            }
        });

        return root;
    }
}