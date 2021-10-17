package edu.gatech.seclass.jobcompare6300.Database.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity (tableName = "dirtyScore")
public class DirtyScoresEntity {

    @ColumnInfo(name = "dirtyScores")
    public int dirtyScores;

    public DirtyScoresEntity(int dirtyScores){
        this.dirtyScores = dirtyScores;
    }

}
