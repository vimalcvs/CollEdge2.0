package com.vimalcvs.colledge.vocational.bavsmangementandmarkrtingofinsurance.sem3;

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

public class BA_V_Management_Marketing_of_insurance_SEM3 extends AppCompatActivity {


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
                    case 0:                             //Indian Economy- Sectoral Issues
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
                    case 1:                             //Principles of Life Insurance
                        switch (childPosition) {
                            case 0:                             //NOTES - Annuity
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MMI%2FSEM%203%2FPrinciples%20of%20Life%20Insurance%2FNOTES%20-%20annuity.pdf?alt=media&token=a1c16f1b-6e61-463f-af9e-f6854555f145");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - Policy Conditions
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MMI%2FSEM%203%2FPrinciples%20of%20Life%20Insurance%2FNOTES%20-%20conditions.pdf?alt=media&token=aba2c18a-bd90-4841-8749-7f1aafc79d81");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - Credit Insurance
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MMI%2FSEM%203%2FPrinciples%20of%20Life%20Insurance%2FNOTES%20-%20CREDIT%20INSURANCE(1).pdf?alt=media&token=62e4fa8a-4e37-46dc-bf47-c23feb244629");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //NOTES - Differently Abled  Person Insurance
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MMI%2FSEM%203%2FPrinciples%20of%20Life%20Insurance%2FNOTES%20-%20DIFFERENTLY%20ABLED%20%20PERSON%20INSURANCE.pdf?alt=media&token=3aae989e-01d4-4ab9-b3bb-a8453b806792");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //NOTES - Employee
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MMI%2FSEM%203%2FPrinciples%20of%20Life%20Insurance%2FNOTES%20-%20employee.pdf?alt=media&token=01382c20-2d64-45fb-8f8b-7d8e7fef5447");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //NOTES - Human Life
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MMI%2FSEM%203%2FPrinciples%20of%20Life%20Insurance%2FNOTES%20-%20HUMAN%20LIFE%20VALUE.pdf?alt=media&token=7462ade9-e62f-4d4d-9dba-dc60865cf8cf");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                            case 6:                             //NOTES - Life Insurance
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MMI%2FSEM%203%2FPrinciples%20of%20Life%20Insurance%2FNOTES%20-%20LIFE%20INSURANCE.pdf?alt=media&token=520f66da-db07-4856-8f96-2a138a457ece");
                                DownloadManager.Request request6 = new DownloadManager.Request(uri6);
                                request6.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference6 = downloadManager6.enqueue(request6);
                                break;
                            case 7:                             //NOTES - Policy Form Contents
                                DownloadManager downloadManager7;
                                downloadManager7 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri7 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MMI%2FSEM%203%2FPrinciples%20of%20Life%20Insurance%2FNOTES%20-%20Policy%20Form%20Contents.pdf?alt=media&token=450f8766-d94a-40cf-99e3-8a2f74cbcfb9");
                                DownloadManager.Request request7 = new DownloadManager.Request(uri7);
                                request7.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference7 = downloadManager7.enqueue(request7);
                                break;
                            case 8:                             //NOTES - Policy Form
                                DownloadManager downloadManager8;
                                downloadManager8 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri8 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MMI%2FSEM%203%2FPrinciples%20of%20Life%20Insurance%2FNOTES%20-%20POLICY%20FORM.pdf?alt=media&token=49874f81-67de-4fd1-9f8c-3f79fe866156");
                                DownloadManager.Request request8 = new DownloadManager.Request(uri8);
                                request8.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference8 = downloadManager8.enqueue(request8);
                                break;
                            case 9:                             //NOTES - Social Security Policies
                                DownloadManager downloadManager9;
                                downloadManager9 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri9 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MMI%2FSEM%203%2FPrinciples%20of%20Life%20Insurance%2FNOTES%20-%20Social%20security%20policies.pdf?alt=media&token=891ffb58-0989-412a-8763-2d14989b8c09");
                                DownloadManager.Request request9 = new DownloadManager.Request(uri9);
                                request9.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference9 = downloadManager9.enqueue(request9);
                                break;
                            case 10:                             //NOTES - Stages in Life and The Amount of Insurance
                                DownloadManager downloadManager10;
                                downloadManager10 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri10 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MMI%2FSEM%203%2FPrinciples%20of%20Life%20Insurance%2FNOTES%20-%20Stages%20in%20life%20and%20the%20amount%20of%20insurance.pdf?alt=media&token=86b18582-91df-4860-8b0b-0f4e1a563e2a");
                                DownloadManager.Request request10= new DownloadManager.Request(uri10);
                                request10.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference10 = downloadManager10.enqueue(request10);
                                break;
                            case 11:                             //NOTES - Stages in Life Insurance and Amount of Insurance
                                DownloadManager downloadManager11;
                                downloadManager11 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri11 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MMI%2FSEM%203%2FPrinciples%20of%20Life%20Insurance%2FNOTES%20-%20STAGES%20IN%20LIFE%20INSURANCE%20AND%20AMOUNT%20OF%20INSURANCE.pdf?alt=media&token=00c4032d-fe6b-46b9-a73d-19cfff6066f4");
                                DownloadManager.Request request11 = new DownloadManager.Request(uri11);
                                request11.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference11 = downloadManager11.enqueue(request11);
                                break;
                            case 12:                             //NOTES - ULIP
                                DownloadManager downloadManager12;
                                downloadManager12 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri12 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MMI%2FSEM%203%2FPrinciples%20of%20Life%20Insurance%2FNOTES%20-%20ULIP.pdf?alt=media&token=f1c6a039-8a78-4170-9f05-4eaea5c75116");
                                DownloadManager.Request request12 = new DownloadManager.Request(uri12);
                                request12.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference12 = downloadManager12.enqueue(request12);
                                break;
                            case 13:                             //NOTES - Variable Life Insurance
                                DownloadManager downloadManager13;
                                downloadManager13 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri13 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MMI%2FSEM%203%2FPrinciples%20of%20Life%20Insurance%2FNOTES%20-%20VARIABLE%20LIFE%20INSURANCE.pdf?alt=media&token=d0dbb380-3073-4922-b5b6-1d8371507f93");
                                DownloadManager.Request request13 = new DownloadManager.Request(uri13);
                                request13.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference13 = downloadManager13.enqueue(request13);
                                break;
                            case 14:                             //GL
                                DownloadManager downloadManager14;
                                downloadManager14 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri14 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MMI%2FSEM%203%2FPrinciples%20of%20Life%20Insurance%2FGL.pdf?alt=media&token=8b4ddd2c-0a54-4beb-92b5-bd8a5d948c73");
                                DownloadManager.Request request14 = new DownloadManager.Request(uri14);
                                request14.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference14 = downloadManager14.enqueue(request14);
                                break;
                            case 15:                             //RB
                                DownloadManager downloadManager15;
                                downloadManager15 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri15 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/MMI%2FSEM%203%2FPrinciples%20of%20Life%20Insurance%2FRB.pdf?alt=media&token=a3130517-62a3-4ccd-8645-fe3d09123ba9");
                                DownloadManager.Request request15 = new DownloadManager.Request(uri15);
                                request15.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference15 = downloadManager15.enqueue(request15);
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
        item2.setName("Principles of Life Insurance");
        listDataHeader.add(item2);


        //Indian Economy- Sectoral Issues
        List<String> heading1 = new ArrayList<>();
        heading1.add("Notes");
        heading1.add("Question Paper");
        heading1.add("Guidelines");
        heading1.add("Recommended Books");

        //Principles of Life Insurance
        List<String> heading2 = new ArrayList<String>();
        heading2.add("NOTES - Annuity");
        heading2.add("NOTES - Policy Conditions");
        heading2.add("NOTES - Credit Insurance");
        heading2.add("NOTES - Differently Abled  Person Insurance");
        heading2.add("NOTES - Employee");
        heading2.add("NOTES - Human Life Value");
        heading2.add("NOTES - Life Insurance");
        heading2.add("NOTES - Policy Form Contents");
        heading2.add("NOTES - Policy Form");
        heading2.add("NOTES - Social Security Policies");
        heading2.add("NOTES - Stages in Life and The Amount of Insurance");
        heading2.add("NOTES - Stages in Life Insurance and Amount of Insurance");
        heading2.add("NOTES - ULIP");
        heading2.add("NOTES - Variable Life Insurance");
        heading2.add("Guidelines");
        heading2.add("Recommended Books");


        listDataChild.put(listDataHeader.get(0), heading1);                 //Indian Economy- Sectoral Issues
        listDataChild.put(listDataHeader.get(1), heading2);                 //Principles of Life Insurance


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
