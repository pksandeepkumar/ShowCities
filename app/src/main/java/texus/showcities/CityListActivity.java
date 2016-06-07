package texus.showcities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

import texus.showcities.adapter.CityItemRecyclerAdapter;
import texus.showcities.adapter.SimpleDividerItemDecoration;
import texus.showcities.datamodels.CityData;
import texus.showcities.utils.Utility;

/**
 * Created by sandeep on 03/06/16.
 */
public class CityListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        initViews();


    }

    private void initViews() {
        recyclerView = (RecyclerView) this.findViewById(R.id.recycler_view);
        ArrayList<CityData> datas = CityData.getParsed(Utility.readFromAssets("data.json", this));
        CityItemRecyclerAdapter adapter = new CityItemRecyclerAdapter(this, datas);

        recyclerView.setHasFixedSize(true);

        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(this));

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }


    public void navClicked(View view) {
        finish();
    }
}
