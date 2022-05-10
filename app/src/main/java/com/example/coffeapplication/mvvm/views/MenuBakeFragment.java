package com.example.coffeapplication.mvvm.views;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coffeapplication.R;
import com.example.coffeapplication.mvvm.adapters.MenuAdapter;
import com.example.coffeapplication.mvvm.models.MenuItem;
import com.example.coffeapplication.mvvm.viewModels.MenuBakeViewModel;

import java.util.ArrayList;

public class MenuBakeFragment extends Fragment {
    MenuAdapter adapter;
    MenuBakeViewModel menuViewModel;
    RecyclerView rcv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu_bake, container, false);

        menuViewModel = new ViewModelProvider(this).get(MenuBakeViewModel.class);
        final Observer<ArrayList<MenuItem>> nameObserver = new Observer<ArrayList<MenuItem>>() {
            @Override
            public void onChanged(@Nullable final ArrayList<MenuItem> menu) {
                adapter = new MenuAdapter(menu, requireContext());
                rcv.setAdapter(adapter);
            }
        };
        rcv = view.findViewById(R.id.bakeRecycler);

        menuViewModel.getCurrentName().observe(getViewLifecycleOwner(), nameObserver);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),2);
        rcv.setLayoutManager(gridLayoutManager);

        return view;
    }
}