package com.anilkumar.techarionassignment.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.anilkumar.techarionassignment.Adapter.NotificationAdapter;
import com.anilkumar.techarionassignment.Modal.Modal;
import com.anilkumar.techarionassignment.R;

import java.util.ArrayList;
import java.util.List;


public class NotificationFragment extends Fragment {


    RecyclerView recyclerView;
    List<Modal> modalList;
    NotificationAdapter  notificationAdapter;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_notification, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        notificationAdapter=new NotificationAdapter(getContext(),modalList);
        recyclerView.setAdapter(notificationAdapter);





        return view;
    }
    @SuppressLint("NotifyDataSetChanged")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        modalList = new ArrayList<>();
        modalList.add(new Modal("Sameer_Y and B others liked your twinkle twinle content", R.id.img));
        modalList.add(new Modal("Sameer_Y and B others liked your twinkle twinle content", R.id.img));
        modalList.add(new Modal("Sameer_Y and B others liked your twinkle twinle content", R.id.img));
        modalList.add(new Modal("Sameer_Y and B others liked your twinkle twinle content", R.id.img));
        modalList.add(new Modal("Sameer_Y and B others liked your twinkle twinle content", R.id.img));
        modalList.add(new Modal("Sameer_Y and B others liked your twinkle twinle content", R.id.img));
        modalList.add(new Modal("Sameer_Y and B others liked your twinkle twinle content", R.id.img));
        modalList.add(new Modal("Sameer_Y and B others liked your twinkle twinle content", R.id.img));
        modalList.add(new Modal("Sameer_Y and B others liked your twinkle twinle content", R.id.img));
        modalList.add(new Modal("Sameer_Y and B others liked your twinkle twinle content", R.id.img));
        modalList.add(new Modal("Sameer_Y and B others liked your twinkle twinle content", R.id.img));
        modalList.add(new Modal("Sameer_Y and B others liked your twinkle twinle content", R.id.img));
        modalList.add(new Modal("Sameer_Y and B others liked your twinkle twinle content", R.id.img));
        modalList.add(new Modal("Sameer_Y and B others liked your twinkle twinle content", R.id.img));
        modalList.add(new Modal("Sameer_Y and B others liked your twinkle twinle content", R.id.img));
        modalList.add(new Modal("Sameer_Y and B others liked your twinkle twinle content", R.id.img));


    }

}