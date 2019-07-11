package com.vimalcvs.colledge.vocational.bavsofficemangmentandsecretarialpractice.sem1;

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

public class BA_V_Office_Management_SEM1 extends AppCompatActivity {


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
                    case 0:                             //Office Management and methods
                        switch (childPosition){
                            case 0:                             //GL
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/OMSP%2FSEM%201%2FOffice%20Management%20and%20methods%2FGL.pdf?alt=media&token=7b398b04-e7f5-4793-8a38-750859d956e2");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //RB
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/OMSP%2FSEM%201%2FOffice%20Management%20and%20methods%2FRB.pdf?alt=media&token=2cbcbef8-6f12-451a-9a9e-cd10aef3c7ef");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                        }
                        break;
                    case 1:                             //Financial Accounting
                        switch (childPosition) {
                            case 0:                             //NOTES - Accounting Concepts and Conventions
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FFinancial%20Accounting%2FNOTES%20-%20Accounting%20Concepts%20and%20Conventions.pdf?alt=media&token=01606544-4f65-42b4-8292-63ce850195c1");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - Introduction to Accounting Theory
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FFinancial%20Accounting%2FNOTES%20-%20Introduction%20to%20Accounting%20Theory.pdf?alt=media&token=e426e27d-92e1-4354-93eb-eec12e395488");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - Measurement of Business Income
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FFinancial%20Accounting%2FNOTES%20-%20Measurement%20of%20Business%20Income.pdf?alt=media&token=6dc212bc-137b-47cd-af05-33ff4600c052");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //NOTES - Inventory Valuation
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FFinancial%20Accounting%2FNOTES%20-%20Inventory%20Valuation.pdf?alt=media&token=a12398dc-5762-452f-be94-81d23a8c7e89");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //NOTES - Depreciation
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FFinancial%20Accounting%2FNOTES%20-%20Depreciation.pdf?alt=media&token=7808b5c5-3dff-4264-ada1-4b275b7c24bb");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //NOTES - Accounting Cycle: Final Accounts
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FFinancial%20Accounting%2FNOTES%20-%20Accounting%20Cycle_Final%20Accounts.pdf?alt=media&token=6d18cd71-8d19-44cc-9a81-69390d09b736");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                            case 6:                             //NOTES - Accounting Cycle: Recording of Transactions
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FFinancial%20Accounting%2FNOTES%20-%20Accounting%20Cycle_Recording%20of%20Transactions.pdf?alt=media&token=dae42c47-0e00-4be5-b9b5-60ae1d9271bb");
                                DownloadManager.Request request6 = new DownloadManager.Request(uri6);
                                request6.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference6 = downloadManager6.enqueue(request6);
                                break;
                            case 7:                             //NOTES - Consignment Account
                                DownloadManager downloadManager7;
                                downloadManager7 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri7 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FFinancial%20Accounting%2FNOTES%20-%20Consignment%20Account.pdf?alt=media&token=47888fd2-c983-41be-b12b-4f2f19fff1f5");
                                DownloadManager.Request request7 = new DownloadManager.Request(uri7);
                                request7.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference7 = downloadManager7.enqueue(request7);
                                break;
                            case 8:                             //NOTES - Joint Venture
                                DownloadManager downloadManager8;
                                downloadManager8 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri8 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FFinancial%20Accounting%2FNOTES%20-%20Joint%20Venture.pdf?alt=media&token=eb157cf4-3bb0-4d77-a5ff-144b5f4ec080");
                                DownloadManager.Request request8 = new DownloadManager.Request(uri8);
                                request8.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference8 = downloadManager8.enqueue(request8);
                                break;
                            case 9:                             //NOTES - Branch Accounting
                                DownloadManager downloadManager9;
                                downloadManager9 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri9 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FFinancial%20Accounting%2FNOTES%20-%20Branch%20Accounting.pdf?alt=media&token=5d9b5556-def0-4a4a-8317-b88c93591be9");
                                DownloadManager.Request request9 = new DownloadManager.Request(uri9);
                                request9.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference9 = downloadManager9.enqueue(request9);
                                break;
                            case 10:                             //NOTES - Accounting for Hire Purchase System
                                DownloadManager downloadManager10;
                                downloadManager10 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri10 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FFinancial%20Accounting%2FNOTES%20-%20Accounting%20for%20Hire%20Purchase%20System.pdf?alt=media&token=fc8faf38-7841-4355-986f-2e7dcf0bac9d");
                                DownloadManager.Request request10= new DownloadManager.Request(uri10);
                                request10.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference10 = downloadManager10.enqueue(request10);
                                break;
                            case 11:                             //NOTES - Introduction to Auditing
                                DownloadManager downloadManager11;
                                downloadManager11 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri11 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FFinancial%20Accounting%2FNOTES%20-%20Introduction%20to%20Auditing.pdf?alt=media&token=959cdab1-e3ad-4213-ba27-24588c21eeec");
                                DownloadManager.Request request11 = new DownloadManager.Request(uri11);
                                request11.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference11 = downloadManager11.enqueue(request11);
                                break;
                            case 12:                             //NOTES - Verification of Assets & Liabilities and Auditor Report
                                DownloadManager downloadManager12;
                                downloadManager12 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri12 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FFinancial%20Accounting%2FNOTES%20-%20Verification%20of%20Assets%20%26%20Liabilities%20and%20Auditor%20Report.pdf?alt=media&token=1b349566-c082-44ef-92dc-64df6ceaf540");
                                DownloadManager.Request request12 = new DownloadManager.Request(uri12);
                                request12.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference12 = downloadManager12.enqueue(request12);
                                break;
                            case 13:                             //GL
                                DownloadManager downloadManager13;
                                downloadManager13 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri13 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%205%2FFinancial%20Accounting%2FGL.pdf?alt=media&token=7c6ea404-2bce-4444-9ffc-1d84dabbd9fb");
                                DownloadManager.Request request13 = new DownloadManager.Request(uri13);
                                request13.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference13 = downloadManager13.enqueue(request13);
                                break;
                            case 14:                             //RB
                                DownloadManager downloadManager14;
                                downloadManager14 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri14 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%205%2FFinancial%20Accounting%2FRB.pdf?alt=media&token=fb93c428-c4e6-4740-affb-bebb16b7be04");
                                DownloadManager.Request request14 = new DownloadManager.Request(uri14);
                                request14.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference14 = downloadManager14.enqueue(request14);
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
        item1.setName("Office Management and methods");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("Financial Accounting");
        listDataHeader.add(item2);

        //Office Management and methods
        List<String> heading1 = new ArrayList<>();
        heading1.add("Guidelines");
        heading1.add("Recommended Books");

        //Financial Accounting
        List<String> heading2 = new ArrayList<String>();
        heading2.add("NOTES - Accounting Concepts and Conventions");
        heading2.add("NOTES - Introduction to Accounting Theory");
        heading2.add("NOTES - Measurement of Business Income");
        heading2.add("NOTES - Inventory Valuation");
        heading2.add("NOTES - Depreciation");
        heading2.add("NOTES - Accounting Cycle: Final Accounts");
        heading2.add("NOTES - Accounting Cycle: Recording of Transactions");
        heading2.add("NOTES - Consignment Account");
        heading2.add("NOTES - Joint Venture");
        heading2.add("NOTES - Branch Accounting");
        heading2.add("NOTES - Accounting for Hire Purchase System");
        heading2.add("NOTES - Introduction to Auditing");
        heading2.add("NOTES - Verification of Assets & Liabilities and Auditor Report");
        heading2.add("Guidelines");
        heading2.add("Recommended Books");


        listDataChild.put(listDataHeader.get(0), heading1);             //Office Management and methods
        listDataChild.put(listDataHeader.get(1), heading2);             //Financial Accounting

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
