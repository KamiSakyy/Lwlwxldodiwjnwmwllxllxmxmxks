package a61;

import android.os.Build;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements i51.c {
    public static final d a = new d();
    public static final i51.b b = i51.b.a("appId");
    public static final i51.b c = i51.b.a("deviceModel");
    public static final i51.b d = i51.b.a("sessionSdkVersion");
    public static final i51.b e = i51.b.a("osVersion");
    public static final i51.b f = i51.b.a("logEnvironment");
    public static final i51.b g = i51.b.a("androidAppInfo");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        i51.d dVar = (i51.d) obj2;
        dVar.a(b, bVar.a);
        dVar.a(c, Build.MODEL);
        dVar.a(d, "2.1.2");
        dVar.a(e, Build.VERSION.RELEASE);
        dVar.a(f, b0.s);
        dVar.a(g, bVar.b);
    }
}
