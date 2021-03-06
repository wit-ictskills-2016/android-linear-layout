package app.donation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


// developer.android.com/guide/topics/ui/layout/linear.html

public class Message extends AppCompatActivity
{

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_message);
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
        startActivity(new Intent(this, Reject.class));
        break;
      case R.id.donation:
        startActivity(new Intent(this, Donation.class));
        break;

    }
    return true;
  }

}
