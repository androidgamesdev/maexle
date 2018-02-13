package phong.de.dontlie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class AppDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_display);

        ImageView logo = (ImageView) findViewById(R.id.logo);
        logo.setImageResource(R.drawable.logoApp);
    }
}
