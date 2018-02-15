package phong.de.dontlie;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import me.anwarshahriar.calligrapher.Calligrapher;

public class AppDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_display);

        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/Montserrat-Regular.otf", true);

        ImageView logo = (ImageView) findViewById(R.id.logo);
        logo.setImageResource(R.drawable.logo);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layoutAppDisplay);
        linearLayout.setBackgroundColor(Color.WHITE);

        delayIntent();
    }

    //display startActivity a several time
    private void delayIntent(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intro = new Intent(AppDisplay.this, Introduction.class);
                startActivity(intro);
            }
        }, 2000L);
    }
}
