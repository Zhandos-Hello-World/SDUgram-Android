package production.zhandos.myapplication.room

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface UserDao {

    @Query("SELECT * FROM users where id = :id")
    suspend fun getById(id: Long)

    @Query("SELECT * FROM users")
    suspend fun getAll(): LiveData<User>

    @Insert
    suspend fun insert(user: User)

    @Update
    suspend fun update(user: User)

    @Delete
    suspend fun delete(user: User)
}