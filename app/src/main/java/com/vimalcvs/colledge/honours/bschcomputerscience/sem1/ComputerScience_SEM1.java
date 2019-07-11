package com.vimalcvs.colledge.honours.bschcomputerscience.sem1;

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

public class ComputerScience_SEM1 extends AppCompatActivity {


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
                    case 0:                             //CSA
                        switch (childPosition) {
                            case 0:                             //notes
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FCSA%2FNOTES%20-%20CSA%5B8285%5D.pdf?alt=media&token=419abd1f-772c-442c-ad66-877753067949");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //question papers
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FCSA%2FQP.pdf?alt=media&token=6a22a40e-7e3f-4351-b9b0-4b79ea45e492");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //guidelines
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FCSA%2FGL.pdf?alt=media&token=209ea9d9-50d9-4467-a041-2c1cf1a80eef");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //recommended books
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FCSA%2FRB.pdf?alt=media&token=9f114288-061a-4b0d-a088-98d2a963a661");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                        }
                        break;
                    case 1:                             //C++
                        switch (childPosition) {
                            case 0:                             //NOTES - An Introduction to Programming
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FNOTES%20-%20An%20Introduction%20to%20Programming.pdf?alt=media&token=026bcfe2-3f0e-44d5-bc01-400e8e7b15bd");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - Arithmetic and Relational Expressions and Data Types
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FNOTES%20-%20Arithmetic%20and%20Relational%20Expressions%20and%20Data%20Types.pdf?alt=media&token=a6126424-2e75-41d0-84c8-dd14e314c9a9");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - Arrays
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FNOTES%20-%20Arrays.pdf?alt=media&token=dc8ace02-d449-4414-9110-6f90767d56bf");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //NOTES - Exception Handling.
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FNOTES%20-%20Exception%20Handling..pdf?alt=media&token=2fa11cb7-beca-43c6-8a3e-903bba36bd41");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //NOTES - File
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FNOTES%20-%20File.pdf?alt=media&token=35fbeb06-199d-412b-a894-a804134fda2c");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //NOTES - Functions
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FNOTES%20-%20Functions.pdf?alt=media&token=a812555b-eec1-4282-822a-c6802c06740a");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                            case 6:                             //NOTES - Inheritance and virtual Functions
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FNOTES%20-%20Inheritance%20and%20virtual%20Functions.pdf?alt=media&token=d145c763-e2d9-4934-846f-85b15c9b1972");
                                DownloadManager.Request request6 = new DownloadManager.Request(uri6);
                                request6.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference6 = downloadManager6.enqueue(request6);
                                break;
                            case 7:                             //NOTES - Object Oriented Programming Features
                                DownloadManager downloadManager7;
                                downloadManager7 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri7 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FNOTES%20-%20Object%20Oriented%20Programming%20Features.pdf?alt=media&token=a2b5f52c-7ed9-4bb6-9220-aebadf19a0d4");
                                DownloadManager.Request request7 = new DownloadManager.Request(uri7);
                                request7.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference7 = downloadManager7.enqueue(request7);
                                break;
                            case 8:                             //NOTES - Overloading
                                DownloadManager downloadManager8;
                                downloadManager8 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri8 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FNOTES%20-%20Overloading..pdf?alt=media&token=53f77b08-53b9-4ba8-ae6f-a9ae045dd00c");
                                DownloadManager.Request request8 = new DownloadManager.Request(uri8);
                                request8.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference8 = downloadManager8.enqueue(request8);
                                break;
                            case 9:                             //NOTES - Pointer
                                DownloadManager downloadManager9;
                                downloadManager9 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri9 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FNOTES%20-%20Pointer.pdf?alt=media&token=0620a674-3fec-4eec-92cf-0a29ac5d0944");
                                DownloadManager.Request request9 = new DownloadManager.Request(uri9);
                                request9.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference9 = downloadManager9.enqueue(request9);
                                break;
                            case 10:                             //NOTES - Problem Solving Approaches
                                DownloadManager downloadManager10;
                                downloadManager10 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri10 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FNOTES%20-%20Problem%20Solving%20Approaches.pdf?alt=media&token=fd6ab69d-9ee4-44ad-b8c4-64e393becc00");
                                DownloadManager.Request request10= new DownloadManager.Request(uri10);
                                request10.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference10 = downloadManager10.enqueue(request10);
                                break;
                            case 11:                             //NOTES - Repetition Structures
                                DownloadManager downloadManager11;
                                downloadManager11 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri11 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FNOTES%20-%20Repetition%20Structures.pdf?alt=media&token=fba0eec3-fca9-4b25-bfd7-ba48da59f277");
                                DownloadManager.Request request11 = new DownloadManager.Request(uri11);
                                request11.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference11 = downloadManager11.enqueue(request11);
                                break;
                            case 12:                             //NOTES - Selection Structures
                                DownloadManager downloadManager12;
                                downloadManager12 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri12 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FNOTES%20-%20Selection%20Structures.pdf?alt=media&token=409e9228-804d-4d1e-bddc-0487b758b575");
                                DownloadManager.Request request12 = new DownloadManager.Request(uri12);
                                request12.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference12 = downloadManager12.enqueue(request12);
                                break;
                            case 13:                             //NOTES - String Handling
                                DownloadManager downloadManager13;
                                downloadManager13 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri13 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FNOTES%20-%20String%20Handling.pdf?alt=media&token=98f4b0d2-b037-4dc3-8a88-ec1d2796a616");
                                DownloadManager.Request request13 = new DownloadManager.Request(uri13);
                                request13.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference13 = downloadManager13.enqueue(request13);
                                break;
                            case 14:                             //NOTES - User defined data types-I,II,III
                                DownloadManager downloadManager14;
                                downloadManager14 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri14 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FNOTES%20-%20User%20defined%20data%20types-I%2CII%2CIII.pdf?alt=media&token=6622280e-ce15-4850-8721-cdb423301f16");
                                DownloadManager.Request request14 = new DownloadManager.Request(uri14);
                                request14.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference14 = downloadManager14.enqueue(request14);
                                break;
                            case 15:                             //question papers
                                DownloadManager downloadManager15;
                                downloadManager15 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri15 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FQP.pdf?alt=media&token=28cfb55b-ca0b-4fcc-8ff9-f1bd36630088");
                                DownloadManager.Request request15 = new DownloadManager.Request(uri15);
                                request15.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference15 = downloadManager15.enqueue(request15);
                                break;
                            case 16:                             //guidelines
                                DownloadManager downloadManager16;
                                downloadManager16 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri16 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FGL.pdf?alt=media&token=d403f471-4319-4bd0-9978-2231f0b9883e");
                                DownloadManager.Request request16 = new DownloadManager.Request(uri16);
                                request16.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference16 = downloadManager16.enqueue(request16);
                                break;
                            case 17:                             //recommended books
                                DownloadManager downloadManager17;
                                downloadManager17 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri17 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%201%2FC%2B%2B%2FRB.pdf?alt=media&token=597c844d-bc4c-4dde-af8b-1569d84ba871");
                                DownloadManager.Request request17 = new DownloadManager.Request(uri17);
                                request17.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference17 = downloadManager17.enqueue(request17);
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
        item1.setName("Computer System Architecture");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("Programming Fundamentals Using C++");
        listDataHeader.add(item2);


        //for csa
        List<String> heading1 = new ArrayList<>();
        heading1.add("Notes");
        heading1.add("Question Paper - 2017");
        heading1.add("Guidelines");
        heading1.add("Recommended Books");

        //for c++
        List<String> heading2 = new ArrayList<>();
        heading2.add("NOTES - An Introduction to Programming");
        heading2.add("NOTES - Arithmetic and Relational Expressions and Data Types");
        heading2.add("NOTES - Arrays");
        heading2.add("NOTES - Exception Handling");
        heading2.add("NOTES - File");
        heading2.add("NOTES - Functions");
        heading2.add("NOTES - Inheritance and Virtual Functions");
        heading2.add("NOTES - Object Oriented Programming Features");
        heading2.add("NOTES - Overloading");
        heading2.add("NOTES - Pointers");
        heading2.add("NOTES - Problem Solving Approaches");
        heading2.add("NOTES - Repetition Structures");
        heading2.add("NOTES - Selection Structures");
        heading2.add("NOTES - String Handling");
        heading2.add("NOTES - User defined data types-I,II,III");
        heading2.add("Question Paper - 2017");
        heading2.add("Guidelines");
        heading2.add("Recommended Books");


        listDataChild.put(listDataHeader.get(0), heading1);         //csa
        listDataChild.put(listDataHeader.get(1), heading2);         //c++


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
