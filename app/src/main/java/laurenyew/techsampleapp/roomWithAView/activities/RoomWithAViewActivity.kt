package laurenyew.techsampleapp.roomWithAView.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import laurenyew.techsampleapp.R
import laurenyew.techsampleapp.roomWithAView.views.WordListAdapter

/***
 * LiveData + Room + MVVM
 * Starter activity for Room with A View
 * https://codelabs.developers.google.com/codelabs/android-room-with-a-view-kotlin/#0
 **/
class RoomWithAViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.roomwithaview_activity)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val adapter = WordListAdapter(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
