package com.venomeye.icmsbulgaria.Activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.venomeye.icmsbulgaria.R;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.venomeye.icmsbulgaria.Utilities.Adapters.MarkerInfoWindowAdapter;

public class VenuesActivity extends AppCompatActivity implements OnMapReadyCallback,
        GoogleMap.OnMapLoadedCallback,
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener{

    private static final int MAP_ZOOM = 14;

    private static final double HOSPITAL_LATITUDE = 42.684819;
    private static final double HOSPITAL_LONGITUDE = 23.312402;

    private static final double PRECLINIC_CENTER_LATITUDE= 42.683656;
    private static final double PRECLINIC_CENTER_LONGITUDE = 23.313092;

    private GoogleMap mMap;
    private GoogleApiClient mGoogleApiClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venues);
        connectGoogleApiClient();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Venues");
    }


    @Override
    protected void onPause() {
        super.onPause();
    }

    private void connectGoogleApiClient() {
        if (mGoogleApiClient == null || !mGoogleApiClient.isConnected()) {
            buildGoogleApiClient();
            mGoogleApiClient.connect();
        }

        if (mMap == null) {
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);

            mapFragment.getMapAsync(this);
        }
    }

    @Override
    protected void onStop() {
        if(mGoogleApiClient!=null && mGoogleApiClient.isConnected()){
            mGoogleApiClient.disconnect();
        }

        super.onStop();
    }


    @Override
    public void onConnected(@Nullable Bundle bundle) {

    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }


    protected synchronized void buildGoogleApiClient() {
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        googleMap.setOnMapLoadedCallback(this);
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        googleMap.setInfoWindowAdapter(new MarkerInfoWindowAdapter(this));
        loadMarkersOnMap();
    }

    private void loadMarkersOnMap(){

        if(mMap != null){
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(HOSPITAL_LATITUDE, HOSPITAL_LONGITUDE))
                    .title("St Ekaterina Hospital")
                    .snippet("The St. Ekaterina University Hospital is a university " +
                            "hospital in Sofia, the capital of Bulgaria. It was formed in" +
                            " 1985 as a national centre for cardiovascular diseases led by " +
                            "professor Aleksandar Chirkov. "));

            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(PRECLINIC_CENTER_LATITUDE, PRECLINIC_CENTER_LONGITUDE))
                    .title("Preclinical University Center, Medical University Sofia")
                    .snippet("The Medical University of Sofia is a prestigious educational centre in Bulgaria"));

            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(42.682311, 23.3003315))
                    .title("University Hospital 'St Ivan Rilski'")
                    .snippet("This is a university, hospital located at Akademik Ivan Evstratiev Geshov Blvd. in Sofia."));

            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(42.6834575, 23.3093334))
                    .title("„Maychin Dom“ Hospital")
                    .snippet("Тhе hоѕріtаl tаkеѕ wоmеn fоr gуnесоlоgісаl саrе, bіrth, аll kіndѕ оf gуnесоlоgісаl ореrаtіоnѕ, " +
                            "mоnіtоrіng аnd trеаtmеnt оf gуnесоlоgіс раthоlоgу аnd оthеrѕ."));

            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(42.684273, 23.3171503))
                    .title("Culture Beat")
                    .snippet("Culture Beat is a picturesque place in the heart of Sofia in the NDK (National Place of Culture) complex which functions as a bar, café and a night club."));

            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(42.6847251, 23.3167497))
                    .title("National Palace of Culture")
                    .snippet("The National Palace of Culture  is the largest, multifunctional conference and exhibition centre in " +
                            "south-eastern Europe. It was opened in 1981 in celebration of Bulgaria's 1300th anniversary."));

            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(42.6843099, 23.2949802))
                    .title("Hotel Forum")
                    .snippet("THotel Forum is a business hotel located near the city center with convenient transport links to important administrative centers and sightseeing"));

            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(42.68146,23.3036613))
                    .title("SBALBB „Sveta Sofia“")
                    .snippet("The Specialized Hospital for Pulmonary Diseases is the only one in the country," +
                            "a national institution performing complex modern diagnostic, therapeutic," +
                            " surgical, teaching of pulmonary diseases."));
        }
    }


    @Override
    public void onMapLoaded() {
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(42.683351, 23.307084), MAP_ZOOM));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


