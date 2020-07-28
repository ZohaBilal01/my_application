package com.example.navigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {                                              //toolbaar + nav drawer
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar); //ye tumhara wal open hy app pr... heheh acha //nhi ja rha..
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);                                              //(1. drawerlayout)
        NavigationView navigationView = findViewById(R.id.nav_view);                                 //navigation view item selection
        navigationView.setNavigationItemSelectedListener(this);                                        //navigation view item selection

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);                                 //(1.drawer working)
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if(savedInstanceState== null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new HomeFragement()).commit();                      //it must appear before we open/click any item
            navigationView.setCheckedItem(R.id.Home);
        }



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {                           //navigation view item selection
        {
            switch (menuItem.getItemId()) {
                case R.id.Home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            new HomeFragement()).commit();
                    break;
                case R.id.About_Us:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            new AboutusFragement()).commit();
                    break;
                case R.id.Search_Projects:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            new SearchProjectsFragement()).commit();
                    break;
                case R.id.Contact_Us:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            new ContactusFragement()).commit();
                    break;
                case R.id.Portal:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            new PortalFragement()).commit();
                    break;
                case R.id.Signup:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            new SignupFragment()).commit();
                    break;

                 case R.id.admin_add_faculty:        //admin list pr click kryga to ayega.. wesy hatana hy..
                   getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            new Admin_addfaculty_Fragment()).commit();
                    break;

//                case R.id.admin_faculty_Details:        //faculty details jb data enter hoga tb
//                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
//                            new Admin_addfaculty_Fragment()).commit();
//                    break;

//                case R.id.amin_mainpage:
//                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
//                            new Admin_main_Page()).commit();
//                    break;
                case R.id.admin_navlist:        //admin list pr click kiya to click likha arha mgr page open nhi hoga.
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            new AdminFragement()).commit();
                    break;
                case R.id.student_navlist:        //admin list pr click kiya to click likha arha mgr page open nhi hoga.
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            new StudentFragement()).commit();
                    break;

            }
            drawerLayout.closeDrawer(GravityCompat.START);

        }
        return true; //true: bcz when item selected it trigers
    }

    public void onBackPressed()                                                                      //toolbaar + nav drawer
    {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }

    }
}