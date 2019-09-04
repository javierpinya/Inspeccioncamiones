package com.javierpinya.inspeccioncamiones;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface SegundoComponenteDao {

    @Insert
    void insert(SegundoComponente matricula);

    @Query("select * from SegundoComponente")
    LiveData<List<SegundoComponente>> allTractoras();

    @Query("select * from SegundoComponente where matricula like :matricula")
    LiveData<List<SegundoComponente>> findByMatricula(String matricula);
}
