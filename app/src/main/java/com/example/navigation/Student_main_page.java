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

public class Student_main_page extends Fragment {
    ListView listView1;
    SearchView searchView;
    ArrayAdapter<String> arrayAdapter1;
    String[] Studentlistarray = {"Create Account", "Proposal", "Phase1", "Phase2","Grade","Chat"};

    public Student_main_page() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.student_list, container,false); //R.layout.fragment_adminportal
        listView1 = (ListView) view.findViewById(R.id.Student_List);
        arrayAdapter1 = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,Studentlistarray);
        listView1.setAdapter(arrayAdapter1);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getContext(),"click item at position:"+position,Toast.LENGTH_SHORT).show();
            }
        });
        return view;

    }
}
