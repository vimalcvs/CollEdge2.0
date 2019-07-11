package com.vimalcvs.colledge.honours.baheconomic.sem3;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import com.vimalcvs.colledge.R;
import com.vimalcvs.colledge.helper.ExpandedMenuModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** * Created by VimalCVS on 22/08/18. */
public class BAEconomic_Hons_SEM3 extends AppCompatActivity {


    com.vimalcvs.colledge.helper.ExpandableListAdapter mMenuAdapter;
    ExpandableListView expandableList;
    List<ExpandedMenuModel> listDataHeader;
    HashMap<ExpandedMenuModel, List<String>> listDataChild;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expandablelistview);

        expandableList = (ExpandableListView) findViewById(R.id.expandableListView);

        prepareListData();

        mMenuAdapter = new com.vimalcvs.colledge.helper.ExpandableListAdapter(this, listDataHeader, listDataChild, expandableList);

        expandableList.setAdapter(mMenuAdapter);

        expandableList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition, long l) {
                switch (groupPosition) {
                    case 0:                                 //Intermediate Macroeconomics-1
                        switch (childPosition) {
                            case 0:                             //GL
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FIntermediate%20Macroeconomics-1%2FGL.pdf?alt=media&token=37f4e2f5-7eaf-4859-a955-6dc940f50f40");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //RB
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FIntermediate%20Macroeconomics-1%2FRB.pdf?alt=media&token=1d3eb4f3-52d9-4f12-b788-0087521916d7");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                        }
                        break;
                    case 1:                                 //Intermediate Microeconomics-1
                        switch (childPosition) {
                            case 0:                             //NOTES - Budget Constraint
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FIntermediate%20Microeconomics-1%2FNOTES%20-%20Budget%20Constraint.pdf?alt=media&token=ae1e60b3-2cd8-4f71-918e-90483dc1a917");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - Preferences And Indifference Curves
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FIntermediate%20Microeconomics-1%2FNOTES%20-%20Preferences%20And%20Indifference%20Curves.pdf?alt=media&token=9613a8c2-b3a2-421a-9cf5-5b190af86d7e");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - Consumer Optimization
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FIntermediate%20Microeconomics-1%2FNOTES%20-%20Consumer%20Optimization.pdf?alt=media&token=0b4c8e70-091e-4a66-8a60-89f4a26d5df8");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //GL
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FIntermediate%20Microeconomics-1%2FGL.pdf?alt=media&token=29b2ca62-e4f5-4925-995f-2b7b11f97a3c");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //RB
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FIntermediate%20Microeconomics-1%2FRB.pdf?alt=media&token=6c5e8977-72c4-4540-8b6b-766c88b06467");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                        }
                        break;
                    case 2:                                 //Statistical Methods for Economics
                        switch (childPosition) {
                            case 0:                             //NOTES - Introduction of Statistics
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FStatistical%20Methods%20for%20Economics%2FNOTES%20-%20Introduction%20of%20Statistics.pdf?alt=media&token=0d749273-b656-4b82-ab05-e21446ba9ae6");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - Numerical Measures in Descriptive Statistics
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FStatistical%20Methods%20for%20Economics%2FNOTES%20-%20Numerical%20Measures%20in%20Descriptive%20Statistics%203.pdf?alt=media&token=cd8be7f4-9c20-4002-b120-9de685b7d660");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - Elementary Probability Theory
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FStatistical%20Methods%20for%20Economics%2FNOTES%20-%20ELEMENTARY%20PROBABILITY%20THEORY%20Neha.pdf?alt=media&token=95de100f-846f-474b-937a-056f968ccb2b");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //NOTES - Conditional Probability
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FStatistical%20Methods%20for%20Economics%2FNOTES%20-%20CONDITIONAL%20PROBABILITY%20-%20Neha.pdf?alt=media&token=f8ceaee4-cb31-404c-a913-dadad2fa4d71");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //NOTES - Discrete Random Variables And Probability Distributions
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FStatistical%20Methods%20for%20Economics%2FNOTES%20-%20Discrete%20Random%20Variables%20And%20Probability%20Distributions%20Edit.pdf?alt=media&token=e4ad221d-8745-4d51-a41b-533d68defbab");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //NOTES - Continuous Random Variables
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FStatistical%20Methods%20for%20Economics%2FNOTES%20-%20Continuous%20random%20variables%20Edit.pdf?alt=media&token=f5e4ad89-0406-42a1-9a7e-79f6142345b6");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                            case 6:                             //NOTES - Mathematical Expectation Discrete
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FStatistical%20Methods%20for%20Economics%2FNOTES%20-%20Mathematical%20expectation%20discrete.pdf?alt=media&token=6f83f8a7-abee-44f3-9608-7db8913fb1fb");
                                DownloadManager.Request request6 = new DownloadManager.Request(uri6);
                                request6.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference6 = downloadManager6.enqueue(request6);
                                break;
                            case 7:                             //Mathematical Expectation Continuous
                                DownloadManager downloadManager7;
                                downloadManager7 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri7 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FStatistical%20Methods%20for%20Economics%2FNOTES%20-%20Mathematical%20expectation%20continuous.pdf?alt=media&token=9eea0e7c-3bbb-43f9-8162-ddb4f428705f");
                                DownloadManager.Request request7 = new DownloadManager.Request(uri7);
                                request7.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference7 = downloadManager7.enqueue(request7);
                                break;
                            case 8:                             //NOTES - Theoretical Distibutions: Discrete and Continuous
                                DownloadManager downloadManager8;
                                downloadManager8 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri8 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FStatistical%20Methods%20for%20Economics%2FNOTES%20-%20Theoretical%20Distibutions%20%20Discrete%20and%20Continuous.pdf?alt=media&token=7d26a137-92b4-4c7f-8730-1c050f9fad2b");
                                DownloadManager.Request request8 = new DownloadManager.Request(uri8);
                                request8.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference8 = downloadManager8.enqueue(request8);
                                break;
                            case 9:                             //NOTES - Covariance and correlation
                                DownloadManager downloadManager9;
                                downloadManager9 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri9 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FStatistical%20Methods%20for%20Economics%2FNOTES%20-%20Covariance%20and%20correlation.pdf?alt=media&token=ed4a652e-4522-45b1-8064-efd49921ec6a");
                                DownloadManager.Request request9 = new DownloadManager.Request(uri9);
                                request9.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference9 = downloadManager9.enqueue(request9);
                                break;
                            case 10:                             //NOTES - Joint Probability Distribution
                                DownloadManager downloadManager10;
                                downloadManager10 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri10 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FStatistical%20Methods%20for%20Economics%2FNOTES%20-%20Joint%20Probability%20Distribution.pdf?alt=media&token=2163a8ab-c8cc-4d38-bf48-01517859ac5c");
                                DownloadManager.Request request10= new DownloadManager.Request(uri10);
                                request10.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference10 = downloadManager10.enqueue(request10);
                                break;
                            case 11:                             //NOTES - Mathematical Expectation for Joint Probability Distribution
                                DownloadManager downloadManager11;
                                downloadManager11 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri11 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FStatistical%20Methods%20for%20Economics%2FNOTES%20-%20Mathematical%20Expectation%20for%20Joint%20Probability%20Distribution%2010022014.pdf?alt=media&token=85a73065-e5aa-49a9-8483-3fae950aca7c");
                                DownloadManager.Request request11 = new DownloadManager.Request(uri11);
                                request11.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference11 = downloadManager11.enqueue(request11);
                                break;
                            case 12:                             //GL
                                DownloadManager downloadManager12;
                                downloadManager12 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri12 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FStatistical%20Methods%20for%20Economics%2FGL.pdf?alt=media&token=47e9ab46-c742-49ac-9f73-b8906a211190");
                                DownloadManager.Request request12 = new DownloadManager.Request(uri12);
                                request12.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference12 = downloadManager12.enqueue(request12);
                                break;
                            case 13:                             //RB
                                DownloadManager downloadManager13;
                                downloadManager13 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri13 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%203%2FStatistical%20Methods%20for%20Economics%2FRB.pdf?alt=media&token=c1d2383d-7f29-4aa8-a567-bfdc3506070b");
                                DownloadManager.Request request13 = new DownloadManager.Request(uri13);
                                request13.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference13 = downloadManager13.enqueue(request13);
                                break;
                        }
                        break;
                }
                return true;
            }

        });
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<ExpandedMenuModel>();
        listDataChild = new HashMap<ExpandedMenuModel, List<String>>();

        ExpandedMenuModel item1 = new ExpandedMenuModel();
        item1.setName("Intermediate Macroeconomics-1");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("Intermediate Microeconomics-1");
        listDataHeader.add(item2);

        ExpandedMenuModel item3 = new ExpandedMenuModel();
        item3.setName("Statistical Methods for Economics");
        listDataHeader.add(item3);


        //Intermediate Macroeconomics-1
        List<String> heading1 = new ArrayList<>();
        heading1.add("Guidelines");
        heading1.add("Recommended Books");

        //Intermediate Microeconomics-1
        List<String> heading2 = new ArrayList<String>();
        heading2.add("NOTES - Budget Constraint");
        heading2.add("NOTES - Preferences And Indifference Curves");
        heading2.add("NOTES - Consumer Optimization");
        heading2.add("Guidelines");
        heading2.add("Recommended Books");

        //Statistical Methods for Economics
        List<String> heading3 = new ArrayList<String>();
        heading3.add("NOTES - Introduction of Statistics");
        heading3.add("NOTES - Numerical Measures in Descriptive Statistics");
        heading3.add("NOTES - Elementary Probability Theory");
        heading3.add("NOTES - Conditional Probability");
        heading3.add("NOTES - Discrete Random Variables And Probability Distributions ");
        heading3.add("NOTES - Continuous Random Variables");
        heading3.add("NOTES - Mathematical Expectation Discrete");
        heading3.add("NOTES - Mathematical Expectation Continuous");
        heading3.add("NOTES - Theoretical Distibutions: Discrete and Continuous");
        heading3.add("NOTES - Covariance and correlation");
        heading3.add("NOTES - Joint Probability Distribution");
        heading3.add("NOTES - Mathematical Expectation for Joint Probability Distribution");
        heading3.add("Guidelines");
        heading3.add("Recommended Books");


        listDataChild.put(listDataHeader.get(0), heading1);             //Intermediate Macroeconomics-1
        listDataChild.put(listDataHeader.get(1), heading2);             //Intermediate Microeconomics-1
        listDataChild.put(listDataHeader.get(2), heading3);             //Statistical Methods for Economics

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
