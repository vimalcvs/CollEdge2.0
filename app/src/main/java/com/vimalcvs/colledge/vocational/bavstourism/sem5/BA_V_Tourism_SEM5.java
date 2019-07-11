package com.vimalcvs.colledge.vocational.bavstourism.sem5;

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
public class BA_V_Tourism_SEM5 extends AppCompatActivity {


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
                    case 0:                             //Tourism Undertaking
                        switch (childPosition) {
                            case 0:                             //GL
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/TOURISM%2FSEM%205%2FTourism%20Undertaking%2FGL.pdf?alt=media&token=e338df1e-3be2-41b4-a911-b17b8d58742e");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //RB
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/TOURISM%2FSEM%205%2FTourism%20Undertaking%2FRB.pdf?alt=media&token=91864ac8-3c7e-49c4-8c20-026dffba2a8c");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                        }
                        break;
                    case 1:                             //Culture In Indian Subcontinent I
                        switch (childPosition) {
                            case 0:                             //GL
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/TOURISM%2FSEM%205%2FCulture%20In%20Indian%20Subcontinent%20I%2FGL.pdf?alt=media&token=c0daa979-cc29-420d-8301-8a0319969f7b");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //RB
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/TOURISM%2FSEM%205%2FCulture%20In%20Indian%20Subcontinent%20I%2FRB.pdf?alt=media&token=92f1fa3c-7826-4735-9068-7b92e4dd3423");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                        }
                        break;
                    case 2:                             //Corporate Laws
                        switch (childPosition) {
                            case 0:                             //NOTES - Corporate Law
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%205%2FCorporate%20Laws%2FNOTES%20-%20Corporate%20Law%20by%20Anu%20Panday.pdf?alt=media&token=c44dbd3d-bbde-40a9-9325-061b9ea94563");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - Emerging issues in Company Law
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%205%2FCorporate%20Laws%2FNOTES%20-%20Emerging%20issues%20in%20Company%20Law.pdf?alt=media&token=01cc7244-38f3-43c0-a22f-f8d712b8b929");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - Formation of a Company and Company Document
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%205%2FCorporate%20Laws%2FNOTES%20-%20Formation%20of%20a%20Company%20and%20Company%20Documents%20by%20Seema%20Shrivastava.pdf?alt=media&token=5e7a3d1a-2d59-4294-a840-ab0990ea1edf");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //NOTES - Investigation and Winding-up
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%205%2FCorporate%20Laws%2FNOTES%20-%20Investigation%20and%20Winding-up%20by%20Anu%20Panday.pdf?alt=media&token=cf0d3555-a3aa-4554-ae1f-12ffd6dfe07a");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //NOTES - Kinds of Companies
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%205%2FCorporate%20Laws%2FNOTES%20-%20Kinds%20of%20Companies%20by%20Anu%20Panday.pdf?alt=media&token=c5c13e00-1b15-49e5-992c-c3e1297841e5");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //NOTES - Management
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%205%2FCorporate%20Laws%2FNOTES%20-%20Management%20by%20Monika%20Gulati%20Anu%20Panday.pdf?alt=media&token=942660ef-2ec0-4932-86e5-05a114f44be7");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                            case 6:                             //NOTES - Meeting
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%205%2FCorporate%20Laws%2FNOTES%20-%20Meeting%20by%20Monika%20Gulati.pdf?alt=media&token=074d8fb4-37dd-4c24-968c-d310924b44f1");
                                DownloadManager.Request request6 = new DownloadManager.Request(uri6);
                                request6.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference6 = downloadManager6.enqueue(request6);
                                break;
                            case 7:                             //NOTES - Members and Shareholders of a Company
                                DownloadManager downloadManager7;
                                downloadManager7 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri7 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%205%2FCorporate%20Laws%2FNOTES%20-%20Members%20and%20Shareholders%20of%20a%20Company%20by%20monika%20gulati.pdf?alt=media&token=e57504f7-8a74-4f9a-92be-9d52ae19faeb");
                                DownloadManager.Request request7 = new DownloadManager.Request(uri7);
                                request7.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference7 = downloadManager7.enqueue(request7);
                                break;
                            case 8:                             //NOTES - Share Capital
                                DownloadManager downloadManager8;
                                downloadManager8 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri8 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%205%2FCorporate%20Laws%2FNOTES%20-%20Share%20Capital.pdf?alt=media&token=6ae280c8-a27c-4400-82e5-b4115c18d83f");
                                DownloadManager.Request request8 = new DownloadManager.Request(uri8);
                                request8.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference8 = downloadManager8.enqueue(request8);
                                break;
                            case 9:                             //GL
                                DownloadManager downloadManager9;
                                downloadManager9 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri9 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%205%2FCorporate%20Laws%2FGL.pdf?alt=media&token=2f2427c3-32fa-4a7f-98ff-247f75cea93d");
                                DownloadManager.Request request9 = new DownloadManager.Request(uri9);
                                request9.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference9 = downloadManager9.enqueue(request9);
                                break;
                            case 10:                             //RB
                                DownloadManager downloadManager10;
                                downloadManager10 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri10 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%205%2FCorporate%20Laws%2FRB.pdf?alt=media&token=17340be9-9312-4d0b-9ad9-b9d12711a321");
                                DownloadManager.Request request10= new DownloadManager.Request(uri10);
                                request10.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference10 = downloadManager10.enqueue(request10);
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
        item1.setName("Tourism Undertaking");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("Culture In Indian Subcontinent I");
        listDataHeader.add(item2);

        ExpandedMenuModel item3 = new ExpandedMenuModel();
        item3.setName("Corporate Laws");
        listDataHeader.add(item3);


        //Tourism Undertaking
        List<String> heading1 = new ArrayList<>();
        heading1.add("Guidelines");
        heading1.add("Recommended Books");

        //Culture In Indian Subcontinent I
        List<String> heading2 = new ArrayList<String>();
        heading2.add("Guidelines");
        heading2.add("Recommended Books");

        //Corporate Laws
        List<String> heading3 = new ArrayList<>();
        heading3.add("NOTES - Corporate Law");
        heading3.add("NOTES - Emerging issues in Company Law");
        heading3.add("NOTES - Formation of a Company and Company Document");
        heading3.add("NOTES - Investigation and Winding-up");
        heading3.add("NOTES - Kinds of Companies");
        heading3.add("NOTES - Management");
        heading3.add("NOTES - Meeting");
        heading3.add("NOTES - Members and Shareholders of a Company");
        heading3.add("NOTES - Share Capital");
        heading3.add("Guidelines");
        heading3.add("Recommended Books");


        listDataChild.put(listDataHeader.get(0), heading1);             //Tourism Undertaking
        listDataChild.put(listDataHeader.get(1), heading2);             //Culture In Indian Subcontinent I
        listDataChild.put(listDataHeader.get(2), heading3);             //Corporate Laws



    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
