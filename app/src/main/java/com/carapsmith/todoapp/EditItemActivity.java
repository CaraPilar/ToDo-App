package com.carapsmith.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText etEditItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String item = getIntent().getStringExtra("item");
        etEditItem = (EditText) findViewById(R.id.etEditItem);
        etEditItem.setText(item.toString());
        etEditItem.setSelection(etEditItem.getText().length());

    }

    public void onSaveEdit(View view) {
        etEditItem = (EditText) findViewById(R.id.etEditItem);
        etEditItem.getText().toString();
        Intent data = new Intent();
        data.putExtra("newValue", etEditItem.getText().toString());
        data.putExtra("itemPosition", getIntent().getIntExtra("position", 0));
        setResult(RESULT_OK, data);
        this.finish();
    }

    public void onCancelEdit(View view) {
        this.finish();
    }
}
