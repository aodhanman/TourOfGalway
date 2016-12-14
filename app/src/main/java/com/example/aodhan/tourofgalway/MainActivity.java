package com.example.aodhan.tourofgalway;

import android.content.Intent;
import android.icu.util.TimeZone;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextClock;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer welcomenoise = MediaPlayer.create(this, R.raw.galway);

            Button welcome = (Button)findViewById(R.id.welcome);
            welcome.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    welcomenoise.start();

                }
            });

            Button TourComp = (Button)findViewById(R.id.TourComp);
            TourComp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent site = new Intent();
                    site.setAction(Intent.ACTION_VIEW);
                    site.addCategory(Intent.CATEGORY_BROWSABLE);
                    site.setData(Uri.parse("http://www.galwaytourcompany.com/gtc/daytours.jsp"));
                    startActivity(site);

                }
            });

            Button restaurantb = (Button)findViewById(R.id.restaurantb);
            restaurantb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent site = new Intent();
                    site.setAction(Intent.ACTION_VIEW);
                    site.addCategory(Intent.CATEGORY_BROWSABLE);
                    site.setData(Uri.parse("http://www.ireland-guide.com/discover/Galway-Restaurants.5691.html"));
                    startActivity(site);

                }
            });
        ToggleButton toggle = (ToggleButton) findViewById(R.id.togglelang);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Button TourComp = (Button)findViewById(R.id.TourComp);
                    TourComp.setText("Cuideachta Turas");
                    Button restaurant = (Button)findViewById(R.id.restaurantb);
                    restaurant.setText("Bhialann");
                    Button map = (Button)findViewById(R.id.mapbutton);
                    map.setText("Léarscáil");
                    Button mapimg = (Button)findViewById(R.id.exitmap);
                    mapimg.setText("An slí amach na Léarscáil");
                    Button busb = (Button)findViewById(R.id.busbutton);
                    busb.setText("Bus Eolas");
                    Button convert = (Button)findViewById(R.id.converter);
                    convert.setText("Tiontaire Airgeadra");
                    Button island = (Button)findViewById(R.id.islands);
                    island.setText("Oileáin Árann");
                    Button welcome = (Button)findViewById(R.id.welcome);
                    welcome.setText("Fáilte");
                } else {
                    Button TourComp = (Button)findViewById(R.id.TourComp);
                    TourComp.setText("Tour Company");
                    Button restaurant = (Button)findViewById(R.id.restaurantb);
                    restaurant.setText("Restaurant");
                    Button map = (Button)findViewById(R.id.mapbutton);
                    map.setText("Map");
                    Button mapimg = (Button)findViewById(R.id.exitmap);
                    mapimg.setText("Map Exit");
                    Button busb = (Button)findViewById(R.id.busbutton);
                    busb.setText("Bus");
                    Button convert = (Button)findViewById(R.id.converter);
                    convert.setText("Currency Converter");
                    Button island = (Button)findViewById(R.id.islands);
                    island.setText("Aran Islands");
                    Button welcome = (Button)findViewById(R.id.welcome);
                    welcome.setText("Welcome");

                }
            }
        });

        Button mapimg = (Button)findViewById(R.id.mapbutton);
        mapimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView iv=(ImageView) findViewById(R.id.mapimage);
                Button mapexit = (Button)findViewById(R.id.exitmap);
                iv.setVisibility(View.VISIBLE);
                mapexit.setVisibility(View.VISIBLE);
                Button map = (Button)findViewById(R.id.mapbutton);
                map.setVisibility(View.GONE);
                Button restaurant = (Button)findViewById(R.id.restaurantb);
                restaurant.setVisibility(View.GONE);
                Button convert = (Button)findViewById(R.id.converter);
                convert.setVisibility(View.GONE);
                Button island = (Button)findViewById(R.id.islands);
                island.setVisibility(View.GONE);
                Button welcome = (Button)findViewById(R.id.welcome);
                welcome.setVisibility(View.GONE);
                Button tourcompo = (Button)findViewById(R.id.TourComp);
                tourcompo.setVisibility(View.GONE);
                Button bus = (Button)findViewById(R.id.busbutton);
                bus.setVisibility(View.GONE);
            }

            });

        Button mapexit = (Button)findViewById(R.id.exitmap);
        mapexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView iv=(ImageView) findViewById(R.id.mapimage);
                Button mapexit = (Button)findViewById(R.id.exitmap);
                iv.setVisibility(View.GONE);
                mapexit.setVisibility(View.GONE);
                Button map = (Button)findViewById(R.id.mapbutton);
                map.setVisibility(View.VISIBLE);
                Button restaurant = (Button)findViewById(R.id.restaurantb);
                restaurant.setVisibility(View.VISIBLE);
                Button convert = (Button)findViewById(R.id.converter);
                convert.setVisibility(View.VISIBLE);
                Button island = (Button)findViewById(R.id.islands);
                island.setVisibility(View.VISIBLE);
                Button welcome = (Button)findViewById(R.id.welcome);
                welcome.setVisibility(View.VISIBLE);
                Button tourcompo = (Button)findViewById(R.id.TourComp);
                tourcompo.setVisibility(View.VISIBLE);
                Button bus = (Button)findViewById(R.id.busbutton);
                bus.setVisibility(View.VISIBLE);

            }

        });

        Button bus = (Button)findViewById(R.id.busbutton);
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent site = new Intent();
                site.setAction(Intent.ACTION_VIEW);
                site.addCategory(Intent.CATEGORY_BROWSABLE);
                site.setData(Uri.parse("http://www.galwaytransport.info/2009/07/city-bus-services.html"));
                startActivity(site);

            }
        });
        TextClock clock = (TextClock)findViewById(R.id.textClock);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            clock.setTimeZone(String.valueOf(TimeZone.getTimeZone("GMT")));
        }

        Button convert = (Button)findViewById(R.id.converter);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, convert.class));

            }
        });

        Button land = (Button)findViewById(R.id.islands);
        land.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent site = new Intent();
                site.setAction(Intent.ACTION_VIEW);
                site.addCategory(Intent.CATEGORY_BROWSABLE);
                site.setData(Uri.parse("http://www.aranislands.ie/"));
                startActivity(site);

            }
        });



    }}






