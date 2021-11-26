package com.example.task41;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity /*implements AdapterView.OnItemSelectedListener*/ {

    //DATA / TIME ACTIVITY (The XMLs changes for each Activity of task41) :

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDatePickerDialog(View view) {

        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));
    }

    public void onCLickShowTimePickerDialog(View view) {

        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.time_picker));
    }

    public void processDatePickerResult(int year, int month, int day) {

        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);

        //Concatenates strings
        String dateMessage = (month_string + "/" + day_string + "/" + year_string);

        Toast.makeText(this, getString(R.string.Date) + dateMessage, Toast.LENGTH_SHORT).show();

    }

    public void processTimePickerResult(int hourOfDay, int minute) {

        //Time elements into strings.
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);

        //Concatenates strings
        String timeMessage = (hour_string + ":" + minute_string);

        Toast.makeText(this, getString(R.string.Time) + timeMessage, Toast.LENGTH_SHORT).show();

    }

    /* PHONE ACTIVITY (The XMLs changes for each Activity of task41) :

    private static final String TAG = MainActivity.class.getSimpleName();
    private String mSpinnerLabel = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create spinner
        Spinner spinner = (Spinner) findViewById(R.id.label_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        //Create ArrayAdapter using the string array and default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);

        //Detail the layout to use when the list of choices appears.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Place the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }

    }

    /**
     * Method that which retrieves the information entered into the EditText element and shows it in a toast message.
     * @param view
     */
    /*public void showText (View view) {

        EditText editText = (EditText) findViewById(R.id.main_edit_text);

        if (editText != null) {

            String showString = (editText.getText().toString() + " - " + mSpinnerLabel);
            TextView phoneNumberResult = (TextView) findViewById(R.id.text_phone_label);
            if (phoneNumberResult != null) phoneNumberResult.setText(showString);

        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        mSpinnerLabel = adapterView.getItemAtPosition(i).toString();
        showText(view);
        
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

        Log.d(TAG, "onNothingSelected: ");
        
    }*/
}