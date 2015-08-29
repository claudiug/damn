package com.ecratum.de.ecratummobilemvp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import de.ecratum.api.LoginHandler;

public class LoginActivity extends AppCompatActivity {

    LoginHandler loginHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    public void loginOnEcratum(View v) {
        EditText username = (EditText) findViewById(R.id.username_text);
        EditText password = (EditText) findViewById(R.id.password_text);
        loginHandler = new LoginHandler(username.toString(), password.toString());
        if (loginHandler.isUserLogin()) {
            moveToModulesList();
        } else {
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Please Check your username and password", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    private void moveToModulesList() {
        Intent intent = new Intent(this, ModulesActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
