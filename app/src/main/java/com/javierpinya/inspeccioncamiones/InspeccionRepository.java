package com.javierpinya.inspeccioncamiones;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class InspeccionRepository {

    private PrimerComponenteDao mPrimerComponenteDao;
    private SegundoComponenteDao mSegundoComponenteDao;
    private LiveData<List<PrimerComponente>> mAllTractoras;
    private LiveData<List<SegundoComponente>> mAllCisternas;

    public InspeccionRepository(Application application){
        InspeccionDataBase db = InspeccionDataBase.getInMemoryDatabase(application);
        mPrimerComponenteDao = db.tractoraModel();
        mSegundoComponenteDao = db.cisternaModel();
    }

    public LiveData<List<PrimerComponente>> getAllTractoras(){
        return mAllTractoras;
    }

    public LiveData<List<SegundoComponente>> getAllCisternas(){
        return mAllCisternas;
    }

    public void insert(PrimerComponente matricula){
        new insertAsyncTaskTractora(mPrimerComponenteDao).execute(matricula);
    }

    private static class insertAsyncTaskTractora extends AsyncTask<PrimerComponente, Void, Void>{

        private PrimerComponenteDao mAsyncTaskDao;

        insertAsyncTaskTractora(PrimerComponenteDao dao){
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final PrimerComponente... primerComponentes) {
            mAsyncTaskDao.insert(primerComponentes[0]);
            return null;
        }
    }

    public void insert(SegundoComponente matricula){
        new insertAsyncTaskCisterna(mSegundoComponenteDao).execute(matricula);
    }

    private static class insertAsyncTaskCisterna extends AsyncTask<SegundoComponente, Void, Void>{

        private SegundoComponenteDao mAsyncTaskDao;

        insertAsyncTaskCisterna(SegundoComponenteDao dao){
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(SegundoComponente... segundoComponentes) {
            mAsyncTaskDao.insert(segundoComponentes[0]);
            return null;
        }
    }
}
