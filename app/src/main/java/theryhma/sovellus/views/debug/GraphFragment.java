package theryhma.sovellus.views.debug;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;

import theryhma.sovellus.R;

public class GraphFragment extends Fragment {
    private View v;
    private LineChart lineChart;
    public GraphFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_graph, container, false);


        return v;
    }

    @Override
    public void onResume() {
        super.onResume();

        lineChart = v.findViewById(R.id.lineChart);




    }
}