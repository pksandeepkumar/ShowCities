package texus.showcities.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.math.BigDecimal;

import texus.showcities.R;
import texus.showcities.datamodels.CityData;

/**
 * Created by sandeep on 8/4/16.
 */
public class CityItemRecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    CityData object;

    public TextView     tvName;
    public TextView     tvDistance;
    public TextView     tvCountry;



    public CityItemRecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        tvName = (TextView)    itemView.findViewById(R.id.tvName);
        tvDistance = (TextView)    itemView.findViewById(R.id.tvDistance);
        tvCountry = (TextView)    itemView.findViewById(R.id.tvCountry);

    }

    public void setObjectValue(CityData object) {

        if( object ==  null) return;

        this.object = object;

        tvName.setText( object.name );

        tvDistance.setText(getRounded( object.distance )+ " KM" );

        tvCountry.setText(object.countryName);


    }

    public String getRounded( double value) {
        BigDecimal a = new BigDecimal(value);
        return "" + a.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }





    @Override
    public void onClick(View view) {

    }



}
