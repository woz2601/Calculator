package com.woz.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends Activity
{
	private EditText _xText;
	private EditText _yText;

	private float _x;
	private float _y;

	private TextView _resultText;

	public void onCreate(Bundle savedState)
	{
		super.onCreate(savedState);
		setContentView(R.layout.main_layout);

		 _xText = (EditText) findViewById(R.id.xValue);
		 _yText = (EditText) findViewById(R.id.yValue);

		_x = 0;
		_y = 0;

		_resultText = (TextView) findViewById(R.id.result);
	}

	public void setValues()
	{
		_x = Float.valueOf(_xText.getText().toString());
		_y = Float.valueOf(_yText.getText().toString());
	}

	public void displayResult(float result, String symbol)
	{
		_resultText.setText(_x  + symbol + _y + " = " + result);
	}


	public void add(View view)
	{
		setValues();
		displayResult(_x + _y, "+");
	}

	public void subtract(View view)
	{
		setValues();
		displayResult(_x - _y, "-");
	}

	public void multiply(View view)
	{
		setValues();
		displayResult(_x * _y, "*");
	}

	public void divide(View view)
	{
		setValues();
		if (_y != 0)
			displayResult(_x / _y, "/");
		else
			_resultText.setText("Cannot divide by 0");
	}

}
