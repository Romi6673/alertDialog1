package com.example.demo250127;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import java.util.Random;


import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static android.icu.util.MeasureUnit.Complexity.SINGLE;
import static android.media.MediaCodec.MetricsConstants.MODE;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import android.content.Intent;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Button;
import android.widget.Toast;

import android.widget.Switch;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.navigation.NavigationBarView;


import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/**
 * MainActivity is the main activity of the application.
 * It handles button clicks and displays alerts.
 */
public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;

    Intent si;

    AlertDialog.Builder adb;
    Random random = new Random();


    int colorNum;

    /**
     * Called when the activity is first created.
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *                           previously being shut down then this Bundle contains the data it most
     *                           recently supplied in {@link #onSaveInstanceState}.  <b><i>Note: Otherwise it is null.</i></b>
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);

        adb=new AlertDialog.Builder(this);


    }

    /**
     * Handles the click event for btn2.
     * Displays an alert dialog with a message and an icon.
     *
     * @param view The view that was clicked.
     */
    public void OnClickBtn2(View view) {

        adb = new AlertDialog.Builder(this);



        adb.setTitle("Alert");
        adb.setMessage("btn2 clicked");
        adb.setIcon(R.drawable.hellokitty);
        AlertDialog ad = adb.create();

        ad.show();
    }

    /**
     * Handles the click event for btn1.
     * Displays an alert dialog with a message.
     *
     * @param view The view that was clicked.
     */
    public void OnClickBtn1(View view) {
        adb = new AlertDialog.Builder(this);



        adb.setTitle("Alert");
        adb.setMessage("btn1 clicked");
        AlertDialog ad = adb.create();

        ad.show();


    }

    /**
     * Handles the click event for btn4.
     * Displays an alert dialog with options to change the background color or close the dialog.
     *
     * @param view The view that was clicked.
     */
    public void OnClickBtn4(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Alert!");
        adb.setMessage("btn4 clicked");
        adb.setCancelable(false);

        adb.setPositiveButton("change", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int i)
            {

                colorNum = Color.rgb(random.nextInt(256),
                        random.nextInt(256),
                        random.nextInt(256));
                getWindow().getDecorView().setBackgroundColor(colorNum);
            }
        });

        adb.setNeutralButton("close", new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int i)
            {
                dialog.cancel();
            }
        });

        AlertDialog ad = adb.create();
        ad.show();
    }


    /**
     * Handles the click event for btn3.
     * Displays an alert dialog with a message and an icon, and a close button.
     *
     * @param view The view that was clicked.
     */
    public void OnClickBtn3(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Alert");
        adb.setMessage("btn3 clicked");


        adb.setIcon(R.drawable.hellokitty);
        adb.setCancelable(false);

        adb.setNeutralButton("close", new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int i)
            {
                dialog.cancel();
            }
        });

        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
     * Handles the click event for btn5.
     * Displays an alert dialog with options to change the background color, reset it to white, or close the dialog.
     *
     * @param view The view that was clicked.
     */
    public void OnClickBtn5(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Alert!");
        adb.setMessage("btn5 clicked");
        adb.setCancelable(false);

        adb.setPositiveButton("change", new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int i)
            {

                colorNum = Color.rgb(random.nextInt(256),
                        random.nextInt(256),
                        random.nextInt(256));
                getWindow().getDecorView().setBackgroundColor(colorNum);
            }
        });

        adb.setNeutralButton("close", new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int i)
            {
                dialog.cancel();
            }
        });

        adb.setNegativeButton("reset", new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int i)
            {
                getWindow().getDecorView().setBackgroundColor(Color.WHITE);
            }
        });

        AlertDialog ad = adb.create();
        ad.show();

    }

    /**
     * Navigates to the Credits activity.
     *
     * @param view The view that triggered this method (e.g., a button).
     */

    public void go(View view) {
        si = new Intent(this,activityCredits.class);

        startActivity(si);

    }
}