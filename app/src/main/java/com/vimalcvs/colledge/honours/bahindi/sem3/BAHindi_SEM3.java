package com.vimalcvs.colledge.honours.bahindi.sem3;

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

public class BAHindi_SEM3 extends AppCompatActivity {


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
                    case 0:                                 //Hindi Kahani
                        switch (childPosition) {
                            case 0:                             //NOTES - उसने कहा था: चंद्रधर शर्मा गुलेरी
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Kahani%2FNOTES%20-%20%E0%A4%89%E0%A4%B8%E0%A4%A8%E0%A5%87%20%E0%A4%95%E0%A4%B9%E0%A4%BE%20%E0%A4%A5%E0%A4%BE%20%E0%A4%AB%E0%A4%BE%E0%A4%87%E0%A4%A8%E0%A4%B2.pdf?alt=media&token=0f82cd0a-fdb3-435e-be31-6a0adf5fcb41");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //NOTES - पूस की रात: प्रेमचंद
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Kahani%2FNOTES%20-%20%E0%A4%AA%E0%A5%82%E0%A4%B8%20%E0%A4%95%E0%A5%80%20%E0%A4%B0%E0%A4%BE%E0%A4%A4%20%E0%A4%AA%E0%A5%8D%E0%A4%B0%E0%A5%87%E0%A4%AE%E0%A4%9A%E0%A4%82%E0%A4%A6.pdf?alt=media&token=e6ae422a-b514-45d2-a911-b190366072f3");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //NOTES - आकाशदीप: जयशंकर प्रसाद धर्मेन्द्र प्रताप सिंह
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Kahani%2FNOTES%20-%20%E0%A4%86%E0%A4%95%E0%A4%BE%E0%A4%B6%E0%A4%A6%E0%A5%80%E0%A4%AA.pdf?alt=media&token=da12f06a-d87a-4516-91c5-688864e4f3d8");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
                                break;
                            case 3:                             //NOTES - हार की जीत: सुदर्शन
                                DownloadManager downloadManager3;
                                downloadManager3 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri3 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Kahani%2FNOTES%20-%20%E0%A4%B8%E0%A5%81%E0%A4%A6%E0%A4%B0%E0%A5%8D%E0%A4%B6%E0%A4%A8%20%E0%A4%B9%E0%A4%BE%E0%A4%B0%20%E0%A4%95%E0%A5%80%20%E0%A4%9C%E0%A5%80%E0%A4%A4%20%E0%A4%AB%E0%A4%BE%E0%A4%88%E0%A4%A8%E0%A4%B2.pdf?alt=media&token=9cae3b7d-2364-4aed-8964-062ed454af26");
                                DownloadManager.Request request3 = new DownloadManager.Request(uri3);
                                request3.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference3 = downloadManager3.enqueue(request3);
                                break;
                            case 4:                             //NOTES - तीसरी कसम: फणीश्वर नाथ रेणु
                                DownloadManager downloadManager4;
                                downloadManager4 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri4 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Kahani%2FNOTES%20-%20%E0%A4%A4%E0%A5%80%E0%A4%B8%E0%A4%B0%E0%A5%80%20%E0%A4%95%E0%A4%B8%E0%A4%AE%20%E0%A4%B8%E0%A5%8D%E0%A4%B5%E0%A4%BE%E0%A4%A4%E0%A4%BF%20%E0%A4%B8%E0%A5%8B%E0%A4%A8%E0%A4%B2.pdf?alt=media&token=63d5ad7b-e2f4-4fa0-8c14-f2b0fdade5dc");
                                DownloadManager.Request request4 = new DownloadManager.Request(uri4);
                                request4.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference4 = downloadManager4.enqueue(request4);
                                break;
                            case 5:                             //NOTES - मिस पाल: मोहन राकेश
                                DownloadManager downloadManager5;
                                downloadManager5 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri5 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Kahani%2FNOTES%20-%20%E0%A4%AE%E0%A4%BF%E0%A4%B8%20%E0%A4%AA%E0%A4%BE%E0%A4%B2%20%E0%A4%A1%E0%A4%BE%E0%A5%A6%20%E0%A4%85%E0%A4%A8%E0%A5%81%E0%A4%B0%E0%A4%BE%E0%A4%A7%E0%A4%BE%20%E0%A4%97%E0%A5%81%E0%A4%AA%E0%A5%8D%E0%A4%A4%E0%A4%BE.pdf?alt=media&token=158cfd26-334c-4072-ba06-ba47e370f815");
                                DownloadManager.Request request5 = new DownloadManager.Request(uri5);
                                request5.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference5 = downloadManager5.enqueue(request5);
                                break;
                            case 6:                             //NOTES -परिंदे: निर्मल वर्मा
                                DownloadManager downloadManager6;
                                downloadManager6 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri6 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Kahani%2FNOTES%20-%20%E0%A4%A8%E0%A4%BF%E0%A4%B0%E0%A5%8D%E0%A4%AE%E0%A4%B2%20%E0%A4%B5%E0%A4%B0%E0%A5%8D%E0%A4%AE%E0%A4%BE%20%E0%A4%AA%E0%A4%B0%E0%A4%BF%E0%A4%82%E0%A4%A6%E0%A5%87%20%E0%A4%89%E0%A4%AE%E0%A4%BE%E0%A4%B6%E0%A4%82%E0%A4%95%E0%A4%B0%20%E0%A4%AE%E0%A4%BF%E0%A4%B6%E0%A5%8D%E0%A4%B0.pdf?alt=media&token=26e5c1db-859f-4421-b824-6fe895198ade");
                                DownloadManager.Request request6 = new DownloadManager.Request(uri6);
                                request6.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference6 = downloadManager6.enqueue(request6);
                                break;
                            case 7:                             //NOTES - दोपहर का भोजन: अमरकांत
                                DownloadManager downloadManager7;
                                downloadManager7 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri7 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Kahani%2FNOTES%20-%20%E0%A4%A6%E0%A5%8B%E0%A4%AA%E0%A4%B9%E0%A4%B0%20%E0%A4%95%E0%A4%BE%20%E0%A4%AD%E0%A5%8B%E0%A4%9C%E0%A4%A8%20%E0%A4%85%E0%A4%AE%E0%A4%B0%E0%A4%95%E0%A4%BE%E0%A4%82%E0%A4%A4.pdf?alt=media&token=5f50f388-76a2-44fd-afe0-3bf4dd7ab325");
                                DownloadManager.Request request7 = new DownloadManager.Request(uri7);
                                request7.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference7 = downloadManager7.enqueue(request7);
                                break;
                            case 8:                             //NOTES - सिक्का बदल गया: कृष्णा सोबती
                                DownloadManager downloadManager8;
                                downloadManager8 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri8 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Kahani%2FNOTES%20-%20%E0%A4%95%E0%A5%83%E0%A4%B7%E0%A5%8D%E0%A4%A3%E0%A4%BE%20%E0%A4%B8%E0%A5%8B%E0%A4%AC%E0%A4%A4%E0%A5%80.pdf?alt=media&token=bce9fb3f-b09b-4f13-a7af-ca32f538ab08");
                                DownloadManager.Request request8 = new DownloadManager.Request(uri8);
                                request8.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference8 = downloadManager8.enqueue(request8);
                                break;
                            case 9:                             //NOTES - जंगल जातकम: काशीनाथ सिंह
                                DownloadManager downloadManager9;
                                downloadManager9 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri9 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Kahani%2FNOTES%20-%20%E0%A4%9C%E0%A4%82%E0%A4%97%E0%A4%B2%20%E0%A4%9C%E0%A4%BE%E0%A4%A4%E0%A4%95%E0%A4%AE%20%E0%A4%AB%E0%A4%BE%E0%A4%88%E0%A4%A8%E0%A4%B2%20%E0%A4%AE%E0%A4%BF%E0%A4%B9%E0%A4%BF%E0%A4%B0%20%E0%A4%AA%E0%A4%82%E0%A4%A1%E0%A5%8D%E0%A4%AF%E0%A4%BE.pdf?alt=media&token=f68ef5fa-270b-41ad-8be5-f348424fe020");
                                DownloadManager.Request request9 = new DownloadManager.Request(uri9);
                                request9.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference9 = downloadManager9.enqueue(request9);
                                break;
                            case 10:                             //NOTES - पिताः ज्ञानरंजन
                                DownloadManager downloadManager10;
                                downloadManager10 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri10 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Kahani%2FNOTES%20-%20%E0%A4%AA%E0%A4%BF%E0%A4%A4%E0%A4%BE%E0%A4%83%20%E0%A4%9C%E0%A5%8D%E0%A4%9E%E0%A4%BE%E0%A4%A8%E0%A4%B0%E0%A4%82%E0%A4%9C%E0%A4%A8.pdf?alt=media&token=9ea13a6f-70f8-438f-8035-f8cdd8186453");
                                DownloadManager.Request request10= new DownloadManager.Request(uri10);
                                request10.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference10 = downloadManager10.enqueue(request10);
                                break;
                            case 11:                             //GL
                                DownloadManager downloadManager11;
                                downloadManager11 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri11 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Kahani%2FGL.pdf?alt=media&token=71f62ca7-c104-4be2-8f7f-76b22f487f33");
                                DownloadManager.Request request11 = new DownloadManager.Request(uri11);
                                request11.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference11 = downloadManager11.enqueue(request11);
                                break;
                            case 12:                             //RB
                                DownloadManager downloadManager12;
                                downloadManager12 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri12 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Kahani%2FRB.pdf?alt=media&token=a79792c7-a89e-45df-b69d-81a1b2fb61f5");
                                DownloadManager.Request request12 = new DownloadManager.Request(uri12);
                                request12.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference12 = downloadManager12.enqueue(request12);
                                break;
                        }
                        break;
                    case 1:                                 //Hindi Kavita (Aadhunik kal Chayawaad tak)
                        switch (childPosition) {
                            case 0:                             //GL
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Kavita%20(Aadhunik%20kal%20Chayawaad%20tak)%2FGL.pdf?alt=media&token=946a5572-1c5f-4a77-9f63-b876fdba6b27");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //RB
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Kavita%20(Aadhunik%20kal%20Chayawaad%20tak)%2FRB.pdf?alt=media&token=b1c1ea1c-d98a-4802-b756-f676a5a6befa");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                        }
                        break;
                    case 2:                                 //Hindi Sahitya ka Itihas (Aadhunik kal)
                        switch (childPosition) {
                            case 0:                             //NOTES
                                DownloadManager downloadManager0;
                                downloadManager0 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri0 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Sahitya%20ka%20Itihas%20(Aadhunik%20kal)%2FNOTES%20-%20Hindi%20Sahitya%20Ka%20Itihaas.pdf?alt=media&token=05d99048-0357-4473-b176-ffc8e6724de5");
                                DownloadManager.Request request0 = new DownloadManager.Request(uri0);
                                request0.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference0 = downloadManager0.enqueue(request0);
                                break;
                            case 1:                             //GL
                                DownloadManager downloadManager1;
                                downloadManager1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Sahitya%20ka%20Itihas%20(Aadhunik%20kal)%2FGL.pdf?alt=media&token=6bfdcfab-ea6a-4447-acaa-593c68517b25");
                                DownloadManager.Request request1 = new DownloadManager.Request(uri1);
                                request1.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference1 = downloadManager1.enqueue(request1);
                                break;
                            case 2:                             //RB
                                DownloadManager downloadManager2;
                                downloadManager2 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri2 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/colledge-117d3.appspot.com/o/HINDI%2FSEM%203%2FHindi%20Sahitya%20ka%20Itihas%20(Aadhunik%20kal)%2FRB.pdf?alt=media&token=09082b13-b2b4-4f24-aa24-2a55d73389d0");
                                DownloadManager.Request request2 = new DownloadManager.Request(uri2);
                                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference2 = downloadManager2.enqueue(request2);
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
        item1.setName("Hindi Kahani");
        listDataHeader.add(item1);

        ExpandedMenuModel item2 = new ExpandedMenuModel();
        item2.setName("Hindi Kavita (Aadhunik kal Chayawaad tak)");
        listDataHeader.add(item2);

        ExpandedMenuModel item3 = new ExpandedMenuModel();
        item3.setName("Hindi Sahitya ka Itihas (Aadhunik kal)");
        listDataHeader.add(item3);


        //Hindi Kahani
        List<String> heading1 = new ArrayList<>();
        heading1.add("NOTES - उसने कहा था: चंद्रधर शर्मा गुलेरी  "); //NOTES - उसने कहा था: चंद्रधर शर्मा गुलेरी
        heading1.add("NOTES - पूस की रात: प्रेमचंद"); //NOTES - पूस की रात: प्रेमचंद
        heading1.add("NOTES - आकाशदीप: जयशंकर प्रसाद धर्मेन्द्र प्रताप सिंह"); //NOTES - आकाशदीप: जयशंकर प्रसाद धर्मेन्द्र प्रताप सिंह
        heading1.add("NOTES - हार की जीत: सुदर्शन"); //NOTES - हार की जीत: सुदर्शन
        heading1.add("NOTES - तीसरी कसम: फणीश्वर नाथ रेणु"); //NOTES - तीसरी कसम: फणीश्वर नाथ रेणु
        heading1.add("NOTES - मिस पाल: मोहन राकेश"); //NOTES - मिस पाल: मोहन राकेश
        heading1.add("NOTES -परिंदे: निर्मल वर्मा"); //NOTES -परिंदे: निर्मल वर्मा
        heading1.add("NOTES - दोपहर का भोजन: अमरकांत"); //NOTES - दोपहर का भोजन: अमरकांत
        heading1.add("NOTES - सिक्का बदल गया: कृष्णा सोबती"); //NOTES - सिक्का बदल गया: कृष्णा सोबती
        heading1.add("NOTES - जंगल जातकम: काशीनाथ सिंह"); //NOTES - जंगल जातकम: काशीनाथ सिंह
        heading1.add("NOTES - पिताः ज्ञानरंजन"); //NOTES - पिताः ज्ञानरंजन
        heading1.add("Guidelines");
        heading1.add("Recommended Books");

        //Hindi Kavita (Aadhunik kal Chayawaad tak)
        List<String> heading2 = new ArrayList<String>();
        heading2.add("Guidelines");
        heading2.add("Recommended Books");

        //Hindi Sahitya ka Itihas (Aadhunik kal)
        List<String> heading3 = new ArrayList<String>();
        heading3.add("Notes");
        heading3.add("Guidelines");
        heading3.add("Recommended Books");


        listDataChild.put(listDataHeader.get(0), heading1);             //Hindi Kahani
        listDataChild.put(listDataHeader.get(1), heading2);             //Hindi Kavita (Aadhunik kal Chayawaad tak)
        listDataChild.put(listDataHeader.get(2), heading3);             //Hindi Sahitya ka Itihas (Aadhunik kal)

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
    }

}
