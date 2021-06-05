package sg.edu.rp.c346.id20014241.practical2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsOfPlaceOfInterest extends AppCompatActivity {

    TextView tvDisplay, tvLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_of_place_of_interest);

        tvLink = findViewById(R.id.textViewlink);
        tvDisplay = findViewById(R.id.textViewDisplay);
        registerForContextMenu(tvDisplay);

        Intent displayedDetails = getIntent();
        String buttonSelec = displayedDetails.getStringExtra("b1");
        tvDisplay.setText(buttonSelec + "..... ");

        Intent websiteIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nhb.gov.sg/nationalmuseum/"));
        Intent websiteIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nparks.gov.sg/sbg"));
        Intent websiteIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wrs.com.sg/en/singapore-zoo.html"));
        Intent websiteIntent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wrs.com.sg/en/river-safari.html"));
        Intent websiteIntent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.marinabaysands.com/museum.html"));
        Intent websiteIntent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rwsentosa.com/en/attractions/universal-studios-singapore/explore"));
        Intent websiteIntent8 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nparks.gov.sg/gardens-parks-and-nature/parks-and-nature-reserves/jurong-lake-gardens"));
        Intent websiteIntent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gardensbythebay.com.sg/en.html"));
        Intent websiteIntent10 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://chinatown.sg/"));
        Intent websiteIntent11 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nparks.gov.sg/gardens-parks-and-nature/parks-and-nature-reserves/fort-canning-park"));


        if (buttonSelec.equals("Science Art Museum Details: ")){
            tvDisplay.setText("The ArtScience Museum is one of the iconic structures that make up " +
                    "the Marina Bay Sands Integrated Resort. Recognisable for its distinct " +
                    "shape, the museum blends the worlds of art and science together through" +
                    " carefully curated exhibitions. The ArtScience Museum has recently revamped " +
                    "their now permanent exhibition Future World, where visitors can explore an " +
                    "interactive high-tech collection of digital installations." +
                    "\n\nLocation: 6 Bayfront Avenue, Downtown Core, Singapore, 18974, Singapore" +
                    "\n\nContact Us: +6566888888" );
            tvLink.setText("\n\nWebsite: " + "https://www.marinabaysands.com/museum.html");
            tvLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(websiteIntent6);
                }
            });
        }
        else if (buttonSelec.equals("National Museum Of Singapore Details: ")){
            tvDisplay.setText("Singapore’s largest museum, the National Museum of Singapore" +
                    " houses two main galleries: the Singapore Living Galleries with " +
                    "exhibitions on food, photography, film, and fashion, and the History Gallery, " +
                    "which traces the island’s history from the 14th century.." +
                    "\n\nLocation: 93 Stamford Road, Museum, Singapore, 178897, Singapore" +
                    "\n\nContact Us: +6563323659" );
            tvLink.setText("\n\nWebsite: " + "https://www.marinabaysands.com/museum.html");
            tvLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(websiteIntent2);
                }
            });
        }
        else if (buttonSelec.equals("Singapore Zoo Details: ")){
            tvDisplay.setText("Famous for its ‘open’ captivity models, the Singapore Zoo is " +
                    "designed so that many of the animals are kept in large enclosures that " +
                    "are surrounded by moats and other relatively noninvasive barriers. The " +
                    "zoo is home to over 300 animal species, 15% of which are classified as " +
                    "threatened." +
                    "\n\nLocation: Central Water Catchment, Singapore, 729826, Singapore" +
                    "\n\nContact Us: +6562693411" );
            tvLink.setText("\n\nWebsite: " + "https://www.wrs.com.sg/en/singapore-zoo.html");
            tvLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(websiteIntent4);
                }
            });
        }
        else if (buttonSelec.equals("Botanic Garden Details: ")){
            tvDisplay.setText("The Singapore Botanic Gardens first opened in 1859, making " +
                    "them one of Singapore’s oldest parks and explaining how such a large " +
                    "complex came to exist in the middle of the busy city-state. The park is " +
                    "home to over 10,000 species of plants, and it is one of the premier orchid " +
                    "research and breeding centres in the world. With relatively quiet grounds, " +
                    "the park is also home to a veritable host of jungle creatures, including " +
                    "three-foot long monitor lizards – but don’t worry, they are quite harmless " +
                    "to people as long as they are not antagonised." +
                    "\n \nLocation: 93 Stamford Road, Museum, Singapore, 178897, Singapore" +
                    "\n \nContact Us: +6563323659" );
            tvLink.setText("\n\nWebsite: " + "https://www.nparks.gov.sg/sbg");
            tvLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(websiteIntent3);
                }
            });
        }
        else if (buttonSelec.equals("River Safari Details: ")){
            tvDisplay.setText("At the River Safari, visitors ride a boat through Singapore’s " +
                    "tropical forests. Freshwater animals live on either side of the river, " +
                    "including American beavers, anacondas and adorable giant pandas.." +
                    "\n\nLocation: 80 Mandai Lake Road, Central Water Catchment, Singapore, 729826, Singapore" +
                    "\n\nContact Us: +6562693411" );
            tvLink.setText("\n\nWebsite: " + "https://www.wrs.com.sg/en/river-safari.html");
            tvLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(websiteIntent5);
                }
            });
        }
        else if (buttonSelec.equals("Universal Studios Singapore Details: ")){
            tvDisplay.setText("Get your adrenaline pumping at Universal Studios Singapore! " +
                    "Located on Sentosa Island and part of Resorts World, the amusement " +
                    "park is home to seven themed zones, so there’s something for the whole family." +
                    " Horror film lovers should try to time their visit for October, when Universal " +
                    "Studios Singapore goes all out with their Halloween Horror Nights." +
                    "\n\nLocation: 8 Sentosa Gateway, Southern Islands, 98269, Singapore" +
                    "\n\nContact Us: +6565778888" );
            tvLink.setText("\n\nWebsite: " + "https://www.rwsentosa.com/en/attractions/universal-studios-singapore/explore");
            tvLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(websiteIntent7);
                }
            });
        }
        else if (buttonSelec.equals("Chinese Garden Details: ")){
            tvDisplay.setText("Get out of the city and head west to the Chinese and " +
                    "Japanese Gardens. During the weekend, people play cricket in one of " +
                    "the park’s open spaces. Tucked into one area of the Chinese Gardens is " +
                    "the Live Turtle & Tortoise Museum, which showcases the world’s largest " +
                    "collection of turtle and tortoise items." +
                    "\n\nBoon Lay Way, Jurong East, Singapore, 619795, Singapore" +
                    "\n\nContact Us: +6518004717300\n");
            tvLink.setText("\n\nWebsite: " + "https://www.nparks.gov.sg/gardens-parks-and-nature/parks-and-nature-reserves/jurong-lake-gardens");
            tvLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(websiteIntent8);
                }
            });
        }
        else if (buttonSelec.equals("Gardens By The Bay Details: ")){
            tvDisplay.setText("Singapore’s most recognisable garden, Gardens by the Bay is " +
                    "known for its extraordinary landscape, namely the SuperTree Grove " +
                    "featuring 18 vertical gardens that reach a height of 16 stories! " +
                    "Other attractions include the two conservatory domes, the OCBC Skywalk " +
                    "and Marina Barrage." +
                    "\n\nLocation: 18 Marina Gardens Drive, Marina South, Singapore, 18953, Singapore" +
                    "\n\nContact Us: +6564206848");
            tvLink.setText("\n\nWebsite: " + "https://www.gardensbythebay.com.sg/en.html");
            tvLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(websiteIntent9);
                }
            });
        }
        else if (buttonSelec.equals("Chinatown Details: ")){
            tvDisplay.setText("Chinatown is very touristy but still worth walking through. Skip " +
                    "the souvenir shopping on Pagoda Street and instead head over to Smith Street, " +
                    "where you’ll find the Chinatown Food Street, a covered area with an excellent " +
                    "selection of hawker stalls. Walk up to the Buddha Tooth Relic Temple and " +
                    "Museum at the end of the street to learn a little about Buddhist culture." +
                    "\n\nLocation: Chinatown, Singapore, Singapore");
            tvLink.setText("\n\nWebsite: " + "https://chinatown.sg/");
            tvLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(websiteIntent10);
                }
            });
        }
        else if (buttonSelec.equals("Fort Canning Details: ")){
            tvDisplay.setText("Fort Canning is located right in the centre of the island. " +
                    "The place has played a significant role in the history of Singapore: " +
                    "Sir Stamford Raffles built his first home on Fort Canning hill, and " +
                    "during World War II it served as the headquarters of the British Army and " +
                    "later as the Japanese Army during their occupation of Singapore." +
                    "\n\nLocation: River Valley Road, Museum, Singapore, 179037, Singapore" +
                    "\n\nContact Us: +6518004717300");
            tvLink.setText("\n\nWebsite: " + "https://www.nparks.gov.sg/gardens-parks-and-nature/parks-and-nature-reserves/fort-canning-park");
            tvLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(websiteIntent11);
                }
            });
        }


    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0,"Increase Text Size");
        menu.add(0,1,1,"Decrease Text Size");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == 0){
            tvDisplay.setTextSize(24);
            tvLink.setTextSize(24);
        }
        else if (item.getItemId() == 1){
            tvDisplay.setTextSize(10);
            tvLink.setTextSize(10);
        }
        return super.onContextItemSelected(item);
    }

}