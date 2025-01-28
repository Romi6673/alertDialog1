package com.example.demo250127;

import android.os.Bundle;

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

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
/**
 * ActivityCredits is an activity that displays the credits information.
 * It shows the names of the developers and any other relevant credits.
 */
public class activityCredits extends AppCompatActivity {
    /**
     * Called when the activity is first created.
     * Initializes the activity, sets the content view, and configures edge-to-edge display.
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *                           previously being shut down then this Bundle contains the data it most
     *                           recently supplied in {@link #onSaveInstanceState}.
     *                           <b><i>Note: Otherwise it is null.</i></b>
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_credits);

        Intent gi = getIntent();

    }

    /**
     * Navigates to the main activity.
     *
     * @param view The view that triggered this method (e.g., a button).
     */
    public void go(View view) {
        Intent pi=new Intent(this,MainActivity.class);
        startActivity(pi);

    }
}