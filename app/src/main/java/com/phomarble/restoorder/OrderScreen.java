package com.phomarble.restoorder;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class OrderScreen extends AppCompatActivity {

    CustomItemDialog cid;
    Order order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView currentOrder = (ListView) findViewById(R.id.orderScreenList);

        final ArrayAdapter<MenuItem> adapter = new ArrayAdapter<MenuItem>(this, android.R.layout.simple_list_item_1, order.getItemsOrdered()) {

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView tv = (TextView) view.findViewById(android.R.id.text1);

                String itemNumber = order.getItemsOrdered().get(position).getItemNumber();
                String itemNameEN = order.getItemsOrdered().get(position).getItemNameEN();
                String itemNameVI = order.getItemsOrdered().get(position).getItemNameVI();
                String itemNameZH = order.getItemsOrdered().get(position).getItemNameZH();

                tv.setText("Item Number:" + itemNumber + "\n" + itemNameEN + "\n" + itemNameVI + "\n" + itemNameZH);
                tv.setTextColor(Color.BLACK);
                return view;
            }
        };

        // Set the adapter to the listview
        currentOrder.setAdapter(adapter);

        /**
         * If a post is clicked, store the post in CurrentUser and change activities to
         * RideOfferDetailsUIActivity.
         * @see CurrentUser
         * @see RideOfferDetailsUIActivity
         */
        currentOrder.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {

                // Change to open dialog box so the order can be modified
//                Intent RideOfferDetailsIntent = new Intent(OrderScreen.this,
//                        RideOfferDetailsUIActivity.class);
//                startActivity(RideOfferDetailsIntent);
            }
        });
    }

    public void addItem(View v) {
        cid = new CustomItemDialog(this);
        cid.show();
    }

    public void confirmItem(View v) {
        Toast.makeText(this, "Order Added!", Toast.LENGTH_SHORT).show();
        cid.dismiss();
    }

    public void cancelItem(View v) {
        Toast.makeText(this, "Order Canceled", Toast.LENGTH_SHORT).show();
        cid.dismiss();
    }
}
