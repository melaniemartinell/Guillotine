package com.example.administrator.guillotine;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private TextView promptTextBox;
    private Spinner yourActionCards;
    private Spinner yourNobleCards;
    private TextView player2NumCards;
    private TextView player3NumCards;
    private TextView player4NumCards;
    private FrameLayout popUpActionCard;
    private Button pass;
    private ImageView imageofActionCardChosen;
    private ArrayList<String> yourActionCardNames;
    private ArrayList<String> yourNobleCardNames;
    private ImageView noble1;
    private FrameLayout popUpNobleZoomed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        promptTextBox = (TextView)findViewById(R.id.PromptTextBox);
        yourActionCards = (Spinner)findViewById(R.id.spinnerYourActions);
        yourNobleCards = (Spinner)findViewById(R.id.spinnerYourNobles);
        player2NumCards = (TextView)findViewById(R.id.player2NumCards);
        player3NumCards = (TextView)findViewById(R.id.player3NumCards);
        player4NumCards = (TextView)findViewById(R.id.player4NumCards);
        popUpActionCard = (FrameLayout)findViewById(R.id.LayoutForActionCard);
        popUpNobleZoomed = (FrameLayout)findViewById(R.id.FrameLayoutZoomNoble);


        //DELETE THIS
        //This shows how you can easily change the image of the nobles
        //We need to store the name of the card's image so it can be easily accessed
        noble1 = (ImageView)findViewById(R.id.noble1);
        noble1.setImageResource(R.mipmap.actionback);



        imageofActionCardChosen = (ImageView)findViewById(R.id.imageViewForActionCardChosen);
        //makes sure the popup layout is not visible until button is clicked
        popUpActionCard.setVisibility(View.INVISIBLE);
        popUpNobleZoomed.setVisibility(View.INVISIBLE);
        pass = (Button)findViewById(R.id.PassButton);
        //sets the orientation of the screen to landscape
        lockOrientationLandscape(MainActivity.this);

        //change the length based on how many nobles possible
        //and action cards possible. I don't know how many.
        yourActionCardNames = new ArrayList<String>();
        yourNobleCardNames = new ArrayList<String>();

        yourNobleCardNames.add("---Noble Cards---");
        yourActionCardNames.add("---Action Cards---");



        //set action card spinner
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, yourActionCardNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // bind the spinner and adapter
        yourActionCards.setAdapter(adapter);


        //set noble card spinner
        ArrayAdapter adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, yourNobleCardNames);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // bind the spinner and adapter
        yourNobleCards.setAdapter(adapter2);



        //creates inner classes to collect data from the spinners
        yourActionCards.setOnItemSelectedListener(new SpinnerListenerAction());
        yourNobleCards.setOnItemSelectedListener(new SpinnerListenerNoble());


    }
    private class SpinnerListenerAction implements AdapterView.OnItemSelectedListener {

        /**
         * @see android.widget.AdapterView.OnItemSelectedListener#onItemSelected(
         *android.widget.AdapterView, android.view.View, int, long)
         */
        @Override
        public void onItemSelected(AdapterView<?> parentView, View selectedItemView,
                                   int position, long id) {
            // set the image to the one corresponding to the index selected by the spinner
            //imageView.setImageBitmap(images.get(position));


        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }



    }
    private class SpinnerListenerNoble implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parentView, View selectedItemView,
                                   int position, long id) {
            // set the image to the one corresponding to the index selected by the spinner
            //imageView.setImageBitmap(images.get(position));


        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }




    }

    public static void lockOrientationLandscape(Activity activity) {
        activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    //if action card1 is clicked on
    public void nobleOne(View view){

        //example: used to show that the image is clickable
        //make sure to DELETE THIS
        popUpNobleZoomed.setVisibility(view.VISIBLE);

    }
    public void nobleTwo(View view){

    }
    public void nobleThree(View view){

    }
    public void nobleFour(View view){

    }
    public void nobleFive(View view){

    }
    public void nobleSix(View view){

    }
    public void nobleSeven(View view){

    }
    public void nobleEight(View view){

    }
    public void nobleNine(View view){

    }
    public void nobleTen(View view){

    }
    public void nobleEleven(View view){

    }
    public void nobleTwelve(View view){

    }
    //chooses the noble that the spinner is currently on
    public void chooseNobleButton(View view){
        popUpNobleZoomed.setVisibility(view.VISIBLE);

    }
    //opens up a new window in which the action card should be shown
    //as an image in the imageView: imageOfActionCardChosen
    public void showActionButton(View view){

        popUpActionCard.setVisibility(view.VISIBLE);
        pass.setVisibility(view.INVISIBLE);

    }
    public void passButton(View view){

    }
    public void menuButton(View view){

    }
    public void helpButton(View view){

    }
    //images that were turned button on the left hand side
    //allows the user to get a new action card if prompted
    public void actionCardDrawButton(View view){

    }
    //chooses the action card displayed on the pop up screen
    //to play
    public void chooseActionCardToPlay(View view){

    }
    //pop up will disappear
    public void goBackToPlay(View view){
        popUpActionCard.setVisibility(view.INVISIBLE);
        pass.setVisibility(view.VISIBLE);

    }
    public void goBackFromZoomedNoble(View view){
        popUpNobleZoomed.setVisibility(view.INVISIBLE);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
