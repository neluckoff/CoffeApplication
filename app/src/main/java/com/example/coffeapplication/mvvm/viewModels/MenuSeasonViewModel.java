package com.example.coffeapplication.mvvm.viewModels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.coffeapplication.mvvm.models.MenuItem;
import com.example.coffeapplication.mvvm.repositories.MenusRepository;

import java.util.ArrayList;

public class MenuSeasonViewModel extends ViewModel {
    private MutableLiveData<ArrayList<MenuItem>> currentName;

    public MutableLiveData<ArrayList<MenuItem>> getCurrentName() {
        if (currentName == null) {
            currentName = new MutableLiveData<ArrayList<MenuItem>>();
        }
        currentName.setValue(new MenusRepository().getSeasonHolder());
        return currentName;
    }
}
