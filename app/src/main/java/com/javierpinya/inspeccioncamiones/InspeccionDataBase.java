package com.javierpinya.inspeccioncamiones;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {PrimerComponente.class, SegundoComponente.class}, version = 1)
@TypeConverters({Converters.class})
public abstract class InspeccionDataBase extends RoomDatabase {

    private static InspeccionDataBase INSTANCE;

    public abstract PrimerComponenteDao tractoraModel();
    public abstract SegundoComponenteDao cisternaModel();

    public static InspeccionDataBase getInMemoryDatabase(Context context){
        if(INSTANCE == null){
            synchronized (InspeccionDataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.inMemoryDatabaseBuilder(context.getApplicationContext(),
                            InspeccionDataBase.class)
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
