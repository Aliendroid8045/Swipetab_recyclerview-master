package koshik.SwipeTravel;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TabHost;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;


import java.util.ArrayList;

import koshik.travelove.R;


public class SwapTab extends AppCompatActivity implements ViewPager.OnPageChangeListener, TabHost.OnTabChangeListener
{
    ViewPager viewPager;
    TabHost tabhost;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.swap_tab);
        initViewPager();
        initTabHost();

    }

    private void initTabHost()
    {
        tabhost = (TabHost) findViewById(R.id.tabHost);
        tabhost.setup();
        String[] tabNames = {"VIDEOS","MUSICS","IMAGES"};

        for (int i = 0; i < tabNames.length; i++)
        {
            TabHost.TabSpec tabSpec;
            tabSpec = tabhost.newTabSpec(tabNames[i]);
            tabSpec.setIndicator(tabNames[i]);
            tabSpec.setContent(new FakeContent(getApplicationContext()));
            tabhost.addTab(tabSpec);
        }
        tabhost.setOnTabChangedListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
    {

    }

    @Override
    public void onPageSelected(int selectedItem)
    {
        tabhost.setCurrentTab(selectedItem);


    }

    @Override
    public void onPageScrollStateChanged(int state)
    {

    }

    @Override
    public void onTabChanged(String tabId)
    {
        int selectedItem = tabhost.getCurrentTab();
        viewPager.setCurrentItem(selectedItem);
        HorizontalScrollView hscrollView= (HorizontalScrollView) findViewById(R.id.h_horizontal_scroll);
        View tabView=tabhost.getCurrentTabView();
        int scrollPos=tabView.getLeft()-(hscrollView.getWidth()-tabView.getWidth())/2;
        hscrollView.smoothScrollTo(scrollPos,0);

    }

    public class FakeContent implements TabHost.TabContentFactory
    {
        Context context;

        public FakeContent(Context mcontext)
        {
            context = mcontext;
        }

        @Override
        public View createTabContent(String tag)
        {
            View fakeView = new View(context);
            fakeView.setMinimumHeight(0);
            fakeView.setMinimumWidth(0);
            return fakeView;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_swap_tab, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initViewPager()
    {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        List<Fragment> listFragments = new ArrayList<Fragment>();
        listFragments.add(new FragmentA());
        listFragments.add(new FragmentB());
        listFragments.add(new FragmentC());


        MyFragmentPagerAdapter myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), listFragments);
        viewPager.setAdapter(myFragmentPagerAdapter);
        viewPager.setOnPageChangeListener(this);
    }
    public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
        List<Fragment> listFragment;



        public MyFragmentPagerAdapter(FragmentManager fm, List<Fragment> listFragment)
        {
            super(fm);
            this.listFragment = listFragment;
        }


        @Override
        public Fragment getItem(int position)
        {
            return listFragment.get(position);
        }

        @Override
        public int getCount()
        {
            return listFragment.size();
        }
    }

}
