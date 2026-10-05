package a61;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d0 {
    public static ArrayList a(Context context) {
        k71.k.g(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = x61.r.r;
        }
        ArrayList S = x61.m.S(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        int size = S.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = S.get(i3);
            i3++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            String str2 = runningAppProcessInfo.processName;
            k71.k.f(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new c0(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, k71.k.b(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static String b() {
        String processName;
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            String myProcessName = Process.myProcessName();
            k71.k.f(myProcessName, "myProcessName()");
            return myProcessName;
        }
        if (i >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String a = g21.c.a();
        return a != null ? a : "";
    }
}
