package net.ronakp.apolloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DashBoard extends AppCompatActivity {
    private FirebaseDatabase mDatabase;
    private DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        ref = FirebaseDatabase.getInstance().getReference();
        ref.child("user13").setValue("hello");
       /* mDatabase = FirebaseDatabase.getInstance();
        ref = mDatabase.getReference("data");
        ref.setValue("1");*/
    }
}
