package com.vimalcvs.colledge.vocational.bavshumanresoursmanegment.sem3;

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
public class BA_V_Human_Resours_Management_SEM3 extends AppCompatActivity {


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
                    case 0:             //Indian Economy- Sectoral Issues
                        switch (childPosition) {
                            case 0:                             //NOTES
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%203%2FIndian%20Economy-%20Sectoral%20Issues%2FNOTES%20-%203%20sem%20indian%20economy-sectoral%20issue.pdf?alt=media&token=0a255ada-46e2-4b43-bade-61ccf5e3cb64");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //QP
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%203%2FIndian%20Economy-%20Sectoral%20Issues%2FQP.pdf?alt=media&token=55ea5a17-7813-4e71-85a7-6fe0c6ed3f6b");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //GL
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%203%2FIndian%20Economy-%20Sectoral%20Issues%2FGL.pdf?alt=media&token=003de9e9-4b3e-4747-99ee-43d28bf1a23f");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //RB
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%203%2FIndian%20Economy-%20Sectoral%20Issues%2FRB.pdf?alt=media&token=195a8920-28c5-4983-8c27-6ef6cbcfef68");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                        }
                        break;
                    case 1:                 //Organizational Behaviour-I
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
                            case 15:                             //NOTES - ADDITIONAL
                                DownloadManager downloadManager15;
                                downloadManager15 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri15 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%203%2FOrganizational%20Behaviour-I%2FNOTES%20-%20ADDITIONAL.pdf?alt=media&token=b1f7ed90-98d6-476d-9eb5-890f6e8d5054");
                                DownloadManager.Request request15 = new DownloadManager.Request(uri15);
                                request15.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference15 = downloadManager15.enqueue(request15);
                                break;
                            case 16:                             //QP
                                DownloadManager downloadManager16;
                                downloadManager16 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri16 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%203%2FOrganizational%20Behaviour-I%2FQP.pdf?alt=media&token=091010ac-8e37-44c6-8014-432f97cac3db");
                                DownloadManager.Request request16 = new DownloadManager.Request(uri16);
                                request16.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference16 = downloadManager16.enqueue(request16);
                                break;
                            case 17:                             //GL
                                DownloadManager downloadManager17;
                                downloadManager17 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri17 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%203%2FOrganizational%20Behaviour-I%2FGL.pdf?alt=media&token=924b8e6c-82f7-45e7-8754-477b8d50de66");
                                DownloadManager.Request request17 = new DownloadManager.Request(uri17);
                                request17.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference17 = downloadManager17.enqueue(request17);
                                break;
                            case 18:                            //RB
                                DownloadManager downloadManager18;
                                downloadManager18 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri18 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%203%2FOrganizational%20Behaviour-I%2FRB.pdf?alt=media&token=ef31b873-7fe3-45e9-a293-08868c8a8d26");
                                DownloadManager.Request request18 = new DownloadManager.Request(uri18);
                                request18.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference18 = downloadManager18.enqueue(request18);
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
        item1.setName("Indian Economy- Sectoral Issues");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("Organizational Behaviour-I");
        listDataHeader.add(item2);


        //Indian Economy- Sectoral Issues
        List<String> heading1 = new ArrayList<>();
        heading1.add("Notes");
        heading1.add("Question Paper");
        heading1.add("Guidelines");
        heading1.add("Recommended Books");

        //for Organization Behavior
        List<String> heading2 = new ArrayList<>();
        heading2.add("NOTES - Personality");
        heading2.add("NOTES - Perception and Attribution Process");
        heading2.add("NOTES - Learning");
        heading2.add("NOTES - Shaping Behaviour- OB Modification");
        heading2.add("NOTES - Traditional Theories of Motivation");
        heading2.add("NOTES - Motivation");
        heading2.add("NOTES - Role of Empowerment and Incentives in Organizations");
        heading2.add("NOTES - Work Stress");
        heading2.add("NOTES - Emotional Intelligence");
        heading2.add("NOTES - Leadership");
        heading2.add("NOTES - Managing Group Dynamics");
        heading2.add("NOTES - Power and Politics in Organizations");
        heading2.add("NOTES - Managing Conflict");
        heading2.add("NOTES - Organisational Culture and Climate");
        heading2.add("NOTES - Organizational Change");
        heading2.add("NOTES - ADDITIONAL");
        heading2.add("Question Paper");
        heading2.add("Guidelines");
        heading2.add("Recommended Books");


        listDataChild.put(listDataHeader.get(0), heading1);             //Indian Economy- Sectoral Issues
        listDataChild.put(listDataHeader.get(1), heading2);             //Organizational Behaviour-I

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
