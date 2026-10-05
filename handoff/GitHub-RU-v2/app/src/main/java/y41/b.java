package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements i51.c {
    public static final b a = new b();
    public static final i51.b b = i51.b.a("pid");
    public static final i51.b c = i51.b.a("processName");
    public static final i51.b d = i51.b.a("reasonCode");
    public static final i51.b e = i51.b.a("importance");
    public static final i51.b f = i51.b.a("pss");
    public static final i51.b g = i51.b.a("rss");
    public static final i51.b h = i51.b.a("timestamp");
    public static final i51.b i = i51.b.a("traceFile");
    public static final i51.b j = i51.b.a("buildIdMappingForArch");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        i51.d dVar = (i51.d) obj2;
        d0 d0Var = (d0) ((p1) obj);
        dVar.e(b, d0Var.a);
        dVar.a(c, d0Var.b);
        dVar.e(d, d0Var.c);
        dVar.e(e, d0Var.d);
        dVar.d(f, d0Var.e);
        dVar.d(g, d0Var.f);
        dVar.d(h, d0Var.g);
        dVar.a(i, d0Var.h);
        dVar.a(j, d0Var.i);
    }
}
