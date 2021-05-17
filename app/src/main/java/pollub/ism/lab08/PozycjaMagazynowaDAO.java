package pollub.ism.lab08;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.sql.Date;
import java.sql.Time;

@Dao
public interface PozycjaMagazynowaDAO {

    @Insert  //Automatyczna kwerenda wystarczy
    public void insert(PozycjaMagazynowa pozycja);

    @Update //Automatyczna kwerenda wystarczy
    void update(PozycjaMagazynowa pozycja);

    @Query("SELECT QUANTITY FROM Warzywniak WHERE NAME= :wybraneWarzywoNazwa") //Nasza kwerenda
    int findQuantityByName(String wybraneWarzywoNazwa);

    @Query("UPDATE Warzywniak SET QUANTITY = :wybraneWarzywoNowaIlosc WHERE NAME= :wybraneWarzywoNazwa")
    void updateQuantityByName(String wybraneWarzywoNazwa, int wybraneWarzywoNowaIlosc);

    @Query("SELECT COUNT(*) FROM Warzywniak") //Ile jest rekordów w tabeli
    int size();

    @Query("SELECT _id FROM Warzywniak WHERE NAME= :wybraneWarzywoNazwa") //Nasza kwerenda
    int findIDByName(String wybraneWarzywoNazwa);

}