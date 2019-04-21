package com.example.day_04;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.day_04.Base.Base_activity;
import com.example.day_04.Fragment.About_Fragment;
import com.example.day_04.Fragment.Collect_Fragment;
import com.example.day_04.Fragment.Ganhuo_Fragment;
import com.example.day_04.Fragment.Set_Fragment;
import com.example.day_04.Fragment.Shuju_Fragment;
import com.example.day_04.Fragment.V2ex_Fragment;
import com.example.day_04.Fragment.WeiChart_Fragment;
import com.example.day_04.Fragment.Zhihu_Fragment;
import com.example.day_04.Presenter_fragment.Mainp;
import com.example.day_04.View_fragment.Mainv;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends Base_activity<Mainv,Mainp>implements Mainv,NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.frame)
    FrameLayout mFrame;
    @BindView(R.id.fab)
    FloatingActionButton mFab;
    @BindView(R.id.nav_view)
    NavigationView mNavView;
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;

    private ArrayList<Fragment> mFragments;
    private FragmentManager mManager;
    private ArrayList<Integer> mTitles;
    private final int TYPE_ZHIHU = 0;
    private final int TYPE_WECHAT = 1;
    private final int TYPE_GANK = 2;
    private final int TYPE_GOLD = 3;
    private final int TYPE_V2EX = 4;
    private final int TYPE_COLLECT = 5;
    private final int TYPE_SETTING = 6;
    private final int TYPE_ABOUT = 7;

    //上一次显示的fragmnet的索引
    private int mLastFragmentPosition = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        initFragments();
        initTitles();

        addZhihuDailyNewsFragment();

    }

    private void addZhihuDailyNewsFragment() {
        FragmentTransaction transaction = mManager.beginTransaction();
        transaction.add(R.id.frame,mFragments.get(0));
        transaction.commit();
        mToolbar.setTitle(mTitles.get(0));
    }

    private void initTitles() {
        mTitles=new ArrayList<>();
        mTitles.add(R.id.zhihu);
        mTitles.add(R.id.wei);
        mTitles.add(R.id.v2ex);
        mTitles.add(R.id.shuju);
        mTitles.add(R.id.set);
        mTitles.add(R.id.ganhuo);
        mTitles.add(R.id.collect);
        mTitles.add(R.id.about);
    }

    private void initFragments() {
        mFragments=new ArrayList<>();
        mFragments.add(new Zhihu_Fragment());
        mFragments.add(new WeiChart_Fragment());
        mFragments.add(new V2ex_Fragment());
        mFragments.add(new Shuju_Fragment());
        mFragments.add(new Set_Fragment());
        mFragments.add(new Ganhuo_Fragment());
        mFragments.add(new Collect_Fragment());
        mFragments.add(new About_Fragment());
    }

    @Override
    protected Mainp initPresenter() {
        return new Mainp();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.content_main2;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Toast.makeText(this, "选项菜单", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            switchFragments(TYPE_ZHIHU);
        } else if (id == R.id.nav_gallery) {
           switchFragments(TYPE_WECHAT);
        } else if (id == R.id.nav_slideshow) {
           switchFragments(TYPE_GANK);
        } else if (id == R.id.nav_manage) {
            switchFragments(TYPE_GOLD);
        } else if (id == R.id.nav_share) {
           switchFragments(TYPE_COLLECT);
        } else if (id == R.id.nav_send) {
            switchFragments(TYPE_ABOUT);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void switchFragments(int type){
        Fragment fragment = mFragments.get(type);
        Fragment hideFragment = mFragments.get(mLastFragmentPosition);
        FragmentTransaction transaction = mManager.beginTransaction();
        if (!fragment.isAdded()){
            transaction.add(R.id.frame,fragment);
        }
        transaction.show(fragment);
        transaction.hide(hideFragment);
        transaction.commit();
        mLastFragmentPosition=type;
    }
}
