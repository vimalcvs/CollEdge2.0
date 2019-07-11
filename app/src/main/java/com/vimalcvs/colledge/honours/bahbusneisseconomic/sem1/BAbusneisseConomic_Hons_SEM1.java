package com.vimalcvs.colledge.honours.bahbusneisseconomic.sem1;

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

public class BAbusneisseConomic_Hons_SEM1 extends AppCompatActivity {


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
                    case 0:                             //Accounting for managers
                        switch (childPosition) {
                            case 0:                             //NOTES - Analysis of Variance
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%201%2FAccounting%20for%20Managers%2FNOTES%20-%20Analysis%20of%20Variance.pdf?alt=media&token=d1650d51-6397-4434-85d7-f706ea15622c");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - CVP Analysis
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%201%2FAccounting%20for%20Managers%2FNOTES%20-%20cvp%20analysis.pdf?alt=media&token=d0ea425a-519e-418f-84ee-0e399e3a6266");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - Decision Making
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%201%2FAccounting%20for%20Managers%2FNOTES%20-%20decision%20making.pdf?alt=media&token=df23f246-536e-41c8-8ba1-c625d87a9fbe");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //NOTES - Introduction to Cost Accounting and Cost Concepts
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%201%2FAccounting%20for%20Managers%2FNOTES%20-%20Intoduction%20to%20Cost%20accounting%20and%20Cost%20Concepts.pdf?alt=media&token=936bd1d2-bfa8-4f67-9fec-1efddc531511");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //NOTES - Handwritten
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%201%2FAccounting%20for%20Managers%2FNOTES%20-%20Handwritten.pdf?alt=media&token=528ff932-dd8c-43ac-9a72-878203687f00");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //GL
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%201%2FAccounting%20for%20Managers%2FGL.pdf?alt=media&token=42a933bf-b622-43e5-80c0-53180a10fd1b");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                            case 6:                             //RB
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%201%2FAccounting%20for%20Managers%2FRB.pdf?alt=media&token=a142c170-e791-4b69-8d0d-ca5afe907304");
                                DownloadManager.Request request6 = new DownloadManager.Request(uri6);
                                request6.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference6 = downloadManager6.enqueue(request6);
                                break;
                        }
                        break;
                    case 1:                             //Microeconomics and Applications - 1
                        switch (childPosition) {
                            case 0:                             //READINGS -  Robert Pindyck, Daniel Rubinfeld
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%201%2FMicroeconomics%20and%20Applications%20-%201%2FNOTES%20-%20%20Robert%20Pindyck%2C%20Daniel%20Rubinfeld-Microeconomics-Prentice%20Hall%20(2012)-ilovepdf-compressed.pdf?alt=media&token=f61f2c7d-cf89-458c-9365-c8bebc756b08");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //READINGS - Hal R. Varian
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%201%2FMicroeconomics%20and%20Applications%20-%201%2FNOTES%20-%20microeco-_varian_0.pdf?alt=media&token=2b1af2c8-006a-4b48-8226-3d3be8971803");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //QP-1
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%201%2FMicroeconomics%20and%20Applications%20-%201%2FQP%20-%20New%20Doc%202018-11-06%2021.24.06.pdf?alt=media&token=5af7c895-2f4e-4d86-9724-13aa6ec8fe8d");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //QP-2
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%201%2FMicroeconomics%20and%20Applications%20-%201%2FQP---New-Doc-2018-11-06-21.27.46-1-2.pdf?alt=media&token=4bb3e2ae-b6a5-44aa-8cec-8ac16cc0cf01");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //GL
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%201%2FMicroeconomics%20and%20Applications%20-%201%2FGL.pdf?alt=media&token=1470c374-19a4-4cc3-8fec-092cd4dc46a2");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //RB
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BBE%2FSEM%201%2FMicroeconomics%20and%20Applications%20-%201%2FRB.pdf?alt=media&token=1dbe668b-bff4-485e-abba-4626f5a6a5aa");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
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
        item1.setName("Accounting for Managers");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("Microeconomics and Applications - 1");
        listDataHeader.add(item2);


        //for accounting for managers
        List<String> heading1 = new ArrayList<>();
        heading1.add("NOTES - Analysis of Variance");
        heading1.add("NOTES - CVP Analysis");
        heading1.add("NOTES - Decision Making");
        heading1.add("NOTES - Introduction to Cost Accounting and Cost Concepts");
        heading1.add("NOTES - Handwritten");
        heading1.add("Guidelines");
        heading1.add("Recommended Books");

        //for microeconomics and applications-1
        List<String> heading2 = new ArrayList<String>();
        heading2.add("READINGS -  Robert Pindyck, Daniel Rubinfeld");
        heading2.add("READINGS - Hal R. Varian");
        heading2.add("Question Paper - 1");
        heading2.add("Question Paper - 2");
        heading2.add("Guidelines");
        heading2.add("Recommended Books");



        listDataChild.put(listDataHeader.get(0), heading1);             //accounting for managers
        listDataChild.put(listDataHeader.get(1), heading2);             //microeconomics and applications-1

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
