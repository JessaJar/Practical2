//Chiang James
//20014241

package sg.edu.rp.c346.id20014241.practical2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnScienceArt, btnNationalMuseum, btnSingaporeZoo, btnRiverSafari,btnUSS, btnChineseGarden, btnGardenByTheBay, btnBotanicalGarden, btnChinatown, btnFortCanning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnScienceArt = findViewById(R.id.buttonArtScienceMuseum);
        btnNationalMuseum = findViewById(R.id.buttonNationalMuseumOfSingpaore);
        btnSingaporeZoo = findViewById(R.id.buttonSingaporeZoo);
        btnRiverSafari = findViewById(R.id.buttonRiverSafari);
        btnUSS = findViewById(R.id.buttonUSS);
        btnChineseGarden = findViewById(R.id.buttonChineseGarden);
        btnGardenByTheBay = findViewById(R.id.buttonGardensByTheBay);
        btnBotanicalGarden = findViewById(R.id.buttonBotanicGarden);
        btnChinatown = findViewById(R.id.buttonChinatown);
        btnFortCanning = findViewById(R.id.buttonFortCanning);

        Intent openDOPOI = new Intent(MainActivity.this, DetailsOfPlaceOfInterest.class);

        btnScienceArt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Science Art Museum Selected", Toast.LENGTH_SHORT).show();
                openDOPOI.putExtra("b1", "Science Art Museum Details: ");
                startActivity(openDOPOI);
            }
        });

        btnNationalMuseum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "National Museum Of Singapore Selected", Toast.LENGTH_SHORT).show();
                openDOPOI.putExtra("b1","National Museum Of Singapore Details: ");
                startActivity(openDOPOI);
            }
        });
        btnSingaporeZoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Singapore Zoo Selected", Toast.LENGTH_SHORT).show();
                openDOPOI.putExtra("b1","Singapore Zoo Details: ");
                startActivity(openDOPOI);
            }
        });
        btnRiverSafari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "River Safari Selected", Toast.LENGTH_SHORT).show();
                openDOPOI.putExtra("b1","River Safari Details: ");
                startActivity(openDOPOI);
            }
        });
        btnUSS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Universal Studios Singapore Selected", Toast.LENGTH_SHORT).show();
                openDOPOI.putExtra("b1","Universal Studios Singapore Details: ");
                startActivity(openDOPOI);
            }
        });
        btnChineseGarden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Chinese Garden Selected", Toast.LENGTH_SHORT).show();
                openDOPOI.putExtra("b1","Chinese Garden Details: ");
                startActivity(openDOPOI);
            }
        });
        btnGardenByTheBay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Gardens By The Bay Selected", Toast.LENGTH_SHORT).show();
                openDOPOI.putExtra("b1","Gardens By The Bay Details: ");
                startActivity(openDOPOI);
            }
        });
        btnBotanicalGarden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Botanical Singapore Selected", Toast.LENGTH_SHORT).show();
                openDOPOI.putExtra("b1","Botanic Garden Details: ");
                startActivity(openDOPOI);
            }
        });
        btnChinatown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Chinatown Selected", Toast.LENGTH_SHORT).show();
                openDOPOI.putExtra("b1","Chinatown Details: ");
                startActivity(openDOPOI);
            }
        });
        btnFortCanning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Fort Canning Selected", Toast.LENGTH_SHORT).show();
                openDOPOI.putExtra("b1","Fort Canning Details: ");
                startActivity(openDOPOI);
            }
        });


    }


}