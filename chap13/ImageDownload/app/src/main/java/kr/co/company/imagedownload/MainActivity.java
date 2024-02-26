package kr.co.company.imagedownload;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    public String URL = "";
    EditText edittext;
    ImageView imageView;
    Button button;
    ProgressDialog mProgressDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = (EditText) findViewById(R.id.editText);
        imageView = (ImageView) findViewById(R.id.imageview);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                URL = edittext.getText().toString();
                downloadImage(URL);
            }
        });
    }

    private void downloadImage(final String imageUrl) {
        mProgressDialog = new ProgressDialog(MainActivity.this);
        mProgressDialog.setTitle("이미지 다운로드 예제");
        mProgressDialog.setMessage("이미지 다운로드 중입니다.");
        mProgressDialog.setIndeterminate(false);
        mProgressDialog.show();

        Thread downloadThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    InputStream input = new java.net.URL(imageUrl).openStream();
                    final Bitmap bitmap = BitmapFactory.decodeStream(input);

                    // UI 업데이트를 View.post()를 사용하여 메인 스레드에서 수행
                    imageView.post(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                            mProgressDialog.dismiss();
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        downloadThread.start();
    }
}