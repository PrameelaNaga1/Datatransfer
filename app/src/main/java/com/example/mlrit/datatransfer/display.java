package com.example.mlrit.datatransfer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by mlrit on 6/30/2017.
 */

public class display extends AppCompatActivity {
    protected void onCreate(Bundle savedInstancceState) {
        setContentView(R.layout.display);
        Bundle b =getIntent().getExtras();
        TextView name =(TextView)findViewById(R.id.t1);
        name.setText(b.getCharSequence("name"));

    }

}
