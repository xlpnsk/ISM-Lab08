package pollub.ism.lab08;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Dao
public interface HistoriaZmianDAO {

    @Query("INSERT INTO Historia (veg_key, DATE, TIME, OLDQUANTITY,NEWQUANTITY) VALUES (:wybraneWarzywoID, CURRENT_DATE, CURRENT_TIME, :staraWartosc, :nowaWartosc)") //Nasza kwerenda
    void insertHistory(int wybraneWarzywoID, int staraWartosc, int nowaWartosc);

    @Query("SELECT * FROM Historia WHERE veg_key= :wybraneWarzywoID") //Nasza kwerenda DATE, TIME, OLDQUANTITY,NEWQUANTITY
    List<HistoriaZmian> findHistoryByID(int wybraneWarzywoID);
}
