package phong.de.dontlie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import me.anwarshahriar.calligrapher.Calligrapher;

public class DiceAnimationActivity extends AppCompatActivity implements View.OnClickListener {

    public static final Random RANDOM = new Random();
    private Button rollDiceButton;
    private ImageView imageView1, imageView2, imageView3;

    public static int randomDiceValue() {
        return RANDOM.nextInt(6) + 1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_animation);

        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/Montserrat-Regular.otf", true);

        rollDiceButton = (Button) findViewById(R.id.rollDice);

        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);

        rollDiceButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rollDice:
                final Animation anim1 = AnimationUtils.loadAnimation(DiceAnimationActivity.this, R.anim.shake);
                final Animation anim2 = AnimationUtils.loadAnimation(DiceAnimationActivity.this, R.anim.shake);
                final Animation anim3 = AnimationUtils.loadAnimation(DiceAnimationActivity.this, R.anim.shake);

                final Animation.AnimationListener animationListener = new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        int value = randomDiceValue();
                        int res = getResources().getIdentifier("dice_" + value, "drawable", "phong.de.dontlie");

                        if (animation == anim1) {
                            imageView1.setImageResource(res);
                        }

                        if (animation == anim2) {
                            imageView2.setImageResource(res);
                        }

                        if (animation == anim3) {
                            imageView3.setImageResource(res);
                        }
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                };

                anim1.setAnimationListener(animationListener);
                anim2.setAnimationListener(animationListener);
                anim3.setAnimationListener(animationListener);

                imageView1.startAnimation(anim1);
                imageView2.startAnimation(anim2);
                imageView3.startAnimation(anim3);
        }
    }
}
