package com.example.shapeofnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numberButtonClicked(View view) {

        EditText enteredNumber = findViewById(R.id.numberEntered);
        int number=0;
        try {
            number = (int)Double.parseDouble(enteredNumber.getText().toString());
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_LONG).show();
        }

        NumberShape numberShape = new NumberShape(number);
        String message ="hi";

        if (numberShape.isTriangularNumber() && numberShape.isSquareNumber()) {
            message = "Number is both Triangular and Square";

        } else if (numberShape.isTriangularNumber() ) {
            message = "Number is just Triangular";

        }else if (numberShape.isSquareNumber()) {
            message = "Number is just Square";

        }else  {
            message = "Number is neither Triangular nor Square";
        }


        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();

    }
}
