package v41;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
import l7.x1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final x1 h;

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

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class x1<T1,T2,T3,T4> {
        public x1() {
        }
    }
}
