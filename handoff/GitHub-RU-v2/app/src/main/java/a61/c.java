package a61;

import android.os.Build;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements i51.c {
    public static final c a = new c();
    public static final i51.b b = i51.b.a("packageName");
    public static final i51.b c = i51.b.a("versionName");
    public static final i51.b d = i51.b.a("appBuildVersion");
    public static final i51.b e = i51.b.a("deviceManufacturer");
    public static final i51.b f = i51.b.a("currentProcessDetails");
    public static final i51.b g = i51.b.a("appProcessDetails");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        i51.d dVar = (i51.d) obj2;
        dVar.a(b, aVar.a);
        dVar.a(c, aVar.b);
        dVar.a(d, aVar.c);
        dVar.a(e, Build.MANUFACTURER);
        dVar.a(f, aVar.d);
        dVar.a(g, aVar.e);
    }
    public Object p() { return null; }
    public Object r() { return null; }
    public static final Object v = null;
}
