package com.vimalcvs.colledge.honours.bahbusneisseconomic.sem5;

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

public class BAbusneisseConomic_Hons_SEM5 extends AppCompatActivity {


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
                    case 0:                             //Organization Behavior
                        switch (childPosition) {
                            case 0:                             //NOTES - Personality
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FNOTES%20-%20Personality.pdf?alt=media&token=58dbd375-2b39-4094-a6b4-10675b008930");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - Perception and Attribution Process
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FNOTES%20-%20Perception%20and%20Attribution%20Process.pdf?alt=media&token=67a9a4df-647b-47a2-a2c5-5f39289f48ef");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - Learning
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FNOTES%20-%20Learning.pdf?alt=media&token=ef3eda8d-6398-4631-bb92-4452e383cdc3");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //NOTES - Shaping Behaviour- OB Modification
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FNOTES%20-%20Shaping%20Behaviour-%20OB%20Modification.pdf?alt=media&token=5fd1b91d-c566-4a4a-b9f9-35ff84a6570a");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //NOTES - Traditional theories of Motivation
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FNOTES%20-%20Traditional%20theories%20of%20Motivation.pdf?alt=media&token=7fb69caa-a743-4f4f-a48a-12e5acd7c4a0");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //NOTES - Motivation
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FNOTES%20-%20Motivation.pdf?alt=media&token=36d54be9-6cf9-44c9-8bc9-47b9699a74ff");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                            case 6:                             //NOTES - Role of Empowerment and Incentives in Organizations
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FNOTES%20-%20Role%20of%20Empowerment%20and%20Incentives%20in%20Organizations.pdf?alt=media&token=c983a34b-9090-4564-ae06-9ca349fd2625");
                                DownloadManager.Request request6 = new DownloadManager.Request(uri6);
                                request6.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference6 = downloadManager6.enqueue(request6);
                                break;
                            case 7:                             //NOTES - Work Stress
                                DownloadManager downloadManager7;
                                downloadManager7 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri7 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FNOTES%20-%20Work%20Stress.pdf?alt=media&token=e6224d05-a7fd-42df-808a-b22515713cce");
                                DownloadManager.Request request7 = new DownloadManager.Request(uri7);
                                request7.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference7 = downloadManager7.enqueue(request7);
                                break;
                            case 8:                             //NOTES - Emotional Intelligence
                                DownloadManager downloadManager8;
                                downloadManager8 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri8 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FNOTES%20-%20Eotional%20Intelligence.pdf?alt=media&token=034ff28c-bf49-4d2c-9073-73cd8e43f235");
                                DownloadManager.Request request8 = new DownloadManager.Request(uri8);
                                request8.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference8 = downloadManager8.enqueue(request8);
                                break;
                            case 9:                             //NOTES - Leadership
                                DownloadManager downloadManager9;
                                downloadManager9 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri9 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FNOTES%20-%20Leadership_Sonu-%2018-10-13.pdf?alt=media&token=f02ea683-3add-4e53-a45b-90f74d566609");
                                DownloadManager.Request request9 = new DownloadManager.Request(uri9);
                                request9.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference9 = downloadManager9.enqueue(request9);
                                break;
                            case 10:                             //NOTES - Managing Group Dynamics
                                DownloadManager downloadManager10;
                                downloadManager10 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri10 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FNOTES%20-%20Managing%20Group%20Dynamics.pdf?alt=media&token=7cbbf8a0-51c5-4c63-bf17-dc0b33469779");
                                DownloadManager.Request request10= new DownloadManager.Request(uri10);
                                request10.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference10 = downloadManager10.enqueue(request10);
                                break;
                            case 11:                             //NOTES - Power and Politics in Organizations
                                DownloadManager downloadManager11;
                                downloadManager11 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri11 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FNOTES%20-%20Power%20and%20Politics%20in%20Organizations.pdf?alt=media&token=50c4736c-774c-4fe8-98ba-efc583bb15c2");
                                DownloadManager.Request request11 = new DownloadManager.Request(uri11);
                                request11.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference11 = downloadManager11.enqueue(request11);
                                break;
                            case 12:                             //NOTES - Managing Conflict
                                DownloadManager downloadManager12;
                                downloadManager12 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri12 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FNOTES%20-%20Managing%20Conflict.pdf?alt=media&token=64cc1c80-10f7-4c8b-b2d5-cbe1b89dbfc6");
                                DownloadManager.Request request12 = new DownloadManager.Request(uri12);
                                request12.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference12 = downloadManager12.enqueue(request12);
                                break;
                            case 13:                             //NOTES - Organisational Culture and Climate
                                DownloadManager downloadManager13;
                                downloadManager13 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri13 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FNOTES%20-%20Discipline%20Courses-17-12-2013.pdf?alt=media&token=71b98090-ed85-4996-8705-317bff073769");
                                DownloadManager.Request request13 = new DownloadManager.Request(uri13);
                                request13.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference13 = downloadManager13.enqueue(request13);
                                break;
                            case 14:                             //NOTES - Organizational Change
                                DownloadManager downloadManager14;
                                downloadManager14 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri14 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FNOTES%20-%20Organizational%20Change_30-9-13.pdf?alt=media&token=940ba853-218a-4328-8e7e-31468d790904");
                                DownloadManager.Request request14 = new DownloadManager.Request(uri14);
                                request14.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference14 = downloadManager14.enqueue(request14);
                                break;
                            case 15:                             //QP IMP
                                DownloadManager downloadManager15;
                                downloadManager15 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri15 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FQP%20IMP.pdf?alt=media&token=f0c0cfa7-36c0-4fdc-80c9-81cdc7a7123c");
                                DownloadManager.Request request15 = new DownloadManager.Request(uri15);
                                request15.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference15 = downloadManager15.enqueue(request15);
                                break;
                            case 16:                             //GL
                                DownloadManager downloadManager16;
                                downloadManager16 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri16 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FGL.pdf?alt=media&token=cfa4c141-6078-4bc5-8a57-e0f68819eb36");
                                DownloadManager.Request request16 = new DownloadManager.Request(uri16);
                                request16.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference16 = downloadManager16.enqueue(request16);
                                break;
                            case 17:                             //RB
                                DownloadManager downloadManager17;
                                downloadManager17 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri17 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FOrganization%20Behavior%2FRB.pdf?alt=media&token=9cb55c43-3438-4cbc-bafa-4176c37fdea5");
                                DownloadManager.Request request17 = new DownloadManager.Request(uri17);
                                request17.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference17 = downloadManager17.enqueue(request17);
                                break;
                        }
                        break;
                    case 1:                             //Quantitative Techniques for Management
                        switch (childPosition) {
                            case 0:                             //GL
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FQuantitative%20Techniques%20for%20Management%2FGL.pdf?alt=media&token=b3f1577b-0127-427f-8523-d4b7586a2e6f");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //RB
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%205%2FQuantitative%20Techniques%20for%20Management%2FRB.pdf?alt=media&token=bd8c01bc-5c1e-4371-8808-1546692de268");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
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
        item1.setName("Organization Behavior");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("Quantitative Techniques for Management");
        listDataHeader.add(item2);


        //for Organization Behavior
        List<String> heading1 = new ArrayList<>();
        heading1.add("NOTES - Personality");
        heading1.add("NOTES - Perception and Attribution Process");
        heading1.add("NOTES - Learning");
        heading1.add("NOTES - Shaping Behaviour- OB Modification");
        heading1.add("NOTES - Traditional Theories of Motivation");
        heading1.add("NOTES - Motivation");
        heading1.add("NOTES - Role of Empowerment and Incentives in Organizations");
        heading1.add("NOTES - Work Stress");
        heading1.add("NOTES - Emotional Intelligence");
        heading1.add("NOTES - Leadership");
        heading1.add("NOTES - Managing Group Dynamics");
        heading1.add("NOTES - Power and Politics in Organizations");
        heading1.add("NOTES - Managing Conflict");
        heading1.add("NOTES - Organisational Culture and Climate");
        heading1.add("NOTES - Organizational Change");
        heading1.add("Important Questions");
        heading1.add("Guidelines");
        heading1.add("Recommended Books");

        //for Quantitative Techniques for Management
        List<String> heading2 = new ArrayList<String>();
        heading2.add("Guidelines");
        heading2.add("Recommended Books");


        listDataChild.put(listDataHeader.get(0), heading1);             //Organization Behavior
        listDataChild.put(listDataHeader.get(1), heading2);             //Quantitative Techniques for Management



    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
