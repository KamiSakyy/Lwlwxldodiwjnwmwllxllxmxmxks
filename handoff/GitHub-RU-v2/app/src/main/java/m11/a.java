package m11;

import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements i51.c {
    public static final a a = new a();
    public static final i51.b b = new i51.b("window", f4Shadow.x(f4Shadow.w(l51.e.class, new l51.a(1))));
    public static final i51.b c = new i51.b("logSourceMetrics", f4Shadow.x(f4Shadow.w(l51.e.class, new l51.a(2))));
    public static final i51.b d = new i51.b("globalMetrics", f4Shadow.x(f4Shadow.w(l51.e.class, new l51.a(3))));
    public static final i51.b e = new i51.b("appNamespace", f4Shadow.x(f4Shadow.w(l51.e.class, new l51.a(4))));

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        p11.a aVar = (p11.a) obj;
        i51.d dVar = (i51.d) obj2;
        dVar.a(b, aVar.a);
        dVar.a(c, aVar.b);
        dVar.a(d, aVar.c);
        dVar.a(e, aVar.d);
    }
}
