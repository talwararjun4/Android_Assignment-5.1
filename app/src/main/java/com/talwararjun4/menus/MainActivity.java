package com.talwararjun4.menus;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView textView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textd);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.text_color_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.blueitem:
                textView.setTextColor(Color.BLUE);
                break;

            case R.id.greenitem:
                textView.setTextColor(Color.GREEN);
                break;
            case R.id.yellowitem:
                textView.setTextColor(Color.YELLOW);
                break;

            case R.id.reditem:
                textView.setTextColor(Color.RED);
                break;
default:
    break;

        }
        return true;
    }
}
