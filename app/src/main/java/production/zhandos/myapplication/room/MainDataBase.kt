package production.zhandos.myapplication.room

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class MainDataBase: RoomDatabase(){
    abstract val dao: UserDao

    companion object {
        @Volatile
        private var INSTANCE: MainDataBase? = null

        fun getINSTANCE(application: Application): MainDataBase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        application.applicationContext,
                        MainDataBase::class.java,
                        "UserDB"
                    ).build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }

}