package com.javierpinya.inspeccioncamiones;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class InspeccionViewModel extends AndroidViewModel {

    private InspeccionRepository mRepository;
    private LiveData<List<PrimerComponente>> mAllTractoras;
    private LiveData<List<SegundoComponente>> mAllCisternas;


    public InspeccionViewModel(@NonNull Application application) {
        super(application);
        mRepository = new InspeccionRepository(application);
        mAllTractoras = mRepository.getAllTractoras();
        mAllCisternas = mRepository.getAllCisternas();
    }

    public LiveData<List<PrimerComponente>> getAllTractoras(){
        return mAllTractoras;
    }

    public LiveData<List<SegundoComponente>> getAllCisternas(){
        return mAllCisternas;
    }

    public void insert(PrimerComponente tractora){
        mRepository.insert(tractora);
    }

    public void insert(SegundoComponente cisterna){
        mRepository.insert(cisterna);
    }
}
