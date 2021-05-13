package com.example.projectsamsung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.FragmentManagerNonConfig;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        StartFragment startfragment=new StartFragment();
        fragmentTransaction.add(R.id.main,startfragment);
        fragmentTransaction.commit();

    }
    public void createChooseFragment(StartFragment startFragment)
    {
        FragmentManager fragmentManager=getSupportFragmentManager();
        ChooseFragment chooseFragment=new ChooseFragment();
        fragmentManager.beginTransaction().add(R.id.main,chooseFragment).hide(startFragment).commit();
    }
}