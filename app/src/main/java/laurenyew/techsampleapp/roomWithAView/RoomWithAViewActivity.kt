package laurenyew.techsampleapp.roomWithAView

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import laurenyew.techsampleapp.R

/***
 * LiveData + Room + MVVM
 * Starter activity for Room with A View
 * https://codelabs.developers.google.com/codelabs/android-room-with-a-view-kotlin/#0
 **/
class RoomWithAViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_with_aview)
    }
}
