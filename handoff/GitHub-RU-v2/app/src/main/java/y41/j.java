package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements i51.c {
    public static final j a = new j();
    public static final i51.b b = i51.b.a("generator");
    public static final i51.b c = i51.b.a("identifier");
    public static final i51.b d = i51.b.a("appQualitySessionId");
    public static final i51.b e = i51.b.a("startedAt");
    public static final i51.b f = i51.b.a("endedAt");
    public static final i51.b g = i51.b.a("crashed");
    public static final i51.b h = i51.b.a("app");
    public static final i51.b i = i51.b.a("user");
    public static final i51.b j = i51.b.a("os");
    public static final i51.b k = i51.b.a("device");
    public static final i51.b l = i51.b.a("events");
    public static final i51.b m = i51.b.a("generatorType");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        i51.d dVar = (i51.d) obj2;
        j0 j0Var = (j0) ((m2) obj);
        dVar.a(b, j0Var.a);
        dVar.a(c, j0Var.b.getBytes(n2.a));
        dVar.a(d, j0Var.c);
        dVar.d(e, j0Var.d);
        dVar.a(f, j0Var.e);
        dVar.g(g, j0Var.f);
        dVar.a(h, j0Var.g);
        dVar.a(i, j0Var.h);
        dVar.a(j, j0Var.i);
        dVar.a(k, j0Var.j);
        dVar.a(l, j0Var.k);
        dVar.e(m, j0Var.l);
    }
}
