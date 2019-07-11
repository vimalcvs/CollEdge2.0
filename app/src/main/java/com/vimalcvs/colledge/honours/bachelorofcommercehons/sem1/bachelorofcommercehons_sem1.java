package com.vimalcvs.colledge.honours.bachelorofcommercehons.sem1;

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

public class bachelorofcommercehons_sem1 extends AppCompatActivity {


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
                    case 0:                             //Business Laws
                        switch (childPosition) {
                            case 0:                             //NOTES - Meaning and Kinds of Contracts
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Chapter%201%20(A)%20Meaning%20and%20Kinds%20of%20Contracts.pdf?alt=media&token=7bb21ac9-8974-45a0-aad5-d9c5b8308d04");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - Offer and Acceptance
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%201%20(B)%20Offer%20and%20Acceptance%20by%20Anu%20Panday.pdf?alt=media&token=98c4265f-c8f6-417d-9ce1-aa2fb3805a88");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - Consideration
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Consideration%20by%20Preeti%20Singh.pdf?alt=media&token=f2e7d5af-0998-4331-bca2-706e9b1a4465");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //NOTES - Capacity of Parties
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Capacity%20of%20Parties%20by%20Anu%20Panday.pdf?alt=media&token=3b2238a2-716a-4a26-9d0d-e963c5c0dcf5");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //NOTES - Free Consent
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Free%20Consent%20by%20Anu%20Panday(1).pdf?alt=media&token=147af091-2793-4e44-bd81-d559bc080026");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //NOTES - Legality of Objects
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Legality%20of%20Objects%20by%20Anu%20Panday.pdf?alt=media&token=4516a0b5-b704-48b1-a24c-748292737371");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                            case 6:                             //NOTES - Void Agreements
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Void%20Agreements%20by%20Preeti%20Singh.pdf?alt=media&token=ffc110cc-b766-4284-b6fe-2ba0573a4f7a");
                                DownloadManager.Request request6 = new DownloadManager.Request(uri6);
                                request6.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference6 = downloadManager6.enqueue(request6);
                                break;
                            case 7:                             //NOTES - Discharge of Contract
                                DownloadManager downloadManager7;
                                downloadManager7 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri7 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Discharge%20of%20Contract%20by%20Anu%20Panday.pdf?alt=media&token=400e18ec-d343-46ed-b571-14e3a6435191");
                                DownloadManager.Request request7 = new DownloadManager.Request(uri7);
                                request7.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference7 = downloadManager7.enqueue(request7);
                                break;
                            case 8:                             //NOTES - Breach of Contract
                                DownloadManager downloadManager8;
                                downloadManager8 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri8 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Breach%20of%20Contract%20by%20Preeti%20singh.pdf?alt=media&token=de3b942b-c364-4564-8cdd-0174fcf8c0ab");
                                DownloadManager.Request request8 = new DownloadManager.Request(uri8);
                                request8.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference8 = downloadManager8.enqueue(request8);
                                break;
                            case 9:                             //NOTES - Contingent Contracts
                                DownloadManager downloadManager9;
                                downloadManager9 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri9 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Contingent%20Contracts%20by%20Preeti%20Singh.pdf?alt=media&token=5c8e3043-fe10-45d1-b43d-fd456b29f669");
                                DownloadManager.Request request9 = new DownloadManager.Request(uri9);
                                request9.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference9 = downloadManager9.enqueue(request9);
                                break;
                            case 10:                             //NOTES - Quasi Contract
                                DownloadManager downloadManager10;
                                downloadManager10 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri10 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Quasi%20Contract%20by%20Anu%20Panday.pdf?alt=media&token=f9e39f55-b3ce-459a-988c-39a0724af4ea");
                                DownloadManager.Request request10= new DownloadManager.Request(uri10);
                                request10.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference10 = downloadManager10.enqueue(request10);
                                break;
                            case 11:                             //NOTES - Indemnity and Guarantee
                                DownloadManager downloadManager11;
                                downloadManager11 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri11 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Indemnity%20and%20Guarantee%20by%20Preeti%20singh.pdf?alt=media&token=d0de1b71-42b5-49c7-b8dc-59b166211fbb");
                                DownloadManager.Request request11 = new DownloadManager.Request(uri11);
                                request11.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference11 = downloadManager11.enqueue(request11);
                                break;
                            case 12:                             //NOTES - Bailment
                                DownloadManager downloadManager12;
                                downloadManager12 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri12 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Bailment%20by%20Anu%20Panday.pdf?alt=media&token=62211ccb-e165-45d7-bcc3-3ca3d230aa67");
                                DownloadManager.Request request12 = new DownloadManager.Request(uri12);
                                request12.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference12 = downloadManager12.enqueue(request12);
                                break;
                            case 13:                             //NOTES - Contract of Agency
                                DownloadManager downloadManager13;
                                downloadManager13 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri13 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Contract%20of%20Agency%20bu%20anu%20Panday.pdf?alt=media&token=fe3141e7-ce8b-4c1b-bb4e-5326d022221d");
                                DownloadManager.Request request13 = new DownloadManager.Request(uri13);
                                request13.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference13 = downloadManager13.enqueue(request13);
                                break;
                            case 14:                             //NOTES - An Introduction to the Sale of Goods Act
                                DownloadManager downloadManager14;
                                downloadManager14 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri14 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20An%20Introduction%20to%20the%20Sale%20of%20Goods%20Act%20-%20Copy.pdf?alt=media&token=9c2e37a2-0be4-41b1-a1e3-40352bf3165a");
                                DownloadManager.Request request14 = new DownloadManager.Request(uri14);
                                request14.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference14 = downloadManager14.enqueue(request14);
                                break;
                            case 15:                             //NOTES - Conditions and Warranties
                                DownloadManager downloadManager15;
                                downloadManager15 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri15 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Conditions%20and%20Warranties.pdf?alt=media&token=3b93fea7-fdac-4086-803c-3d11630d375c");
                                DownloadManager.Request request15 = new DownloadManager.Request(uri15);
                                request15.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference15 = downloadManager15.enqueue(request15);
                                break;
                            case 16:                             //NOTES - Transfer of Property
                                DownloadManager downloadManager16;
                                downloadManager16 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri16 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Transfer%20of%20Property.pdf?alt=media&token=f8eb36ea-c7e5-4be8-b472-7fe69612093b");
                                DownloadManager.Request request16 = new DownloadManager.Request(uri16);
                                request16.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference16 = downloadManager16.enqueue(request16);
                                break;
                            case 17:                            //NOTES - Remedies
                                DownloadManager downloadManager17;
                                downloadManager17 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri17 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Remedies.pdf?alt=media&token=5b84b80c-2086-428f-855f-c64c1e4e1b35");
                                DownloadManager.Request request17 = new DownloadManager.Request(uri17);
                                request17.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference17 = downloadManager17.enqueue(request17);
                                break;
                            case 18:                            //NOTES - Introduction to LLP
                                DownloadManager downloadManager18;
                                downloadManager18 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri18 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Introduction%20to%20LLP.pdf?alt=media&token=b3bac602-4f8a-4996-8c1f-afc00c907a20");
                                DownloadManager.Request request18 = new DownloadManager.Request(uri18);
                                request18.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference18 = downloadManager18.enqueue(request18);
                                break;
                            case 19:                            //NOTES - Incorporation of LLP
                                DownloadManager downloadManager19;
                                downloadManager19 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri19 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Incorporation%20of%20LLP.pdf?alt=media&token=90eea975-b8d6-4df9-bbb3-996747afb82e");
                                DownloadManager.Request request19 = new DownloadManager.Request(uri19);
                                request19.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference19 = downloadManager19.enqueue(request19);
                                break;
                            case 20:                            //NOTES - Functioning and Winding up of a LLP
                                DownloadManager downloadManager20;
                                downloadManager20 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri20 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Functioning%20and%20Winding%20up%20of%20a%20LLP_Monika_25-8-13.pdf?alt=media&token=e23714e9-2d97-49f3-aefd-4ed19fbf6569");
                                DownloadManager.Request request20 = new DownloadManager.Request(uri20);
                                request20.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference20 = downloadManager20.enqueue(request20);
                                break;
                            case 21:                            //NOTES - Informaton Tecnology Act
                                DownloadManager downloadManager21;
                                downloadManager21 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri21 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Informaton%20Tecnology%20Act%202000%20by%20Nidhi%20Dhawan.pdf?alt=media&token=872c0977-6088-4f52-9910-e17cee164dca");
                                DownloadManager.Request request21 = new DownloadManager.Request(uri21);
                                request21.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference21 = downloadManager21.enqueue(request21);
                                break;
                            case 22:                            //NOTES - Electronic Records, E- Governance and Subscriber
                                DownloadManager downloadManager22;
                                downloadManager22 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri22 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Electronic%20Records%2C%20E-%20Governance%20and%20Subscriber%20by%20Nidhi%20Dhawan.pdf?alt=media&token=6725db9f-ee64-4615-9e63-9b76a37e042d");
                                DownloadManager.Request request22 = new DownloadManager.Request(uri22);
                                request22.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference22 = downloadManager22.enqueue(request22);
                                break;
                            case 23:                            //NOTES - Regulation of Certifying Authorities
                                DownloadManager downloadManager23;
                                downloadManager23 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri23 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Regulation%20of%20Certifying%20Authorities%20by%20Nidhi%20Dhawan.pdf?alt=media&token=5755e121-f384-46b4-82c4-5f97503815bb");
                                DownloadManager.Request request23 = new DownloadManager.Request(uri23);
                                request23.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference23 = downloadManager23.enqueue(request23);
                                break;
                            case 24:                            //NOTES - Contraventions, Offences and Appellate Tribunal
                                DownloadManager downloadManager24;
                                downloadManager24 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri24 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FNOTES%20-%20Contraventions%2C%20Offences%20and%20Appellate%20Tribunal%20by%20Nidhi%20Dhawan.pdf?alt=media&token=bf6ecb74-738c-4489-85c1-1fd75c9707a0");
                                DownloadManager.Request request24 = new DownloadManager.Request(uri24);
                                request24.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference24 = downloadManager24.enqueue(request24);
                                break;
                            case 25:                            //QP1
                                DownloadManager downloadManager25;
                                downloadManager25 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri25 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FQP4.pdf?alt=media&token=8324289b-3e62-4a62-8d45-57df14975dbf");
                                DownloadManager.Request request25 = new DownloadManager.Request(uri25);
                                request25.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference25 = downloadManager25.enqueue(request25);
                                break;
                            case 26:                            //QP2
                                DownloadManager downloadManager26;
                                downloadManager26 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri26 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FQP5.pdf?alt=media&token=47d0ee7d-6aa0-4f45-be73-769d6e8a4fc9");
                                DownloadManager.Request request26 = new DownloadManager.Request(uri26);
                                request26.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference26 = downloadManager26.enqueue(request26);
                                break;
                            case 27:                            //QP3
                                DownloadManager downloadManager27;
                                downloadManager27 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri27 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FQP6.pdf?alt=media&token=ae50e79c-bc79-452e-9eb9-211ef32fceae");
                                DownloadManager.Request request27 = new DownloadManager.Request(uri27);
                                request27.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference27 = downloadManager27.enqueue(request27);
                                break;
                            case 28:                            //GL
                                DownloadManager downloadManager28;
                                downloadManager28 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri28 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FGL.pdf?alt=media&token=1f1ef2dd-365f-4c8f-b361-706509ce731a");
                                DownloadManager.Request request28 = new DownloadManager.Request(uri28);
                                request28.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference28 = downloadManager28.enqueue(request28);
                                break;
                            case 29:                            //RB
                                DownloadManager downloadManager29;
                                downloadManager29 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri29 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FBusiness%20Laws%2FRB.pdf?alt=media&token=0f2f5867-e69b-4bc1-9de2-f85b8fd11647");
                                DownloadManager.Request request29 = new DownloadManager.Request(uri29);
                                request29.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference29 = downloadManager29.enqueue(request29);
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
                                Uri uri13 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FFinancial%20Accounting%2FGL.pdf?alt=media&token=57d7de8d-84d7-4aad-b784-18dc98649379");
                                DownloadManager.Request request13 = new DownloadManager.Request(uri13);
                                request13.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference13 = downloadManager13.enqueue(request13);
                                break;
                            case 14:                             //RB
                                DownloadManager downloadManager14;
                                downloadManager14 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri14 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/BCOM%2FSEM%201%2FFinancial%20Accounting%2FRB.pdf?alt=media&token=c3221e7f-9a2e-4ee7-ab72-a33de4beef2c");
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
        item1.setName("Business Laws");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("Financial Accounting");
        listDataHeader.add(item2);

        //for Business Laws
        List<String> heading1 = new ArrayList<>();
        heading1.add("NOTES - Meaning and Kinds of Contracts");
        heading1.add("NOTES - Offer and Acceptance");
        heading1.add("NOTES - Consideration");
        heading1.add("NOTES - Capacity of Parties");
        heading1.add("NOTES - Free Consent");
        heading1.add("NOTES - Legality of Objects");
        heading1.add("NOTES - Void Agreements");
        heading1.add("NOTES - Discharge of Contract");
        heading1.add("NOTES - Breach of Contract");
        heading1.add("NOTES - Contingent Contracts");
        heading1.add("NOTES - Quasi Contract");
        heading1.add("NOTES - Indemnity and Guarantee");
        heading1.add("NOTES - Bailment");
        heading1.add("NOTES - Contract of Agency");
        heading1.add("NOTES - An Introduction to the Sale of Goods Act");
        heading1.add("NOTES - Conditions and Warranties");
        heading1.add("NOTES - Transfer of Property");
        heading1.add("NOTES - Remedies");
        heading1.add("NOTES - Introduction to LLP");
        heading1.add("NOTES - Incorporation of LLP");
        heading1.add("NOTES - Functioning and Winding up of a LLP");
        heading1.add("NOTES - Informaton Tecnology Act");
        heading1.add("NOTES - Electronic Records, E- Governance and Subscriber ");
        heading1.add("NOTES - Regulation of Certifying Authorities ");
        heading1.add("NOTES - Contraventions, Offences and Appellate Tribunal");
        heading1.add("Question Paper - 1");
        heading1.add("Question Paper - 2");
        heading1.add("Question Paper - 3");
        heading1.add("Guidelines");
        heading1.add("Recommended Books");

        //for Financial Accounting
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


        listDataChild.put(listDataHeader.get(0), heading1);             //Business Laws
        listDataChild.put(listDataHeader.get(1), heading2);             //Financial Accounting

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
