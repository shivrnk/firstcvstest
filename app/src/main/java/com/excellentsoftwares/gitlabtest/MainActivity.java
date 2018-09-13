package com.excellentsoftwares.gitlabtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LCMHCF Example","Please Wait..");
        LCMHCF();

    }
    public void LCMHCF()
    {
        int a, b, x, y, t, hcf, lcm;

        x = 6;
        y = 10;

        a = x;
        b = y;

        while (b != 0)
        {
            t = b;
            Log.e("t = b",Integer.toString(t));
            b = a % b;
            Log.e("a % b",Integer.toString(b));
            a = t;
            Log.e("a = t",Integer.toString(a));


        }

        hcf = a;
        lcm = (x * y) / hcf;

        System.out.print("HCF and LCM of : " + x + " and " + y + " is :\n");
        System.out.print("HCF = " + hcf);
        System.out.print("\nLCM = " + lcm);
        Toast.makeText(MainActivity.this,"HCF = " + hcf,Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,"\nLCM = " + lcm,Toast.LENGTH_SHORT).show();
    }
    public  void Palindrome(){
        String a, b = "";

        a = "NeveroddorEVen";
        int n = a.length();
        for(int i = n-1 ; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}

