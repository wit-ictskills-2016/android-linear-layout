package app.donation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;

public class Donation extends AppCompatActivity
{

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_donation);
    getMetrics();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_global, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case R.id.donate:
        startActivity(new Intent(this, Donate.class));
        break;
      case R.id.accept:
        startActivity(new Intent(this, Accept.class));
        break;
      case R.id.reject:
        startActivity(new Intent(this, Donation.class));
        break;
      case R.id.message:
        startActivity(new Intent(this, Message.class));
        break;
    }
    return true;
  }

  /**
   * https://stackoverflow.com/questions/3166501/getting-the-screen-density-programmatically-in-android
   * https://developer.android.com/reference/android/util/DisplayMetrics.html
   */
  public void getMetrics() {
    DisplayMetrics metrics = getResources().getDisplayMetrics();
    float density = metrics.density;
    float xdpi = metrics.xdpi; // pixels per inch in x direction
    float ydpi = metrics.ydpi; // pixels per inch in y direction
    int densityDpi = metrics.densityDpi; // screen density in dots per inch
    int heightPixels = metrics.heightPixels; //absolute height of the available display size in pixels.
    int widthPixels = metrics.widthPixels; // absolute width of the available display size in pixels.
  }
}
