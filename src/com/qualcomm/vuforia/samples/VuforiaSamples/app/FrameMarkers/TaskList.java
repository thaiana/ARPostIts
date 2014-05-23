package com.qualcomm.vuforia.samples.VuforiaSamples.app.FrameMarkers;


import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TaskList extends ListActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(android.R.layout.list_content);
		ListView list = (ListView) findViewById(android.R.id.list);
		
		String[] lista0 = {"Colocar por id do marcador", "construir integração", "tarefa 3", "tarefa 4"}; 
		//tarefas.put(0, lista0);
		
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(
	    		this, android.R.layout.simple_list_item_1, android.R.id.text1);	
	    adapter.addAll(lista0);
	    	    
	    list.setAdapter(adapter);
	}

}
