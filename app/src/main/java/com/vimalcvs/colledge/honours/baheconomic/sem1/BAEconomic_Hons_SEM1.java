package com.vimalcvs.colledge.honours.baheconomic.sem1;

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

public class BAEconomic_Hons_SEM1 extends AppCompatActivity {


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
                    case 0:                             //Introductory Microeconomics
                        switch (childPosition) {
                            case 0:                             //NOTES - Introduction to Microeconomics
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FIntroductory%20Microeconomics%2FNOTES%20-%20Introduction%20to%20Microeconomics.pdf?alt=media&token=0d1c5576-5663-4008-900a-0cd13171eae5");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - Nature and Subject Matter of Economics
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FIntroductory%20Microeconomics%2FNOTES%20-%20Nature%20and%20Subject%20Matter%20of%20Economics.pdf?alt=media&token=5c6ba4f6-07a0-42cf-852d-e780a27595fb");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - Demand, Supply and Market Equilibrium
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FIntroductory%20Microeconomics%2FNOTES%20-%20Demand%2C%20Supply%20and%20Market%20Equilibrium.pdf?alt=media&token=a83d941e-6063-48b7-b36a-3e476d7d2997");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //NOTES - The Concept of Demand, Supply & Elasticity
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FIntroductory%20Microeconomics%2FNOTES%20-%20Demand%20and%20Supply.pdf?alt=media&token=b548f6fa-d039-443c-ad01-4571fa9d2068");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //NOTES - The Theory Of Consumer Choice
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FIntroductory%20Microeconomics%2FNOTES%20-%20The%20Theory%20Of%20Consumer%20Choice.pdf?alt=media&token=cd3d8f96-d035-4be9-8e77-18d062918b6e");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //NOTES - Long Run Costs and Output Decisions
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FIntroductory%20Microeconomics%2FNOTES%20-%20Consumers%20and%20firms%20long%20run%20cost.pdf?alt=media&token=bc948fa7-6dfd-4b2b-978f-832d3834dd6a");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                            case 6:                             //NOTES - Behavior of Profit Maximizing Firms and The Production Process
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FIntroductory%20Microeconomics%2FNOTES%20-%20Behavior%20of%20Profit%20Maximizing%20Firms%20and%20The%20Production%20Process.pdf?alt=media&token=5adf9212-d185-4339-bbb8-fc676b19d840");
                                DownloadManager.Request request6 = new DownloadManager.Request(uri6);
                                request6.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference6 = downloadManager6.enqueue(request6);
                                break;
                            case 7:                             //NOTES - Monopoly and the Antitrust Policies of the Government
                                DownloadManager downloadManager7;
                                downloadManager7 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri7 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FIntroductory%20Microeconomics%2FNOTES%20-%20Monopoly%20and%20the%20Antitrust%20Policies%20of%20the%20Government.pdf?alt=media&token=9fd39b56-5061-46d4-8d5d-ea3d0737b808");
                                DownloadManager.Request request7 = new DownloadManager.Request(uri7);
                                request7.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference7 = downloadManager7.enqueue(request7);
                                break;
                            case 8:                             //NOTES - The Market for the Factors of Production
                                DownloadManager downloadManager8;
                                downloadManager8 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri8 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FIntroductory%20Microeconomics%2FNOTES%20-%20The%20Market%20for%20the%20Factors%20of%20Production.pdf?alt=media&token=32828cb8-1c1d-497f-afac-d925e9c3fbe0");
                                DownloadManager.Request request8 = new DownloadManager.Request(uri8);
                                request8.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference8 = downloadManager8.enqueue(request8);
                                break;
                            case 9:                             //GL
                                DownloadManager downloadManager9;
                                downloadManager9 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri9 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FIntroductory%20Microeconomics%2FGL.pdf?alt=media&token=0fd7591a-ed1f-4be7-b99e-113377e779ef");
                                DownloadManager.Request request9 = new DownloadManager.Request(uri9);
                                request9.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference9 = downloadManager9.enqueue(request9);
                                break;
                            case 10:                             //RB
                                DownloadManager downloadManager10;
                                downloadManager10 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri10 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FIntroductory%20Microeconomics%2FRB.pdf?alt=media&token=311a93fd-3b3c-4945-8bea-d522f09292d2");
                                DownloadManager.Request request10= new DownloadManager.Request(uri10);
                                request10.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference10 = downloadManager10.enqueue(request10);
                                break;
                        }
                        break;
                    case 1:                             //Mathematical methods for Economics 1
                        switch (childPosition) {
                            case 0:                             //NOTES - Preliminaries
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FMathematical%20methods%20for%20Economics%201%2FNOTES%20-%20Preliminaries-II.pdf?alt=media&token=2fbb8c6d-3442-40a4-91b3-beb9ee3693b5");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - Functions, Sequence and Series
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FMathematical%20methods%20for%20Economics%201%2FNOTES%20-%20Functions%2C%20Sequence%20and%20Series.pdf?alt=media&token=5e2543a6-91da-4cdc-975d-e1acc6ecf7ad");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - Limit and Continuity
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FMathematical%20methods%20for%20Economics%201%2FNOTES%20-%20Limit%20and%20Continuity.pdf?alt=media&token=d43552ad-7f75-43a4-aebd-2202b2f9a380");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //NOTES - Single Variable Optimization
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FMathematical%20methods%20for%20Economics%201%2FNOTES%20-%20Single%20Variable%20Optimization.pdf?alt=media&token=6e31b3f8-3959-41ce-8fa7-71ea25e5905d");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //NOTES - Integration of Functions
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FMathematical%20methods%20for%20Economics%201%2FNOTES%20-%20Integration%20of%20Functions.pdf?alt=media&token=06e6728f-bbf2-4137-b614-88da94938b90");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //GL
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FMathematical%20methods%20for%20Economics%201%2FGL.pdf?alt=media&token=a3b1f845-45b2-44de-8b35-9cab9db9546a");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                            case 6:                             //RB
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ECO%2FSEM%201%2FMathematical%20methods%20for%20Economics%201%2FRB.pdf?alt=media&token=2d89328e-ad2e-4e5c-a3c7-d6a448f14636");
                                DownloadManager.Request request6 = new DownloadManager.Request(uri6);
                                request6.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference6 = downloadManager6.enqueue(request6);
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
        item1.setName("Introductory Microeconomics");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("Mathematical methods for Economics 1");
        listDataHeader.add(item2);

        //Introductory Microeconomics
        List<String> heading1 = new ArrayList<>();
        heading1.add("NOTES - Introduction to Microeconomics");
        heading1.add("NOTES - Nature and Subject Matter of Economics");
        heading1.add("NOTES - Demand, Supply and Market Equilibrium");
        heading1.add("NOTES - The Concept of Demand, Supply & Elasticity");
        heading1.add("NOTES - The Theory Of Consumer Choice");
        heading1.add("NOTES - Long Run Costs and Output Decisions");
        heading1.add("NOTES - Behavior of Profit Maximizing Firms and The Production Process");
        heading1.add("NOTES - Monopoly and the Antitrust Policies of the Government");
        heading1.add("NOTES - The Market for the Factors of Production");
        heading1.add("Guidelines");
        heading1.add("Recommended Books");

        //Mathematical methods for Economics 1
        List<String> heading2 = new ArrayList<String>();
        heading2.add("NOTES - Preliminaries");
        heading2.add("NOTES - Functions, Sequence and Series");
        heading2.add("NOTES - Limit and Continuity");
        heading2.add("NOTES - Single Variable Optimization");
        heading2.add("NOTES - Integration of Functions");
        heading2.add("Guidelines");
        heading2.add("Recommended Books");


        listDataChild.put(listDataHeader.get(0), heading1);             //Introductory Microeconomics
        listDataChild.put(listDataHeader.get(1), heading2);             //Mathematical methods for Economics 1

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
