package com.vimalcvs.colledge.vocational.bavshumanresoursmanegment.sem1;

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
public class BA_V_Human_Resours_Management_SEM1 extends AppCompatActivity {


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
                    case 0:                             //Business Organization and Environment-I
                        switch (childPosition) {
                            case 0:                             //NOTES - Entrepreneurial Opportunities in Contemporary Business Environment
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Entrepreneurial%20Opportunities%20in%20Contemporary%20Business%20Environment%20by%20bhanu%20murthy.pdf?alt=media&token=815552e1-ee81-4de5-96d8-0b9622eca7d0");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - Management of Strategic Change
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Management%20of%20Strategic%20Change%20by%20Sonu%20Mehta.pdf?alt=media&token=3001406c-2da8-4f81-b818-137b7be1fb4d");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - Administrative Function
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Administrative%20Function%20by%20Shilpa%20Chaudhary.pdf?alt=media&token=bee725dc-1262-412d-8f96-e95869f77d74");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //NOTES - E-Commerce and M-Commerce
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20E-Commerce%20and%20M-Commerce%20by%20Vikas%20Madan.pdf?alt=media&token=835e3b68-362b-4bbe-8c57-747cc6150b64");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //NOTES - Human Resource Management
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Human%20Resource%20Management.pdf?alt=media&token=d9db7825-3c3f-4fcd-b172-9f739ba45245");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //NOTES - Motivation
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Motivation%20by%20Sonu%20Mehta.pdf?alt=media&token=60c25878-50fd-4bbc-b456-cbd77f6ed15f");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                            case 6:                             //NOTES - Role of Creativity and Innovation in Opportunity and Idea Generation
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Role%20of%20Creativity%20and%20Innovation%20in%20Opportunity%20and%20Idea%20Generation%20by%20K.%20V.%20Bhanu%20Murthy.pdf?alt=media&token=3d5188fb-2b66-40c6-a8d5-2ea26b737eba");
                                DownloadManager.Request request6 = new DownloadManager.Request(uri6);
                                request6.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference6 = downloadManager6.enqueue(request6);
                                break;
                            case 7:                             //NOTES - Organizing
                                DownloadManager downloadManager7;
                                downloadManager7 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri7 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Organizing%20by%20Shilpa%20Chaudhary.pdf?alt=media&token=efdbd1bc-0f1a-49a1-8ab5-9a69c20ab5d6");
                                DownloadManager.Request request7 = new DownloadManager.Request(uri7);
                                request7.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference7 = downloadManager7.enqueue(request7);
                                break;
                            case 8:                             //NOTES - Process of Setting up a New Business
                                DownloadManager downloadManager8;
                                downloadManager8 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri8 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Process%20of%20Setting%20up%20a%20New%20Business%20by%20KV%20Bhanu%20Murthy.pdf?alt=media&token=116de058-7db5-4a62-9fa9-b414aac5049b");
                                DownloadManager.Request request8 = new DownloadManager.Request(uri8);
                                request8.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference8 = downloadManager8.enqueue(request8);
                                break;
                            case 9:                             //NOTES - Network Marketing
                                DownloadManager downloadManager9;
                                downloadManager9 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri9 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Network%20Marketing%20by%20Roopa%20Johri%20and%20roomila%20Aggarwal.pdf?alt=media&token=48aec6a4-dcc5-42e2-a5d7-3432a8a82478");
                                DownloadManager.Request request9 = new DownloadManager.Request(uri9);
                                request9.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference9 = downloadManager9.enqueue(request9);
                                break;
                            case 10:                             //NOTES - BPO
                                DownloadManager downloadManager10;
                                downloadManager10 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri10 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20BPO.pdf?alt=media&token=ca6fca3b-d685-4a00-b056-2419e784935c");
                                DownloadManager.Request request10= new DownloadManager.Request(uri10);
                                request10.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference10 = downloadManager10.enqueue(request10);
                                break;
                            case 11:                             //NOTES - Managing Diversity
                                DownloadManager downloadManager11;
                                downloadManager11 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri11 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Managing%20Diversity.pdf?alt=media&token=b6a6be4e-7774-41b6-ac8c-1edf59b5eecd");
                                DownloadManager.Request request11 = new DownloadManager.Request(uri11);
                                request11.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference11 = downloadManager11.enqueue(request11);
                                break;
                            case 12:                             //NOTES - Communication
                                DownloadManager downloadManager12;
                                downloadManager12 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri12 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Communication.pdf?alt=media&token=f84cd0f8-9dda-42c3-8197-96f193d601c2");
                                DownloadManager.Request request12 = new DownloadManager.Request(uri12);
                                request12.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference12 = downloadManager12.enqueue(request12);
                                break;
                            case 13:                             //NOTES - Learning Organization
                                DownloadManager downloadManager13;
                                downloadManager13 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri13 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Learning%20organization.pdf?alt=media&token=4e9805c0-b30b-48fe-a460-df0947992d88");
                                DownloadManager.Request request13 = new DownloadManager.Request(uri13);
                                request13.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference13 = downloadManager13.enqueue(request13);
                                break;
                            case 14:                             //NOTES - Franchising
                                DownloadManager downloadManager14;
                                downloadManager14 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri14 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Franchising.pdf?alt=media&token=cfe49088-4428-417e-9f5b-3bf4ce21b22e");
                                DownloadManager.Request request14 = new DownloadManager.Request(uri14);
                                request14.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference14 = downloadManager14.enqueue(request14);
                                break;
                            case 15:                             //NOTES - Knowledge Management
                                DownloadManager downloadManager15;
                                downloadManager15 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri15 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Knowledge%20Management.pdf?alt=media&token=c1e964b9-361d-43b2-a3ad-ad185624e85e");
                                DownloadManager.Request request15 = new DownloadManager.Request(uri15);
                                request15.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference15 = downloadManager15.enqueue(request15);
                                break;
                            case 16:                             //NOTES - Contemporary Business Environment
                                DownloadManager downloadManager16;
                                downloadManager16 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri16 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Contemporary%20business%20environment.pdf?alt=media&token=cea47010-95d8-4f50-a042-b44d4919641f");
                                DownloadManager.Request request16 = new DownloadManager.Request(uri16);
                                request16.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference16 = downloadManager16.enqueue(request16);
                                break;
                            case 17:                            //NOTES - Control
                                DownloadManager downloadManager17;
                                downloadManager17 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri17 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Control.pdf?alt=media&token=40cfcb0c-0f59-4508-ac38-5bd2231e08c4");
                                DownloadManager.Request request17 = new DownloadManager.Request(uri17);
                                request17.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference17 = downloadManager17.enqueue(request17);
                                break;
                            case 18:                            //NOTES - Finance
                                DownloadManager downloadManager18;
                                downloadManager18 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri18 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Finance.pdf?alt=media&token=bd2506a1-44b4-41f6-983f-3fa84dd14158");
                                DownloadManager.Request request18 = new DownloadManager.Request(uri18);
                                request18.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference18 = downloadManager18.enqueue(request18);
                                break;
                            case 19:                            //NOTES - Multinational Corporations and Transnationals
                                DownloadManager downloadManager19;
                                downloadManager19 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri19 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Multinational%20Corporations%20and%20Transnationals.pdf?alt=media&token=5572ac8d-05ad-4c78-ba35-9b7c73c5c499");
                                DownloadManager.Request request19 = new DownloadManager.Request(uri19);
                                request19.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference19 = downloadManager19.enqueue(request19);
                                break;
                            case 20:                            //NOTES - Planning
                                DownloadManager downloadManager20;
                                downloadManager20 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri20 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Planning.pdf?alt=media&token=550d53b4-9246-42a9-acc4-aeba4df6e5a9");
                                DownloadManager.Request request20 = new DownloadManager.Request(uri20);
                                request20.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference20 = downloadManager20.enqueue(request20);
                                break;
                            case 21:                            //NOTES - Development of Management Thought
                                DownloadManager downloadManager21;
                                downloadManager21 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri21 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Development%20of%20Management%20Thought%20by%20romila%20aggarwal.pdf?alt=media&token=48ceee59-7b4d-44b8-94d3-4d4f78f58b99");
                                DownloadManager.Request request21 = new DownloadManager.Request(uri21);
                                request21.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference21 = downloadManager21.enqueue(request21);
                                break;
                            case 22:                            //NOTES - Foundations Of The Spectrum Of Indian Business
                                DownloadManager downloadManager22;
                                downloadManager22 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri22 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Foundations%20Of%20The%20Spectrum%20Of%20Indian%20Business(1)%5B1%5D.pdf?alt=media&token=0debefce-c0dd-43b9-ae0d-7e36df4bb37d");
                                DownloadManager.Request request22 = new DownloadManager.Request(uri22);
                                request22.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference22 = downloadManager22.enqueue(request22);
                                break;
                            case 23:                            //NOTES - Process of managing - Decision Making
                                DownloadManager downloadManager23;
                                downloadManager23 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri23 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Process%20of%20managing%20-%20Decision%20Making.pdf?alt=media&token=814c64a4-dddf-4e78-94df-61d36510aa1d");
                                DownloadManager.Request request23 = new DownloadManager.Request(uri23);
                                request23.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference23 = downloadManager23.enqueue(request23);
                                break;
                            case 24:                            //NOTES - Feasibility and Business Plan
                                DownloadManager downloadManager24;
                                downloadManager24 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri24 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FNOTES%20-%20Feasibility%20and%20Business%20Plan.pdf?alt=media&token=d250feb6-769d-4cdc-a229-3d76646f7ae8");
                                DownloadManager.Request request24 = new DownloadManager.Request(uri24);
                                request24.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference24 = downloadManager24.enqueue(request24);
                                break;
                            case 25:                            //GL
                                DownloadManager downloadManager25;
                                downloadManager25 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri25 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FGL.pdf?alt=media&token=5108fb47-d75e-49bd-a4f0-20b633f44838");
                                DownloadManager.Request request25 = new DownloadManager.Request(uri25);
                                request25.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference25 = downloadManager25.enqueue(request25);
                                break;
                            case 26:                            //RB
                                DownloadManager downloadManager26;
                                downloadManager26 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri26 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FBusiness%20Organization%20and%20Environment-I%2FRB.pdf?alt=media&token=839c0c50-1791-49c3-a7aa-ff325811f8e2");
                                DownloadManager.Request request26 = new DownloadManager.Request(uri26);
                                request26.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference26 = downloadManager26.enqueue(request26);
                                break;
                        }
                        break;
                    case 1:                             //Principles of Microeconomics
                        switch (childPosition) {
                                case 0:                             //NOTES
                                    DownloadManager downloadManager0;
                                    downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                    Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FPrinciples%20of%20Microeconomics%2FNOTES%20-%20New%20Doc%202018-11-05%2015.08.11.pdf?alt=media&token=5e0f360f-a087-41e1-a3c2-b28c99e7ee0f");
                                    DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                    request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                    Long reference0 = downloadManager0.enqueue(request0);
                                    break;
                                case 1:                             //QP
                                    DownloadManager downloadManager1;
                                    downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                    Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FPrinciples%20of%20Microeconomics%2FQP.pdf?alt=media&token=e9bb7b41-ea3d-41cf-bb76-048640e1b4a1");
                                    DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                    request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                    Long reference1 = downloadManager1.enqueue(request1);
                                    break;
                                case 2:                             //GL
                                    DownloadManager downloadManager2;
                                    downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                    Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FPrinciples%20of%20Microeconomics%2FGL.pdf?alt=media&token=d71b549f-06e7-4471-b461-2e3a1d33c514");
                                    DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                    request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                    Long reference2 = downloadManager2.enqueue(request2);
                                    break;
                                case 3:                             //RB
                                    DownloadManager downloadManager3;
                                    downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                    Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HRM%2FSEM%201%2FPrinciples%20of%20Microeconomics%2FRB.pdf?alt=media&token=da73e0dc-2042-4d98-a7fc-266066bb3970");
                                    DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                    request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                    Long reference3 = downloadManager3.enqueue(request3);
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
        item1.setName("Business Organization and Environment-I");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("Principles of Microeconomics");
        listDataHeader.add(item2);


        //Business Organization and Environment-I
        List<String> heading1 = new ArrayList<>();
        heading1.add("NOTES - Entrepreneurial Opportunities in Contemporary Business Environment");
        heading1.add("NOTES - Management of Strategic Change");
        heading1.add("NOTES - Administrative Function");
        heading1.add("NOTES - E-Commerce and M-Commerce");
        heading1.add("NOTES - Human Resource Management");
        heading1.add("NOTES - Motivation");
        heading1.add("NOTES - Role of Creativity and Innovation in Opportunity and Idea Generation");
        heading1.add("NOTES - Organizing");
        heading1.add("NOTES - Process of Setting up a New Business");
        heading1.add("NOTES - Network Marketing");
        heading1.add("NOTES - BPO");
        heading1.add("NOTES - Managing Diversity");
        heading1.add("NOTES - Communication");
        heading1.add("NOTES - Learning Organization");
        heading1.add("NOTES - Franchising");
        heading1.add("NOTES - Knowledge Management");
        heading1.add("NOTES - Contemporary Business Environment");
        heading1.add("NOTES - Control");
        heading1.add("NOTES - Finance");
        heading1.add("NOTES - Multinational Corporations and Transnationals");
        heading1.add("NOTES - Planning");
        heading1.add("NOTES - Development of Management Thought");
        heading1.add("NOTES - Foundations Of The Spectrum Of Indian Business");
        heading1.add("NOTES - Process of managing - Decision Making");
        heading1.add("NOTES - Feasibility and Business Plan");
        heading1.add("Guidelines");
        heading1.add("Recommended Books");

        //Principles of Microeconomics
        List<String> heading2 = new ArrayList<String>();
        heading2.add("Notes");
        heading2.add("Question Paper");
        heading2.add("Guidelines");
        heading2.add("Recommended Books");


        listDataChild.put(listDataHeader.get(0), heading1);             //Business Organization and Environment-I
        listDataChild.put(listDataHeader.get(1), heading2);             //Principles of Microeconomics

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
