package v41;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
import l7.x1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public String a;
    public String b;
    public ArrayList c;
    public String d;
    public String e;
    public String f;
    public String g;
    public x1 h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, x1 x1Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = x1Var;
    }

    public static a a(Context context, v vVar, String str, String str2, ArrayList arrayList, x1 x1Var) {
        String packageName = context.getPackageName();
        String d = vVar.d();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String l = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, arrayList, d, packageName, l, str3, x1Var);
    }


    public a(Object... a) {
    }
    public Object e(Object p1) { return null; }
    public Object f(Object p1) { return null; }
}
