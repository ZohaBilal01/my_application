package com.example.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Admin_main_Page extends Fragment {
    ListView listView;
    SearchView searchView;
    ArrayAdapter<String> arrayAdapter;
    String[] adminlistarray = {"ADD Faculty", "ADD STUDENT", "CREATE ACCOUNT", "REGISTERED STUDENT"};

    public Admin_main_Page() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.admin_list, container,false); //R.layout.fragment_adminportal
        listView = (ListView) view.findViewById(R.id.Admin_List);
        arrayAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,adminlistarray);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getContext(),"click item at position:"+position,Toast.LENGTH_SHORT).show();
            }
        });
        return view;

    }
}
