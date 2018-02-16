package phong.de.dontlie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GameDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_description);

        setTitle(R.string.description);
//        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
