package com.kode.o4mundthegame;

        import android.content.pm.ActivityInfo;
        import android.support.v4.content.pm.ActivityInfoCompat;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Window;
        import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    int l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(new GameView(this));
    }
}
