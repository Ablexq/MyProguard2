package com.xq.myproguard2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.xq.myproguard2.bean.res.User;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    private User mUser;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "===========1================");
        mUser = new User("xq", 118);
        Log.e(TAG, "============2===============");
        System.out.println("===========3==========");
    }

    @Override
    public void onClick(View v) {
        System.out.println("===========4==========");
    }
}
