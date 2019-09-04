package com.javierpinya.inspeccioncamiones;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PrimerComponenteDao {

    @Insert
    void insert(PrimerComponente tractora);

    @Query("select * from PrimerComponente")
    LiveData<List<PrimerComponente>> allTractoras();

    @Query("select * from PrimerComponente where matricula like :matricula")
    LiveData<List<PrimerComponente>> findByMatricula(String matricula);

}
