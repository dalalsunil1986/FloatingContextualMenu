package com.example.sriyanksiddhartha.floatingcontextualmenu;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        registerForContextMenu(button);

    }


    // Inflate The Floating context menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.floating_context_menu, menu);

    }

    // Method called when any menu item is clicked.
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:

                Toast.makeText(this, "Settings Clicked ", Toast.LENGTH_SHORT).show();


                return true;
            case R.id.action_cancel:
                Toast.makeText(this, "Cancel Clicked ", Toast.LENGTH_SHORT).show();

                return true;
            case R.id.action_edit:
                Toast.makeText(getApplicationContext(), "Edit Clicked ",
                        Toast.LENGTH_SHORT).show();

                return true;
            case R.id.action_exit:
                Toast.makeText(getApplicationContext(), "Exit Clicked ",
                        Toast.LENGTH_SHORT).show();

                return true;
            case R.id.action_logout:
                Toast.makeText(getApplicationContext(), "Logout Clicked ",
                        Toast.LENGTH_SHORT).show();

                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
