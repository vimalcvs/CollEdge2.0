package com.vimalcvs.colledge.vocational.bavmaterialsmanagement.sem1;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;

import com.vimalcvs.colledge.R;
import com.vimalcvs.colledge.helper.ExpandedMenuModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by VimalCVS on 22/08/18.
 */

public class BA_V_Materials_Management_Sem1 extends AppCompatActivity {


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
                    case 0:                         //Materials Management  An Overview
                        switch (childPosition) {
                            case 0:                             //GL
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MM%2FSEM%201%2FMaterials%20Management%20%20%20An%20Overview%2FGL.pdf?alt=media&token=460dbf0a-dfde-4d07-bd74-7d83d93a0e49");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //RB
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MM%2FSEM%201%2FMaterials%20Management%20%20%20An%20Overview%2FRB.pdf?alt=media&token=0981959d-021f-4a44-9d27-f10cae326ac7");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                        }
                        break;
                    case 1:                                 //Principles of Microeconomics
                        switch (childPosition) {
                            case 0:                             //NOTES
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%201%2FPrinciples%20of%20Microeconomics%2FNOTES%20-%20New%20Doc%202018-11-05%2015.08.11.pdf?alt=media&token=35c70b09-54f8-4d49-b6b0-e222adda79b6");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //QP
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%201%2FPrinciples%20of%20Microeconomics%2FQP.pdf?alt=media&token=2dd8ec33-4a84-478a-b805-cbbd9bb98ca8");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //GL
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%201%2FPrinciples%20of%20Microeconomics%2FGL.pdf?alt=media&token=ee662ae6-f4da-4340-b4c7-c3a5f02a26fe");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //RB
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%201%2FPrinciples%20of%20Microeconomics%2FRB.pdf?alt=media&token=e910c945-9446-4da2-9b62-4a007669dd0f");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
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

        //Materials Management  An Overview
        ExpandedMenuModel item1 = new ExpandedMenuModel();
        item1.setName("Materials Management  An Overview");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("Principles of Microeconomics");
        listDataHeader.add(item2);


        //Materials Management  An Overview
        List<String> heading1 = new ArrayList<>();
        heading1.add("Guidelines");
        heading1.add("Recommended Books");

        //Principles of Microeconomics
        List<String> heading2 = new ArrayList<String>();
        heading2.add("Notes");
        heading2.add("Question Paper");
        heading2.add("Guidelines");
        heading2.add("Recommended Books");


        listDataChild.put(listDataHeader.get(0), heading1);             //Materials Management  An Overview
        listDataChild.put(listDataHeader.get(1), heading2);             //Principles of Microeconomics

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
