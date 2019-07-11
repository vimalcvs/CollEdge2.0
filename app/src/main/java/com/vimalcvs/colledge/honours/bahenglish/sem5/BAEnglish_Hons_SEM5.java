package com.vimalcvs.colledge.honours.bahenglish.sem5;

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
public class BAEnglish_Hons_SEM5 extends AppCompatActivity {


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
                    case 0:                             //British Literature The Early 20th Century
                        switch (childPosition) {
                            case 0:                             //NOTES - D.H. Lawrence: Sons and Lovers
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%205%2FBritish%20Literature%20The%20Early%2020th%20Century%2FNOTES%20-%20D.H.%20Lawrence%20Sons%20and%20Lovers.pdf?alt=media&token=7414fa8c-51b3-4c83-b8dc-77b0927d7a6a");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - Joseph Conrad: Heart of Darkness
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%205%2FBritish%20Literature%20The%20Early%2020th%20Century%2FNOTES%20-%20Joseph%20Conrad%20Heart%20of%20Darkness.pdf?alt=media&token=8271d6ec-92be-49d4-9e48-07e2b5c00621");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - Virginia Woolf: Mrs Dalloway
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%205%2FBritish%20Literature%20The%20Early%2020th%20Century%2FNOTES%20-%20Virginia%20Woolf%20Mrs%20Dalloway.pdf?alt=media&token=caa11d85-27e6-47b1-9424-6a9d791e3fc6");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //GL
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%205%2FBritish%20Literature%20The%20Early%2020th%20Century%2FGL.pdf?alt=media&token=facd5aed-41cb-4afe-9854-d4930c53983f");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //RB
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%205%2FBritish%20Literature%20The%20Early%2020th%20Century%2FRB.pdf?alt=media&token=b5707c19-962a-4f09-91c6-23db489b2b76");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                        }
                        break;
                    case 1:                             //Women's Writing
                        switch (childPosition) {
                            case 0:                             //NOTES
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%205%2FWomen's%20Writing%2FNOTES%20-%2098050778.pdf?alt=media&token=5fb26344-0fca-4e2e-848f-0518eed7d4e8");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //QP1
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%205%2FWomen's%20Writing%2FQP%20-%20B.A%20(HONS.)%20ENGLISH%20WOMEN'S%20WRITING%20OF%20THE%2019th%20and%2020th%20CENTURY-%20I%20SEM.%20V%201173.pdf?alt=media&token=f510db63-54c8-4775-9273-c28d87c9c8b0");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //QP2
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%205%2FWomen's%20Writing%2FQP%20-%20B.A.%20(HONS.)%20V%20ENGLISH%20WOMEN'S%20WRITING%20IN%20THE%2019TH%20AND%2020TH%20CENTURIES%20(i)-%205963.pdf?alt=media&token=f9db2af6-84e1-4146-bc3b-135b0abe89a4");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //GL
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%205%2FWomen's%20Writing%2FGL.pdf?alt=media&token=36ec9300-61b0-4aea-bbe9-2919ddbc6a35");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //RB
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/ENG%2FSEM%205%2FWomen's%20Writing%2FRB.pdf?alt=media&token=af9b1408-82b7-48b8-bf88-63df4628b4dd");
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

        //British Literature The Early 20th Century
        ExpandedMenuModel item1 = new ExpandedMenuModel();
        item1.setName("British Literature The Early 20th Century");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("Women's Writing");
        listDataHeader.add(item2);


        //British Literature The Early 20th Century
        List<String> heading1 = new ArrayList<>();
        heading1.add("NOTES - D.H. Lawrence: Sons and Lovers");
        heading1.add("NOTES - Joseph Conrad: Heart of Darkness");
        heading1.add("NOTES - Virginia Woolf: Mrs Dalloway");
        heading1.add("Guidelines");
        heading1.add("Recommended Books");


        //Women's Writing
        List<String> heading2 = new ArrayList<String>();
        heading2.add("Notes");
        heading2.add("Question Paper - 1");
        heading2.add("Question Paper - 2");
        heading2.add("Guidelines");
        heading2.add("Recommended Books");


        listDataChild.put(listDataHeader.get(0), heading1);             //British Literature The Early 20th Century
        listDataChild.put(listDataHeader.get(1), heading2);             //Women's Writing


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
