package s41;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import x61.m;
import x61.n;
import x61.r;
import y41.c2;
import y41.y0;
import y41.z0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public static final c a = new c();

    public static ArrayList a(Context context) {
        k.g(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = r.r;
        }
        ArrayList S = m.S(runningAppProcesses);
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
        ArrayList arrayList2 = new ArrayList(n.F(arrayList, 10));
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            y0 y0Var = new y0();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            y0Var.a = str2;
            y0Var.b = runningAppProcessInfo.pid;
            byte b = (byte) (y0Var.e | 1);
            y0Var.c = runningAppProcessInfo.importance;
            y0Var.e = (byte) (b | 2);
            y0Var.d = k.b(str2, str);
            y0Var.e = (byte) (y0Var.e | 4);
            arrayList2.add(y0Var.a());
        }
        return arrayList2;
    }

    public final c2 b(Context context) {
        Object obj;
        String str;
        k.g(context, "context");
        int myPid = Process.myPid();
        ArrayList a2 = a(context);
        int size = a2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = a2.get(i);
            i++;
            if (((z0) ((c2) obj)).b == myPid) {
                break;
            }
        }
        c2 c2Var = (c2) obj;
        if (c2Var != null) {
            return c2Var;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 33) {
            str = Process.myProcessName();
            k.f(str, "{\n      Process.myProcessName()\n    }");
        } else if (i2 < 28 || (str = Application.getProcessName()) == null) {
            str = "";
        }
        k.g(str, "processName");
        y0 y0Var = new y0();
        y0Var.a = str;
        y0Var.b = myPid;
        byte b = (byte) (y0Var.e | 1);
        y0Var.c = 0;
        y0Var.d = false;
        y0Var.e = (byte) (((byte) (b | 2)) | 4);
        return y0Var.a();
    }
}
