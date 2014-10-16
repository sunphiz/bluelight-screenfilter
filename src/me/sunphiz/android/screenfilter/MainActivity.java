package me.sunphiz.android.screenfilter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends Activity
{
    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.main_activity );
    }

    public void onClick( View v )
    {
        ToggleButton tb = ( ToggleButton ) v;
        Intent service = new Intent( this, ScreenFilterService.class );

        if( tb.isChecked() )
        {
            startService( service );
        }
        else
        {
            stopService( service );
        }

    }
}