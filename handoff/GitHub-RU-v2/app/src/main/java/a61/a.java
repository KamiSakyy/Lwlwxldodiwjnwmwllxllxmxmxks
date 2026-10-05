package a61;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final c0 d;
    public final ArrayList e;

    public a(String str, String str2, String str3, c0 c0Var, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        k71.k.g(str2, "versionName");
        k71.k.g(str3, "appBuildVersion");
        k71.k.g(str4, "deviceManufacturer");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c0Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.a.equals(aVar.a) || !k71.k.b(this.b, aVar.b) || !k71.k.b(this.c, aVar.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return k71.k.b(str, str) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), Build.MANUFACTURER, 31)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
