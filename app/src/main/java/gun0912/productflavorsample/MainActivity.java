package gun0912.productflavorsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        if(BuildConfig.IS_FREE){
            // 무료앱
            // 광고 보여주기
        }else{
            // 유료앱
            // 광고 보여주지 않기
        }



    }
}
