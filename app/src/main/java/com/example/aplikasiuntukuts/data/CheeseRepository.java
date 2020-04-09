package com.example.aplikasiuntukuts.data;

import androidx.lifecycle.LiveData;
import android.app.Application;

import java.util.List;

public class CheeseRepository {

    private CheeseDao cheeseDao;
    private LiveData<List<Cheese>> allCheese;

    public CheeseRepository(Application application) {
        SampleDatabase db = SampleDatabase.getInstance(application);
        cheeseDao = db.cheese();
        allCheese = cheeseDao.getAllCheese();
    }
    // Implementasi Live Data
    LiveData<List<Cheese>> getmAllCheese(){
        return allCheese;
    }

}
