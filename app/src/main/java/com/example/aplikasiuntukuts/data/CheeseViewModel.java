package com.example.aplikasiuntukuts.data;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class CheeseViewModel extends AndroidViewModel {

    private CheeseRepository cheeseRepository;
    private LiveData<List<Cheese>> mAllCheese;

    public CheeseViewModel(Application application) {
        super(application);
        cheeseRepository = new CheeseRepository(application);
        mAllCheese = cheeseRepository.getmAllCheese();

    }
    // Implementasi live data
    public LiveData<List<Cheese>> getmAllCheese(){
        return mAllCheese;
    }


}
