package my.first.listviewcustomadapter;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface UserDao {

    @Insert
    public void adduser(User user);
}
