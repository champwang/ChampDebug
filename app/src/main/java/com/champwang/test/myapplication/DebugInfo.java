package com.champwang.test.myapplication;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DebugInfo extends AppCompatActivity {

    private static final String TAG = "DebugChamp";

    private ActivityManager activityManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);
        activityManager = (ActivityManager)getSystemService(Context.ACTIVITY_SERVICE);

        ListView list1 = (ListView) findViewById(R.id.list1);
        String [] arr1 = {"111", "222", "3333333", "44444444444444"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>
                (this, R.layout.array_item,arr1);

        list1.setAdapter(adapter1);


        ListView list2 = (ListView) findViewById(R.id.list2);
        String [] arr2 = {"111", "222", "3333333", "44444444444444"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>
                (this, R.layout.array_item,arr2);

        list2.setAdapter(adapter2);
//        new Timer().schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("timer test1111++++++++++++++++++++++++");
//
//            }
//        },0, 2000);

    }

    @Override
    protected void onStart() {
        super.onStart();

        displayBriefMemory();
        getRunningAppProcessInfo();

    }

    private void displayBriefMemory() {

        ActivityManager manager = activityManager;
        int heapSize = manager.getMemoryClass();
        //普通应用的内存限制
        Log.e(TAG, "dalvik.vm.heapgrowthlimit ===> heapSize:" + heapSize + " Mb");


        ActivityManager.MemoryInfo info = new ActivityManager.MemoryInfo();

        activityManager.getMemoryInfo(info);
        //availMem:表示系统剩余内存
        Log.i(TAG,"系统剩余内存:" + (info.availMem >> 10) + " Kb");
        Log.i(TAG,"系统剩余内存:" + (info.availMem >> 10) /1024 + " Mb");

        //lowMemory：它是boolean值，表示系统是否处于低内存运行
        Log.i(TAG, "系统是否处于低内存运行：" + info.lowMemory);

        //threshold：它表示当系统剩余内存低于好多时就看成低内存运行
        Log.i(TAG,"当系统剩余内存低于" + info.threshold + "时就看成低内存运行");
        Log.i(TAG,"当系统剩余内存低于" + info.threshold /(1027*1024) + " Mb" + "时就看成低内存运行");

        Log.i(TAG,"totalMem:" + info.totalMem);
        Log.i(TAG,"totalMem:" + info.totalMem /(1024 *1024 *1024) + "GB");
    }

    // 获得系统进程信息
    private void getRunningAppProcessInfo() {
        ActivityManager mActivityManager = activityManager;

        // 通过调用ActivityManager的getRunningAppProcesses()方法获得系统里所有正在运行的进程
        List<ActivityManager.RunningAppProcessInfo> appProcessList = mActivityManager
                .getRunningAppProcesses();

        for (ActivityManager.RunningAppProcessInfo appProcessInfo : appProcessList) {
            // 进程ID号
            int pid = appProcessInfo.pid;

            // 用户ID 类似于Linux的权限不同，ID也就不同 比如 root等
            int uid = appProcessInfo.uid;

            // 进程名，默认是包名或者由属性android：process=""指定
            String processName = appProcessInfo.processName;

            // 获得该进程占用的内存
            int[] myMempid = new int[] { pid };

            // 此MemoryInfo位于android.os.Debug.MemoryInfo包中，用来统计进程的内存信息
            Debug.MemoryInfo[] memoryInfo = mActivityManager.getProcessMemoryInfo(myMempid);

            // 获取进程占内存用信息 kb单位
            int memSize = memoryInfo[0].dalvikPrivateDirty;

            Log.i(TAG, "processName: " + processName
                    + " pid: " + pid
                    + " uid:" + uid
                    + " memorySize is -->" + memSize + "kb");

            // 获得每个进程里运行的应用程序(包),即每个应用程序的包名
            String[] packageList = appProcessInfo.pkgList;
            Log.i(TAG, "process id is " + pid
                    + "has packageList.length:" + packageList.length);

            for (String pkg : packageList) {
                Log.i(TAG, "packageName " + pkg
                        + " in process id is -->"+ pid);
            }
        }
    }


}
