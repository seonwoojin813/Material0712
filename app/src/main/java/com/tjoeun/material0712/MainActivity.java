package com.tjoeun.material0712;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3;
    LinearLayout mainContainer;

    FragmentManager manager;

    OneFragment oneFragment;
    TwoFragment twoFragment;
    ThreeFragment threeFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.listfragment);
        btn2 = (Button)findViewById(R.id.dialogfragment);
        btn3 = (Button)findViewById(R.id.fragment);

        mainContainer = (LinearLayout)findViewById(R.id.main_container);

        manager = getSupportFragmentManager();
        oneFragment = new OneFragment();
        twoFragment = new TwoFragment();
        threeFragment = new ThreeFragment();

        //첫번째 화면 만들기
        FragmentTransaction tf = manager.beginTransaction();
        tf.addToBackStack(null);
        tf.add(R.id.main_container, oneFragment);
        tf.commit();

        //버튼 클릭 이벤트 처리
        btn1.setOnClickListener((view)->{
            if(!oneFragment.isVisible()){
                FragmentTransaction tf1 = manager.beginTransaction();
                tf1.addToBackStack(null);
                tf1.replace(R.id.main_container, oneFragment);
                tf1.commit();
            }
        });
        btn2.setOnClickListener((view)->{
            if(!twoFragment.isVisible()){
                /*
                FragmentTransaction tf1 = manager.beginTransaction();
                tf1.addToBackStack(null);
                tf1.add(R.id.main_container, twoFragment);
                tf1.commit();
                */
                twoFragment.show(manager, null);
            }
        });
        btn3.setOnClickListener((view)->{
            if(!threeFragment.isVisible()){
                Log.e("프로그먼트 출력", "333");
                FragmentTransaction tf1 = manager.beginTransaction();
                tf1.addToBackStack(null);
                tf1.replace(R.id.main_container, threeFragment);
                tf1.commit();
            }
        });

    }
}
