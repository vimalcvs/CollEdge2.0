package com.vimalcvs.colledge.honours.bahindi.sem1;


import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;

import com.vimalcvs.colledge.helper.ExpandableListAdapter;
import com.vimalcvs.colledge.R;
import com.vimalcvs.colledge.helper.ExpandedMenuModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** * Created by VimalCVS on 22/08/18. */

public class BAHindi_SEM1 extends AppCompatActivity {


    ExpandableListAdapter mMenuAdapter;
    ExpandableListView expandableList;
    List<ExpandedMenuModel> listDataHeader;
    HashMap<ExpandedMenuModel, List<String>> listDataChild;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expandablelistview);

        expandableList = (ExpandableListView) findViewById(R.id.expandableListView);

        prepareListData();

        mMenuAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild, expandableList);

        expandableList.setAdapter(mMenuAdapter);

        expandableList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition, long l) {
                switch (groupPosition) {
                    case 0:             //Hindi Bhasha aur Uski Lipi ka Itihas
                        switch (childPosition) {
                            case 0:                             //QP
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Bhasha%20aur%20Uski%20Lipi%20ka%20Itihas%2FQP.pdf?alt=media&token=891fc26e-a02c-4530-ac4e-40fd8e68e54e");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //GL
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Bhasha%20aur%20Uski%20Lipi%20ka%20Itihas%2FGL.pdf?alt=media&token=393407e0-fb04-4daf-bd97-d8c30c4d0223");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //RB
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Bhasha%20aur%20Uski%20Lipi%20ka%20Itihas%2FRB.pdf?alt=media&token=2e855255-0c78-446e-8715-0b6159d1f0d1");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                        }
                        break;
                    case 1:             //Hindi Kavita (Aadikal aev Bhaktikaleen Kaavy)
                        switch (childPosition) {
                            case 0:                             //NOTES - खड़ी बोली और उर्दू के महान् कवि  खुसरो
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Kavita%20(Aadikal%20aev%20Bhaktikaleen%20Kaavy)%2FNOTES%20-%20%E0%A4%96%E0%A4%A1%E0%A4%BC%E0%A5%80%20%E0%A4%AC%E0%A5%8B%E0%A4%B2%E0%A5%80%20%E0%A4%94%E0%A4%B0%20%E0%A4%89%E0%A4%B0%E0%A5%8D%E0%A4%A6%E0%A5%82%20%E0%A4%95%E0%A5%87%20%E0%A4%AE%E0%A4%B9%E0%A4%BE%E0%A4%A8%E0%A5%8D%20%E0%A4%95%E0%A4%B5%E0%A4%BF%20%20%E0%A4%96%E0%A5%81%E0%A4%B8%E0%A4%B0%E0%A5%8B.pdf?alt=media&token=82533371-718d-473d-9693-6432bfb81a72");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - कुतुबन: मृगावती
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Kavita%20(Aadikal%20aev%20Bhaktikaleen%20Kaavy)%2FNOTES%20-%20%E0%A4%95%E0%A5%81%E0%A4%A4%E0%A5%81%E0%A4%AC%E0%A4%A8%20%E0%A4%AE%E0%A5%83%E0%A4%97%E0%A4%BE%E0%A4%B5%E0%A4%A4%E0%A5%80.pdf?alt=media&token=f48ed0be-20fa-4fe1-b93e-0505ec37c239");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - मृगावती: श्रृंगार खंड एवं दर्शन खंड
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Kavita%20(Aadikal%20aev%20Bhaktikaleen%20Kaavy)%2FNOTES%20-%20%E0%A4%AE%E0%A5%83%E0%A4%97%E0%A4%BE%E0%A4%B5%E0%A4%A4%E0%A5%80%20%E0%A4%B6%E0%A5%8D%E0%A4%B0%E0%A5%83%E0%A4%82%E0%A4%97%E0%A4%BE%E0%A4%B0%20%E0%A4%96%E0%A4%82%E0%A4%A1%20%E0%A4%8F%E0%A4%B5%E0%A4%82%20%E0%A4%A6%E0%A4%B0%E0%A5%8D%E0%A4%B6%E0%A4%A8%20%E0%A4%96%E0%A4%82%E0%A4%A1.pdf?alt=media&token=5513e5e5-87a2-4638-939a-9335bba318e8");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //NOTES - कबीर का रहस्यवाद
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Kavita%20(Aadikal%20aev%20Bhaktikaleen%20Kaavy)%2FNOTES%20-%20%E0%A4%95%E0%A4%AC%E0%A5%80%E0%A4%B0%20%E0%A4%95%E0%A4%BE%20%E0%A4%B0%E0%A4%B9%E0%A4%B8%E0%A5%8D%E0%A4%AF%E0%A4%B5%E0%A4%BE%E0%A4%A6.pdf?alt=media&token=4f3b9a48-405d-4298-a504-9020b20869a4");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //NOTES - कबीर की सामाजिक देन
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Kavita%20(Aadikal%20aev%20Bhaktikaleen%20Kaavy)%2FNOTES%20-%20%E0%A4%95%E0%A4%AC%E0%A5%80%E0%A4%B0%20%E0%A4%95%E0%A5%80%20%E0%A4%B8%E0%A4%BE%E0%A4%AE%E0%A4%BE%E0%A4%9C%E0%A4%BF%E0%A4%95%20%E0%A4%A6%E0%A5%87%E0%A4%A8.pdf?alt=media&token=43269a5f-c3d8-4333-b021-0997ba65cefd");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //NOTES - सूरदास
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Kavita%20(Aadikal%20aev%20Bhaktikaleen%20Kaavy)%2FNOTES%20-%20%E0%A4%B8%E0%A5%82%E0%A4%B0%E0%A4%A6%E0%A4%BE%E0%A4%B8.pdf?alt=media&token=7bab5878-f70f-48bc-aca5-986690c790b3");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                            case 6:                             //NOTES - मीराबाई का रचना संसार
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Kavita%20(Aadikal%20aev%20Bhaktikaleen%20Kaavy)%2FNOTES%20-%20%E0%A4%AE%E0%A5%80%E0%A4%B0%E0%A4%BE%E0%A4%AC%E0%A4%BE%E0%A4%88%20%E0%A4%95%E0%A4%BE%20%E0%A4%B0%E0%A4%9A%E0%A4%A8%E0%A4%BE%20%E0%A4%B8%E0%A4%82%E0%A4%B8%E0%A4%BE%E0%A4%B0.pdf?alt=media&token=e7ff1a84-e1a3-414e-8d06-b54ea51604c8");
                                DownloadManager.Request request6 = new DownloadManager.Request(uri6);
                                request6.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference6 = downloadManager6.enqueue(request6);
                                break;
                            case 7:                             //NOTES - मीरांबाई
                                DownloadManager downloadManager7;
                                downloadManager7 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri7 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Kavita%20(Aadikal%20aev%20Bhaktikaleen%20Kaavy)%2FNOTES%20-%20%E0%A4%AE%E0%A5%80%E0%A4%B0%E0%A4%BE%E0%A4%82%E0%A4%AC%E0%A4%BE%E0%A4%88.pdf?alt=media&token=9f57e7b6-2b01-44a7-aa11-69a95f05686b");
                                DownloadManager.Request request7 = new DownloadManager.Request(uri7);
                                request7.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference7 = downloadManager7.enqueue(request7);
                                break;
                            case 8:                             //NOTES - तुलसीदास और उनकी कवितावली
                                DownloadManager downloadManager8;
                                downloadManager8 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri8 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Kavita%20(Aadikal%20aev%20Bhaktikaleen%20Kaavy)%2FNOTES%20-%20%E0%A4%A4%E0%A5%81%E0%A4%B2%E0%A4%B8%E0%A5%80%E0%A4%A6%E0%A4%BE%E0%A4%B8%20%E0%A4%94%E0%A4%B0%20%E0%A4%89%E0%A4%A8%E0%A4%95%E0%A5%80%20%E0%A4%95%E0%A4%B5%E0%A4%BF%E0%A4%A4%E0%A4%BE%E0%A4%B5%E0%A4%B2%E0%A5%80.pdf?alt=media&token=1f36af93-f21e-4c05-86c7-f37b3d7c54ba");
                                DownloadManager.Request request8 = new DownloadManager.Request(uri8);
                                request8.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference8 = downloadManager8.enqueue(request8);
                                break;
                            case 9:                             //NOTES - गोस्वामी तुलसीदास
                                DownloadManager downloadManager9;
                                downloadManager9 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri9 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Kavita%20(Aadikal%20aev%20Bhaktikaleen%20Kaavy)%2FNOTES%20-%20%E0%A4%97%E0%A5%8B%E0%A4%B8%E0%A5%8D%E0%A4%B5%E0%A4%BE%E0%A4%AE%E0%A5%80%20%E0%A4%A4%E0%A5%81%E0%A4%B2%E0%A4%B8%E0%A5%80%E0%A4%A6%E0%A4%BE%E0%A4%B8.pdf?alt=media&token=36e0dc5e-ff1a-4bca-a8ea-ba54837522a4");
                                DownloadManager.Request request9 = new DownloadManager.Request(uri9);
                                request9.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference9 = downloadManager9.enqueue(request9);
                                break;
                            case 10:                             //NOTES - कबीर की भाषा
                                DownloadManager downloadManager10;
                                downloadManager10 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri10 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Kavita%20(Aadikal%20aev%20Bhaktikaleen%20Kaavy)%2FNOTES%20-%20%E0%A4%95%E0%A4%AC%E0%A5%80%E0%A4%B0%20%E0%A4%95%E0%A5%80%20%E0%A4%AD%E0%A4%BE%E0%A4%B7%E0%A4%BE.pdf?alt=media&token=c9f5685f-1562-4679-9e08-24efac678630");
                                DownloadManager.Request request10= new DownloadManager.Request(uri10);
                                request10.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference10 = downloadManager10.enqueue(request10);
                                break;
                            case 11:                             //NOTES - HANDWRITTEN
                                DownloadManager downloadManager11;
                                downloadManager11 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri11 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Kavita%20(Aadikal%20aev%20Bhaktikaleen%20Kaavy)%2FNOTES%20-%20HANDWRITTEN.pdf?alt=media&token=7f733a5a-78fe-486c-a2fe-2bd48f674d87");
                                DownloadManager.Request request11 = new DownloadManager.Request(uri11);
                                request11.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference11 = downloadManager11.enqueue(request11);
                                break;
                            case 12:                             //QP
                                DownloadManager downloadManager12;
                                downloadManager12 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri12 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Kavita%20(Aadikal%20aev%20Bhaktikaleen%20Kaavy)%2FQP.pdf?alt=media&token=db509173-29a1-4304-85fe-ffbfad7d2466");
                                DownloadManager.Request request12 = new DownloadManager.Request(uri12);
                                request12.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference12 = downloadManager12.enqueue(request12);
                                break;
                            case 13:                             //GL
                                DownloadManager downloadManager13;
                                downloadManager13 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri13 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Kavita%20(Aadikal%20aev%20Bhaktikaleen%20Kaavy)%2FGL.pdf?alt=media&token=6045350f-2944-4bd9-acc6-9edd76476924");
                                DownloadManager.Request request13 = new DownloadManager.Request(uri13);
                                request13.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference13 = downloadManager13.enqueue(request13);
                                break;
                            case 14:                             //RB
                                DownloadManager downloadManager14;
                                downloadManager14 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri14 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%201%2FHindi%20Kavita%20(Aadikal%20aev%20Bhaktikaleen%20Kaavy)%2FRB.pdf?alt=media&token=cb0f8b66-4237-4ad4-80d6-2594d67be15c");
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
        item1.setName("Hindi Bhasha aur Uski Lipi ka Itihas");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("Hindi Kavita (Aadikal aev Bhaktikaleen Kaavy)");
        listDataHeader.add(item2);

        //Hindi Bhasha aur Uski Lipi ka Itihas
        List<String> heading1 = new ArrayList<>();
        heading1.add("Question Paper");
        heading1.add("Guidelines");
        heading1.add("Recommended Books");

        //Hindi Kavita (Aadikal aev Bhaktikaleen Kaavy)
        List<String> heading2 = new ArrayList<String>();
        heading2.add("NOTES - खड़ी बोली और उर्दू के महान् कवि  खुसरो"); //NOTES - खड़ी बोली और उर्दू के महान् कवि  खुसरो
        heading2.add("NOTES - कुतुबन: मृगावती");  //NOTES - कुतुबन: मृगावती
        heading2.add("NOTES - मृगावती: श्रृंगार खंड एवं दर्शन खंड"); //NOTES - मृगावती: श्रृंगार खंड एवं दर्शन खंड
        heading2.add("NOTES - कबीर का रहस्यवाद"); //NOTES - कबीर का रहस्यवाद
        heading2.add("NOTES - कबीर की सामाजिक देन"); //NOTES - कबीर की सामाजिक देन
        heading2.add("NOTES - सूरदास");  //NOTES - सूरदास
        heading2.add("NOTES - मीराबाई का रचना संसार"); //NOTES - मीराबाई का रचना संसार
        heading2.add("NOTES - मीरांबाई"); //NOTES - मीरांबाई
        heading2.add("NOTES - तुलसीदास और उनकी कवितावली"); //NOTES - तुलसीदास और उनकी कवितावली
        heading2.add("NOTES - गोस्वामी तुलसीदास"); //NOTES - गोस्वामी तुलसीदास
        heading2.add("NOTES - कबीर की भाषा"); //NOTES - कबीर की भाषा
        heading2.add("NOTES - HANDWRITTEN"); //NOTES - HANDWRITTEN
        heading2.add("Question Paper");
        heading2.add("Guidelines");
        heading2.add("Recommended Books");


        listDataChild.put(listDataHeader.get(0), heading1);             //Hindi Bhasha aur Uski Lipi ka Itihas
        listDataChild.put(listDataHeader.get(1), heading2);             //Hindi Kavita (Aadikal aev Bhaktikaleen Kaavy)
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
