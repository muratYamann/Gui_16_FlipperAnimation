package com.yamankod.gui_16_flipperanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends Activity {

    static final String[] DunyaKupasi16 = new String[] {
            "Arjantin", "Brezilya", "Şili", "İngiltere",
            "Almanya","Gana", "Japonya", "Meksika",
            "Hollanda","Paraguay", "Portekiz",
            "Slovakya", "Slovenya", "Güney Kore", "İspanya",
            "USA", "Uruguay" };

    ViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flipper=(ViewFlipper)findViewById(R.id.details);

        flipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.push_up_in));

        flipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.push_up_out));

        for (String item : DunyaKupasi16) {
            Button btn=new Button(this);

            btn.setText(item);

            flipper.addView(btn, new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT));
        }

        flipper.setFlipInterval(2000);
        flipper.startFlipping();
    }
}
