package edu.cqut.cn.shareelementtransition;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button btn;
    private TextView mTextView;
    private ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mTextView = (TextView) findViewById(R.id.textview);
        mImageView = (ImageView) findViewById(R.id.imageview);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,secondActivity.class);
                Pair pair = Pair.create(mTextView,ViewCompat.getTransitionName(mTextView));
                Pair pair1 = Pair.create(mImageView,ViewCompat.getTransitionName(mImageView));
                ActivityOptionsCompat transitionActivityOptions = ActivityOptionsCompat
                        .makeSceneTransitionAnimation(MainActivity.this, pair,pair1);
                startActivity(i, transitionActivityOptions.toBundle());

            }
        });



    }
}
