package com.vimalcvs.colledge.honours.bahenglish.sem3;

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

public class BAEnglish_Hons_SEM3 extends AppCompatActivity {


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
                    case 0:                             //American Literature
                        switch (childPosition) {
                            case 0:                             //GL
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%203%2FAmerican%20Literature%2FGL.pdf?alt=media&token=1383fd54-989c-4c9e-8608-8c6fdec764c9");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //RB
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%203%2FAmerican%20Literature%2FRB.pdf?alt=media&token=a76144f2-5e8f-49ae-9166-653af27897b5");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                        }
                        break;
                    case 1:                             //British Poetry and Drama 17th and 18th Centuries
                        switch (childPosition) {
                            case 0:                             //NOTES - The Duchess of Malfi: John Webster
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%203%2FBritish%20Poetry%20and%20Drama%2017th%20and%2018th%20Centuries%2FNOTES%20-%20The%20Duchess%20of%20Malfi%20John%20Webster.pdf?alt=media&token=21712b94-e3b1-4578-91c5-a76138fa0b88");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - The Rape of the Lock: Alexander Pope
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%203%2FBritish%20Poetry%20and%20Drama%2017th%20and%2018th%20Centuries%2FNOTES%20-%20The%20Rape%20of%20the%20Lock%20Alexander%20Pope.pdf?alt=media&token=e335eebb-c52c-4c2b-8a63-6d2097a33224");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - The Rover: Aphra Behn
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%203%2FBritish%20Poetry%20and%20Drama%2017th%20and%2018th%20Centuries%2FNOTES%20-%20Aphra%20Behn%20Lesson%20Plan.pdf?alt=media&token=a1c29b2b-0068-47d1-8806-1c95f32fd84a");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //QP
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%203%2FBritish%20Poetry%20and%20Drama%2017th%20and%2018th%20Centuries%2FQP%20-%20B.A%20(HONS.)%20III%20ENGLISH%20BRITISH%20POETRY%20AND%20DRAMA-17TH%20AND%2018TH%20CENTURIES-8215.pdf?alt=media&token=06e88860-a270-421b-adc5-f160f6445736");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //GL
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%203%2FBritish%20Poetry%20and%20Drama%2017th%20and%2018th%20Centuries%2FGL.pdf?alt=media&token=4efe2dd9-73cc-4a0c-8040-9b6eddf2f0ea");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //RB
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%203%2FBritish%20Poetry%20and%20Drama%2017th%20and%2018th%20Centuries%2FRB.pdf?alt=media&token=2012fe30-1f0c-4019-896b-686de3aaf444");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                        }
                        break;
                    case 2:                             //Popular Literature
                        switch (childPosition) {
                            case 0:                             //NOTES - Agatha Christie: The Murder of Roger Ackroyd
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%203%2FPopular%20Literature%2FNOTES%20-%20Agatha%20Christie%20The%20Murder%20of%20Roger%20Ackroyd.pdf?alt=media&token=1e2fc2e6-0fa8-4d57-8795-82948c8fbbf6");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - Funny Boy: Shyam Selvadurai
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%203%2FPopular%20Literature%2FNOTES%20-%20ILLL%20Funny%20Boy%20Draft%20to%20Ravi_2_.pdf?alt=media&token=12f61b6c-ce96-4147-8870-3b80ea816bbf");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - Through The Looking Class: Lewis Carroll
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%203%2FPopular%20Literature%2FNOTES%20-%20ILLL%20Lewis%20Carroll%202nd%20draft_1_updated.pdf?alt=media&token=0f104a54-61b5-48a1-b918-cc0be8c23f4e");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //GL
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%203%2FPopular%20Literature%2FGL.pdf?alt=media&token=73b8f07a-cf15-4544-b214-18a257b7d777");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //RB
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%203%2FPopular%20Literature%2FRB.pdf?alt=media&token=f44d8dc8-30f6-4680-99ff-d48d937b1f29");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
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
        item1.setName("American Literature");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("British Poetry and Drama 17th and 18th Centuries");
        listDataHeader.add(item2);

        ExpandedMenuModel item3 = new ExpandedMenuModel();
        item3.setName("Popular Literature");
        listDataHeader.add(item3);


        //American Literature
        List<String> heading1 = new ArrayList<>();
        heading1.add("Guidelines");
        heading1.add("Recommended Books");

        //British Poetry and Drama 17th and 18th Centuries
        List<String> heading2 = new ArrayList<String>();
        heading2.add("NOTES - The Duchess of Malfi: John Webster");
        heading2.add("NOTES - The Rape of the Lock: Alexander Pope");
        heading2.add("NOTES - The Rover: Aphra Behn");
        heading2.add("Question Paper");
        heading2.add("Guidelines");
        heading2.add("Recommended Books");

        //Popular Literature
        List<String> heading3 = new ArrayList<String>();
        heading3.add("NOTES - Agatha Christie: The Murder of Roger Ackroyd");
        heading3.add("NOTES - Funny Boy: Shyam Selvadurai");
        heading3.add("NOTES - Through The Looking Class: Lewis Carroll");
        heading3.add("Guidelines");
        heading3.add("Recommended Books");


        listDataChild.put(listDataHeader.get(0), heading1);             //American Literature
        listDataChild.put(listDataHeader.get(1), heading2);             //British Poetry and Drama 17th and 18th Centuries
        listDataChild.put(listDataHeader.get(2), heading3);             //Popular Literature

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
