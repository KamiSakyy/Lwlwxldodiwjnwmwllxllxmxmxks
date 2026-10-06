package a61;

import android.os.Build;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public final String a;
    public final a b;

    public b(String str, a aVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        k71.k.g(str, "appId");
        k71.k.g(str2, "deviceModel");
        k71.k.g(str3, "osVersion");
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!k71.k.b(this.a, bVar.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!k71.k.b(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return k71.k.b(str2, str2) && this.b.equals(bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((b0.s.hashCode() + com.github.rudroid.copilot.h1.i((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 47595001) * 31, Build.VERSION.RELEASE, 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=2.1.2, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + b0.s + ", androidAppInfo=" + this.b + ')';
    }
    public Object c = null;
    public Object e = null;
}
