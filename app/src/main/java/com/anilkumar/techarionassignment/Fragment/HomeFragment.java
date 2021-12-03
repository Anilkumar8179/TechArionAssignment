package com.anilkumar.techarionassignment.Fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anilkumar.techarionassignment.Adapter.HomeAdapter;
import com.anilkumar.techarionassignment.Adapter.NotificationAdapter;
import com.anilkumar.techarionassignment.Modal.HomeModal;
import com.anilkumar.techarionassignment.R;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    List<HomeModal> homeModalList;
    HomeAdapter homeAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.recyclerview1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        homeAdapter = new HomeAdapter(getContext(), homeModalList);
        recyclerView.setAdapter(homeAdapter);
        return view;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeModalList = new ArrayList<HomeModal>();

        homeModalList.add(new HomeModal("rupi kouri",R.id.img1,R.id.img2,R.id.img3,R.id.img4));
        homeModalList.add(new HomeModal("rupi kouri",R.id.img1,R.id.img2,R.id.img3,R.id.img4));
        homeModalList.add(new HomeModal("rupi kouri",R.id.img1,R.id.img2,R.id.img3,R.id.img4));
        homeModalList.add(new HomeModal("rupi kouri",R.id.img1,R.id.img2,R.id.img3,R.id.img4));
        homeModalList.add(new HomeModal("rupi kouri",R.id.img1,R.id.img2,R.id.img3,R.id.img4));
        homeModalList.add(new HomeModal("rupi kouri",R.id.img1,R.id.img2,R.id.img3,R.id.img4));
        homeModalList.add(new HomeModal("rupi kouri",R.id.img1,R.id.img2,R.id.img3,R.id.img4));
        homeModalList.add(new HomeModal("rupi kouri",R.id.img1,R.id.img2,R.id.img3,R.id.img4));

    }
}