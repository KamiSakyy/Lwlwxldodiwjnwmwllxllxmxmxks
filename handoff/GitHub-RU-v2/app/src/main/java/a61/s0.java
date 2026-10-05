package a61;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.measurement.internal.x3;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s0 {
    public static final s0 a = new s0();
    public static final x3 b;

    static {
        k51.d dVar = new k51.d();
        dVar.a(r0.class, g.a);
        dVar.a(z0.class, h.a);
        dVar.a(k.class, e.a);
        dVar.a(b.class, d.a);
        dVar.a(a.class, c.a);
        dVar.a(c0.class, f.a);
        dVar.d = true;
        b = new x3(29, dVar);
    }

    public static b a(k41.g gVar) {
        Object obj;
        gVar.a();
        Context context = gVar.a;
        k71.k.f(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        gVar.a();
        String str = gVar.c.b;
        k71.k.f(str, "firebaseApp.options.applicationId");
        k71.k.f(Build.MODEL, "MODEL");
        k71.k.f(Build.VERSION.RELEASE, "RELEASE");
        k71.k.f(packageName, "packageName");
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = valueOf;
        }
        k71.k.f(Build.MANUFACTURER, "MANUFACTURER");
        gVar.a();
        int myPid = Process.myPid();
        ArrayList a2 = d0.a(context);
        int size = a2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = a2.get(i);
            i++;
            if (((c0) obj).b == myPid) {
                break;
            }
        }
        c0 c0Var = (c0) obj;
        if (c0Var == null) {
            c0Var = new c0(d0.b(), myPid, 0, false);
        }
        gVar.a();
        return new b(str, new a(packageName, str2, valueOf, c0Var, d0.a(context)));
    }
}
