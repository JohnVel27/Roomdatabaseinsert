package com.example.practicing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button button;

    AppDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.firstname);
        editText2 = findViewById(R.id.lastname);
        button = findViewById(R.id.button1);

        db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "Demo.db").build();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = editText1.getText().toString();
                String lastName = editText2.getText().toString();
                new InsertBackgroundTask().execute(new User(firstName, lastName));
            }
        });
    }

    private class InsertBackgroundTask extends AsyncTask<User,Void,Void>{
        @Override
        protected Void doInBackground(User... users) {
            db.userDao().insertAll(users);
            return null;
        }
    }




}
