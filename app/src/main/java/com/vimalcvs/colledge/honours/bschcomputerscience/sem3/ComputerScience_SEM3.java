package com.vimalcvs.colledge.honours.bschcomputerscience.sem3;

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

public class ComputerScience_SEM3 extends AppCompatActivity {


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
                    case 0:                             //DATA STRUCTURES
                        switch (childPosition) {
                            case 0:                             //NOTES - Comparing Searching Methods
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FNOTES%20-%20Comparing%20Searching%20Methods.pdf?alt=media&token=5d53bd11-700c-4045-87a8-0788e0fe0eb6");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - Doubly Linked Lists and Advanced Concepts
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FNOTES%20-%20Doubly%20Linked%20Lists%20and%20Advanced%20Concepts.pdf?alt=media&token=2e6be6a7-306a-4090-a42c-90fc220b4dca");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - Hashing and Collision Handling methods
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FNOTES%20-%20Hashing%20and%20Collision%20Handling%20methods.pdf?alt=media&token=5cf34b0b-a399-4aff-8b7b-acd7324f7e12");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //NOTES - Introduction to Linear structures
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FNOTES%20-%20Introduction%20to%20Linear%20structures.pdf?alt=media&token=b966e460-c64f-4e21-9d83-be8765db90c5");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //NOTES - Linked Lists
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FNOTES%20-%20Linked%20Lists.pdf?alt=media&token=317bf49e-0c5d-4595-8c63-1c087bd8a157");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //NOTES - M-Way Trees And B-Trees
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FNOTES%20-%20M-Way%20Trees%20And%20B-Trees.pdf?alt=media&token=5beb78d7-6f57-4232-85ad-88534368edc9");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                            case 6:                             //NOTES - Queues
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FNOTES%20-%20Queues.pdf?alt=media&token=ce1069a2-39da-4c5b-b42c-4b633d6f1c6e");
                                DownloadManager.Request request6 = new DownloadManager.Request(uri6);
                                request6.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference6 = downloadManager6.enqueue(request6);
                                break;
                            case 7:                             //NOTES - Searching Methods
                                DownloadManager downloadManager7;
                                downloadManager7 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri7 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FNOTES%20-%20Searching%20Methods.pdf?alt=media&token=10f95285-2486-4d3b-a1d3-0d0a83ce5427");
                                DownloadManager.Request request7 = new DownloadManager.Request(uri7);
                                request7.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference7 = downloadManager7.enqueue(request7);
                                break;
                            case 8:                             //NOTES - Stacks
                                DownloadManager downloadManager8;
                                downloadManager8 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri8 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FNOTES%20-%20Stacks.pdf?alt=media&token=c6780d7e-f331-4869-9e16-80d86b892b3b");
                                DownloadManager.Request request8 = new DownloadManager.Request(uri8);
                                request8.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference8 = downloadManager8.enqueue(request8);
                                break;
                            case 9:                             //NOTES - Threaded Trees
                                DownloadManager downloadManager9;
                                downloadManager9 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri9 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FNOTES%20-%20Threaded%20Trees.pdf?alt=media&token=ef21338a-7674-4e76-8340-a6da81fcbe3e");
                                DownloadManager.Request request9 = new DownloadManager.Request(uri9);
                                request9.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference9 = downloadManager9.enqueue(request9);
                                break;
                            case 10:                             //QP-1
                                DownloadManager downloadManager10;
                                downloadManager10 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri10 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FQP%20-%20DS.pdf?alt=media&token=6a74d0e3-10a5-40fe-b8b9-491234f54adf");
                                DownloadManager.Request request10= new DownloadManager.Request(uri10);
                                request10.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference10 = downloadManager10.enqueue(request10);
                                break;
                            case 11:                             //QP-2
                                DownloadManager downloadManager11;
                                downloadManager11 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri11 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FQP%20-%20DS1.pdf?alt=media&token=dca15e06-fd59-47e4-8503-d1186ca6723f");
                                DownloadManager.Request request11 = new DownloadManager.Request(uri11);
                                request11.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference11 = downloadManager11.enqueue(request11);
                                break;
                            case 12:                             //QP-3
                                DownloadManager downloadManager12;
                                downloadManager12 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri12 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FQP%20-%20DS2.pdf?alt=media&token=37432f62-0c34-458b-84d4-2d5d8a0e27ec");
                                DownloadManager.Request request12 = new DownloadManager.Request(uri12);
                                request12.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference12 = downloadManager12.enqueue(request12);
                                break;
                            case 13:                             //QP-4
                                DownloadManager downloadManager13;
                                downloadManager13 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri13 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FQP%20-%20DS3.pdf?alt=media&token=2b3f6735-1f29-4dc3-950b-b82b556af5c2");
                                DownloadManager.Request request13 = new DownloadManager.Request(uri13);
                                request13.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference13 = downloadManager13.enqueue(request13);
                                break;
                            case 14:                             //QP-5
                                DownloadManager downloadManager14;
                                downloadManager14 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri14 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FQP%20-%20DS4.pdf?alt=media&token=2ab6ca61-e5ec-424d-af89-00e8c9d01767");
                                DownloadManager.Request request14 = new DownloadManager.Request(uri14);
                                request14.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference14 = downloadManager14.enqueue(request14);
                                break;
                            case 15:                             //GL
                                DownloadManager downloadManager15;
                                downloadManager15 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri15 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FGL.pdf?alt=media&token=e49314d0-5575-45c7-a245-bffc7a9c4585");
                                DownloadManager.Request request15 = new DownloadManager.Request(uri15);
                                request15.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference15 = downloadManager15.enqueue(request15);
                                break;
                            case 16:                             //RB
                                DownloadManager downloadManager16;
                                downloadManager16 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri16 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FData%20Structures%2FRB.pdf?alt=media&token=36686d35-1fd4-467d-8a92-84494ac19ce6");
                                DownloadManager.Request request16 = new DownloadManager.Request(uri16);
                                request16.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference16 = downloadManager16.enqueue(request16);
                                break;
                        }
                        break;
                    case 1:                             //COMPUTER NETWORKS
                        switch (childPosition) {
                            case 0:                             //notes
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FComputer%20Networks%2FNOTES.pdf?alt=media&token=bce2a975-1363-491f-a274-340f44188c36");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //QP-1
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FComputer%20Networks%2FQP%20-%20computer%20networks%20(csht-409)%20sem%20iv%20852.pdf?alt=media&token=44290b27-83c6-43b0-9bae-14ca6255095f");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //QP-2
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FComputer%20Networks%2FQP%20-%20COMPUTER%20NETWORKS(CSHT-409)%20SEM%20IV.pdf?alt=media&token=aa4d2787-1f0a-488d-a78c-887fbb2f2969");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //QP-3
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FComputer%20Networks%2FQP%20-%20COMPUTER%20NETWORKS-2048.pdf?alt=media&token=5b648a13-ee69-4ddf-baea-9e8b7399cb5d");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //QP-4
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FComputer%20Networks%2FQP%20-%20networking.pdf?alt=media&token=4b6c81bd-6339-4171-9b35-e738edf25cea");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //GL
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FComputer%20Networks%2FGL.pdf?alt=media&token=baf51263-8f05-47cc-8b0d-cabe3d650b34");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                            case 6:                             //RB
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FComputer%20Networks%2FRB.pdf?alt=media&token=fe482c67-faa9-4802-b933-ee0644975206");
                                DownloadManager.Request request6 = new DownloadManager.Request(uri6);
                                request6.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference6 = downloadManager6.enqueue(request6);
                                break;
                        }
                        break;
                    case 2:                             //OPERATING SYSTEMS
                        switch (childPosition) {
                            case 0:                             //notes
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FOperating%20Systems%2FNOTES%20-%20operating%20system%20notes%20(DS)-ilovepdf-compressed.pdf?alt=media&token=f5f0a8ae-0310-4873-82e9-f150ec5f1e5e");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //QP-1
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FOperating%20Systems%2FQP%20-%20operating%20%20systems%20(cs-ht%20408)%20sem%20iv%20851.pdf?alt=media&token=21dab24f-e73f-40ca-9f3c-348d07779d3d");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //QP-2
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FOperating%20Systems%2FQP%20-%20OPERATING%20SYSTEMS-2047.pdf?alt=media&token=573184bc-32d0-4202-971b-ae91088a2c0a");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //QP-3
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FOperating%20Systems%2FQP%20-%20OPERATING%20SYSTEMS.pdf?alt=media&token=1e8ebb4a-1dee-4dba-a379-4c16d9bec355");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //QP-4
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FOperating%20Systems%2FQP%20-%20os.pdf?alt=media&token=29018b76-a9cd-4a69-b943-ad55b7198419");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //GL
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FOperating%20Systems%2FGL.pdf?alt=media&token=579d9d15-8c14-482a-b0f1-7ab333d4ff18");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                            case 6:                             //RB
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/CS%2FSEM%203%2FOperating%20Systems%2FRB.pdf?alt=media&token=342d628a-a41a-4a2a-a5da-50bd68a4640c");
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
        item1.setName("Data Structures");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("Computer Networks");
        listDataHeader.add(item2);

        ExpandedMenuModel item3 = new ExpandedMenuModel();
        item3.setName("Operating Systems");
        listDataHeader.add(item3);

        //for DS
        List<String> heading1 = new ArrayList<>();
        heading1.add("NOTES - Comparing Searching Methods");
        heading1.add("NOTES - Doubly Linked Lists and Advanced Concepts");
        heading1.add("NOTES - Hashing and Collision Handling methods");
        heading1.add("NOTES - Introduction to Linear Structures");
        heading1.add("NOTES - Linked Lists");
        heading1.add("NOTES - M-Way Trees and B-Trees");
        heading1.add("NOTES - Queues");
        heading1.add("NOTES - Searching Methods");
        heading1.add("NOTES - Stacks");
        heading1.add("NOTES - Threaded Trees");
        heading1.add("Question Paper - 1");
        heading1.add("Question Paper - 2");
        heading1.add("Question Paper - 3");
        heading1.add("Question Paper - 4");
        heading1.add("Question Paper - 5");
        heading1.add("Guidelines");
        heading1.add("Recommended Books");


        //for CN
        List<String> heading2 = new ArrayList<>();
        heading2.add("Notes");
        heading2.add("Question Paper - 1");
        heading2.add("Question Paper - 2");
        heading2.add("Question Paper - 3");
        heading2.add("Question Paper - 4");
        heading2.add("Guidelines");
        heading2.add("Recommended Books");

        //for OS
        List<String> heading3 = new ArrayList<String>();
        heading3.add("Notes");
        heading3.add("Question Paper - 1");
        heading3.add("Question Paper - 2");
        heading3.add("Question Paper - 3");
        heading3.add("Question Paper - 4");
        heading3.add("Guidelines");
        heading3.add("Recommended Books");



        listDataChild.put(listDataHeader.get(0), heading1);     //DS
        listDataChild.put(listDataHeader.get(1), heading2);     //CN
        listDataChild.put(listDataHeader.get(2), heading3);     //OS



    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
