package l11;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements i51.c {
    public static final j a = new j();
    public static final i51.b b = i51.b.a("requestTimeMs");
    public static final i51.b c = i51.b.a("requestUptimeMs");
    public static final i51.b d = i51.b.a("clientInfo");
    public static final i51.b e = i51.b.a("logSource");
    public static final i51.b f = i51.b.a("logSourceName");
    public static final i51.b g = i51.b.a("logEvent");
    public static final i51.b h = i51.b.a("qosTier");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        i51.d dVar = (i51.d) obj2;
        t tVar = (t) ((f0) obj);
        dVar.d(b, tVar.a);
        dVar.d(c, tVar.b);
        dVar.a(d, tVar.c);
        dVar.a(e, tVar.d);
        dVar.a(f, tVar.e);
        dVar.a(g, tVar.f);
        dVar.a(h, j0.r);
    }
}
