package texus.showcities.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import texus.showcities.R;
import texus.showcities.datamodels.CityData;

/**
 * Created by sandeep on 8/4/16.
 */
public class CityItemRecyclerAdapter extends RecyclerView.Adapter<CityItemRecyclerViewHolders> {

    private ArrayList<CityData> objects;
    private Context context;



    public CityItemRecyclerAdapter(Context context, ArrayList<CityData> objects) {
        this.objects = objects;
        this.context = context;
    }

    @Override
    public CityItemRecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_city, null);
        CityItemRecyclerViewHolders rcv = new CityItemRecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(final CityItemRecyclerViewHolders holder, int position) {

        CityData object = objects.get(position);

        holder.setObjectValue( object );

    }



    @Override
    public int getItemCount() {
        return this.objects.size();
    }
}