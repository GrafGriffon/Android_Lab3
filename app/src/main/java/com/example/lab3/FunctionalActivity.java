package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class FunctionalActivity extends AppCompatActivity {

    FirebaseUser currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getIntent().getExtras();
        currentUser = (FirebaseUser) arguments.get("current_user");
        setContentView(R.layout.activity_functional);
    }



    public void toPager(View view) {
        Intent intent = new Intent(this, BookActivity.class);
        startActivity(intent);
    }

    public void toProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("current_user", currentUser);
        startActivity(intent);
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toDev(View view) {
        Intent intent = new Intent(this, DeveloperActivity.class);
        startActivity(intent);
    }

    public void toSmile1(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("current_user", currentUser);
        startActivity(intent);
    }
    public void toSmile2(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("current_user", currentUser);
        startActivity(intent);
    }
    public void toSmile3(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("current_user", currentUser);
        startActivity(intent);
    }
    public void toSmile4(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("current_user", currentUser);
        startActivity(intent);
    }
}