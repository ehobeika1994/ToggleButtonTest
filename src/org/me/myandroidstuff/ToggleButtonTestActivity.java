package org.me.myandroidstuff;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ToggleButtonTestActivity extends Activity implements OnClickListener
{
	private View mainView;
	private ToggleButton colourToggleButton;
	private TextView toggleLabel;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mainView = (View)findViewById(R.id.mainView);
        colourToggleButton = (ToggleButton)findViewById(R.id.colourToggleButton);
        toggleLabel = (TextView)findViewById(R.id.toggleLabel);
        
        colourToggleButton.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) 
	{
		// TODO Auto-generated method stub
		if (v == colourToggleButton)
		{
			if (colourToggleButton.isChecked())
			{
				mainView.setBackgroundColor(Color.RED);
				toggleLabel.setTextColor(Color.BLACK);
				toggleLabel.setText("Colour On");
			}
			else
			{
				mainView.setBackgroundColor(Color.BLACK);
				toggleLabel.setTextColor(Color.WHITE);
				toggleLabel.setText("Colour Off");
			}
		}
		
	}// End of onClick
}