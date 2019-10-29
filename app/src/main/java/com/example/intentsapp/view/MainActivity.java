package com.example.intentsapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.intentsapp.R;
import com.example.intentsapp.util.Constants;
public class MainActivity extends AppCompatActivity {

    public EditText messageField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageField = findViewById(R.id.main_edit_text);
    }

    public void sendTextButton(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = messageField.getText().toString();
        intent.putExtra(Constants.MESSAGE_KEY, message);
        startActivity(intent);
    }
}
