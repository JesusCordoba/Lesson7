package com.example.lesson7;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Textinp#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Textinp extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Textinp() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Textinp.
     */
    // TODO: Rename and change types and number of parameters
    public static Textinp newInstance(String param1, String param2) {
        Textinp fragment = new Textinp();
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

    EditText texto;
    Spinner opciones;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_textinp, container, false);

        texto = root.findViewById(R.id.EditText);

        opciones = root.findViewById(R.id.spinner_opciones);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(root.getContext(), R.array.opciones, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        opciones.setAdapter(adapter);
        opciones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Fue seleccionado un elemento. Mira position e id
                if (parent.getItemAtPosition(position).toString().equals("Home")) {
                    texto.setText("Home");
                    texto.setInputType(InputType.TYPE_CLASS_TEXT);// InputType.TYPE_CLASS_TEXT
                } else if (parent.getItemAtPosition(position).toString().equals("Work")) {
                    texto.setText("Work");
                    texto.setInputType(InputType.TYPE_CLASS_NUMBER);
                } else if (parent.getItemAtPosition(position).toString().equals("Mobile")) {
                    texto.setText("Mobile");
                    texto.setInputType(InputType.TYPE_CLASS_PHONE);
                } else if (parent.getItemAtPosition(position).toString().equals("Other")) {
                    texto.setText("Other");
                    texto.setInputType(InputType.TYPE_CLASS_DATETIME);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Nada fue seleccionado. Por cierto, no he visto que este método se desencadene
            }


        });
        return root;
    }
}
