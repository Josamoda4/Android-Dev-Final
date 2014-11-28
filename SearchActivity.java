package com.example.finalproject;



import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter;
import android.widget.Spinner;


public class SearchActivity extends Activity {
	protected Spinner gameSpinner;
	protected GameData gameData;

	@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.searchpage);
	        
	        gameData = new GameData(this);
	        
	        gameSpinner = (Spinner) findViewById(R.id.game_spinner);
	        if(gameData.count() == 0) {
	            gameData.insert("Super Mario 64", "N64", 1996, 1);
	           
	          }
	        Cursor cursor = gameData.all(this);

	        

	         
	         
	        	      
	      
}
}
