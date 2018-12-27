package com.sumba.navigationview;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpToolbarMenu();
        setUpNavigationDrawerMenu();
    }

    private void setUpToolbarMenu(){
        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle("Navigation View");
    }

    private void setUpNavigationDrawerMenu(){
        NavigationView navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);
        mDrawerLayout = findViewById(R.id.drawerLayout);


        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this,
                mDrawerLayout, mToolbar, R.string.drawer_open, R.string.drawer_close);

        mDrawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        String itemName = (String) menuItem.getTitle();
        Toast.makeText(MainActivity.this, itemName + " Clicked!", Toast.LENGTH_LONG).show();
        closeDrawer();

        switch (menuItem.getItemId()){
            case R.id.item_facebook:
                break;
            case R.id.item_twitter:
                break;
            case R.id.item_google_plus:
                break;
            case R.id.item_bag:
                break;
            case R.id.item_cart:
                break;
            case R.id.item_exercise:
                break;
            case R.id.item_heart:
                break;
            case R.id.item_instagram:
                break;
            case R.id.item_linkedin:
                break;
            case R.id.item_liver:
                break;
            case R.id.item_lungs:
                break;
            case R.id.item_products:
                break;
            case R.id.item_pushups:
                break;
            case R.id.item_running:
                break;
            case R.id.item_skull:
                break;
            case R.id.item_stomach:
                break;
            case R.id.item_tooth:
                break;
            case R.id.item_walking:
                break;
            case R.id.item_Yoga:
                break;
        }
        return true;
    }

    private void closeDrawer(){
        mDrawerLayout.closeDrawer(GravityCompat.START);
    }

    private void showDrawer(){
        mDrawerLayout.openDrawer(GravityCompat.START);
    }

    public void onBackPressed(){
        if(mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            closeDrawer();
        }else
            super.onBackPressed();
    }
}
