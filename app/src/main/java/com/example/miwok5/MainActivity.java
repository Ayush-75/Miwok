package com.example.miwok5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager=findViewById(R.id.viewPager);
        CategoryAdapter categoryAdapter=new CategoryAdapter(this,getSupportFragmentManager());
        viewPager.setAdapter(categoryAdapter);

        TabLayout tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);




    }


}