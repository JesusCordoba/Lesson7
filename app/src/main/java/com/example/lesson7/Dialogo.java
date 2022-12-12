package com.example.lesson7;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;

public class Dialogo extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.dialog_title) // Titulo del dialog
                .setPositiveButton(R.string.time, new DialogInterface.OnClickListener() { // Crear boton positivo
                    public void onClick(DialogInterface dialog, int id) {
                        // Mandar el evento del boton positivo a la actividad que lo implementara
                        TimePickerFragment tp = new TimePickerFragment();
                        tp.show(getParentFragmentManager(),"DIALOG_TIME");
                    }
                })
                .setNegativeButton(R.string.date, new DialogInterface.OnClickListener() { // Crear boton negativo
                    public void onClick(DialogInterface dialog, int id) {
                        // Mandar el evento del boton negativo a la actividad que lo implementara
                        DatePickerFragment dp = new DatePickerFragment();
                        dp.show(getParentFragmentManager(),"DIALOG_DATE");
                    }
                });
        return builder.create();
    }

}
