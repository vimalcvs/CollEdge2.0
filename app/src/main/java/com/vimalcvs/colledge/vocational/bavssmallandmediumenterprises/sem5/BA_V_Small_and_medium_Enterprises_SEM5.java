package com.vimalcvs.colledge.vocational.bavssmallandmediumenterprises.sem5;

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

/** * Created by VimalCVS on 22/08/18. */

public class BA_V_Small_and_medium_Enterprises_SEM5 extends AppCompatActivity {


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
                    case 0:                             //Corporate Laws
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
                    case 2:                              //Financial Management in MSMEs
                        switch (childPosition) {
                            case 0:                             //GL
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%205%2FFinancial%20Management%20in%20MSMEs%2FGL.pdf?alt=media&token=6f57c495-b6ae-4adf-b5ea-1b4e7b4f64d4");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //RB
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/SME%2FSEM%205%2FFinancial%20Management%20in%20MSMEs%2FRB.pdf?alt=media&token=8906bb34-095e-47c6-ac1a-cf8a3a19cf41");
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
        item1.setName("Corporate Laws");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("Financial Accounting");
        listDataHeader.add(item2);

        ExpandedMenuModel item3 = new ExpandedMenuModel();
        item3.setName("Financial Management in MSMEs");
        listDataHeader.add(item3);


        //Corporate Laws
        List<String> heading1 = new ArrayList<>();
        heading1.add("NOTES - Corporate Law");
        heading1.add("NOTES - Emerging issues in Company Law");
        heading1.add("NOTES - Formation of a Company and Company Document");
        heading1.add("NOTES - Investigation and Winding-up");
        heading1.add("NOTES - Kinds of Companies");
        heading1.add("NOTES - Management");
        heading1.add("NOTES - Meeting");
        heading1.add("NOTES - Members and Shareholders of a Company");
        heading1.add("NOTES - Share Capital");
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

        //Financial Management in MSMEs
        List<String> heading3 = new ArrayList<String>();
        heading3.add("Guidelines");
        heading3.add("Recommended Books");


        listDataChild.put(listDataHeader.get(0), heading1);             //Corporate Laws
        listDataChild.put(listDataHeader.get(1), heading2);             //Financial Accounting
        listDataChild.put(listDataHeader.get(2), heading3);             //Financial Management in MSMEs

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
