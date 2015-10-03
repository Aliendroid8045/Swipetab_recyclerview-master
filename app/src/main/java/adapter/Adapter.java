package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

import koshik.SwipeTravel.Information;
import koshik.travelove.R;

/**
 * Created by koshik on 20-09-2015.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.MyviewHolder> {
    private LayoutInflater inflater;
    List<Information> data = Collections.emptyList();

    public Adapter(Context context, List<Information> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }


    @Override
    public MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_row, parent, false);
        MyviewHolder myHolder = new MyviewHolder(view);

        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyviewHolder holder, int position) {
        Information current = data.get(position);
        holder.title.setText(current.title);
        holder.icon.setImageResource(current.iconId);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyviewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView icon;

        public MyviewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.listText);
            icon = (ImageView) itemView.findViewById(R.id.listIcon);
        }
    }
}
