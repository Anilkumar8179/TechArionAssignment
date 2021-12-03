package com.anilkumar.techarionassignment.Fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anilkumar.techarionassignment.Adapter.DiscoverAdapter;
import com.anilkumar.techarionassignment.Adapter.HomeAdapter;
import com.anilkumar.techarionassignment.Modal.DiscoverModal;
import com.anilkumar.techarionassignment.Modal.HomeModal;
import com.anilkumar.techarionassignment.Modal.Modal;
import com.anilkumar.techarionassignment.R;

import java.util.ArrayList;
import java.util.List;


public class DiscoverFragment extends Fragment {

    RecyclerView recyclerView;
    List<DiscoverModal> discoverModals;
    DiscoverAdapter discoverAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discover, container, false);

        recyclerView = view.findViewById(R.id.recyclerview3);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        discoverAdapter = new DiscoverAdapter(getContext(), (List<DiscoverModal>) discoverAdapter);
        recyclerView.setAdapter(discoverAdapter);
        return view;
    }
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        discoverModals = new ArrayList<DiscoverModal>();

        discoverModals.add(new DiscoverModal ("Sameer_Y and B others liked your twinkle twinle content", "catigri","Geners"));
        discoverModals.add(new DiscoverModal ("Sameer_Y and B others liked your twinkle twinle content", "catigri","Geners"));
        discoverModals.add(new DiscoverModal ("Sameer_Y and B others liked your twinkle twinle content", "catigri","Geners"));
        discoverModals.add(new DiscoverModal ("Sameer_Y and B others liked your twinkle twinle content", "catigri","Geners"));
        discoverModals.add(new DiscoverModal ("Sameer_Y and B others liked your twinkle twinle content", "catigri","Geners"));
        discoverModals.add(new DiscoverModal ("Sameer_Y and B others liked your twinkle twinle content", "catigri","Geners"));
        discoverModals.add(new DiscoverModal ("Sameer_Y and B others liked your twinkle twinle content", "catigri","Geners"));
    }
}

