package app.donation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Accept extends AppCompatActivity
{

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_accept);
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
      case R.id.reject:
        startActivity(new Intent(this, Reject.class));
        break;
      case R.id.message:
        startActivity(new Intent(this, Message.class));
        break;
      case R.id.donation:
        startActivity(new Intent(this, Donation.class));
        break;
    }
    return true;
  }

}
