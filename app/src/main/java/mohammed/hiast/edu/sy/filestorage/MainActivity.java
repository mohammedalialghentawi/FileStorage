package mohammed.hiast.edu.sy.filestorage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    TextView outputTxtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputTxtView = (TextView) findViewById(R.id.outputText);
    }

    public void onCreateButtonClick(View view) {

    }


    public void onReadButtonClick(View view) {
    }

    public void onDeleteButtonClick(View view) {
    }
}
