package pollub.ism.lab08;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.sql.Date;
import java.sql.Time;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "Historia",
        foreignKeys = @ForeignKey(entity = PozycjaMagazynowa.class,
        parentColumns = "_id",
        childColumns = "veg_key",
        onDelete = CASCADE),
        indices = {@Index(value = {"veg_key"})})
public class HistoriaZmian {

    @PrimaryKey(autoGenerate = true)
    public int _id;
    public int veg_key;
    public String DATE;
    public String TIME;
    public int OLDQUANTITY;
    public int NEWQUANTITY;
}
