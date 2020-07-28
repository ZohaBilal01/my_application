package com.example.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class PortalFragement extends Fragment {

    TextView textView_login;
    Button blogin;

public  PortalFragement()
{

}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_portal, container, false);

       blogin = view.findViewById(R.id.buttonLogin);
       blogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {


           }
       });
       return view;
    }
}
