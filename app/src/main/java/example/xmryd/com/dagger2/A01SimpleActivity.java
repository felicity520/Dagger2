package example.xmryd.com.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import javax.inject.Inject;

public class A01SimpleActivity extends AppCompatActivity {

    private static final String TAG = "A01SimpleActivity";

    private Button btn_test;

    @Inject
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a01_simple);


        //新添代码
        DaggerA01SimpleComponent.builder()
                .a01SimpleModule(new A01SimpleModule(this))
                .build()
                .inject(this);

        btn_test = (Button) findViewById(R.id.btn_test);
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "onClick: -------");
                Toast.makeText(A01SimpleActivity.this, student.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}