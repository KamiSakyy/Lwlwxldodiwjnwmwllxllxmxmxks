package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements i51.c {
    public static final d a = new d();
    public static final i51.b b = i51.b.a("sdkVersion");
    public static final i51.b c = i51.b.a("gmpAppId");
    public static final i51.b d = i51.b.a("platform");
    public static final i51.b e = i51.b.a("installationUuid");
    public static final i51.b f = i51.b.a("firebaseInstallationId");
    public static final i51.b g = i51.b.a("firebaseAuthenticationToken");
    public static final i51.b h = i51.b.a("appQualitySessionId");
    public static final i51.b i = i51.b.a("buildVersion");
    public static final i51.b j = i51.b.a("displayVersion");
    public static final i51.b k = i51.b.a("session");
    public static final i51.b l = i51.b.a("ndkPayload");
    public static final i51.b m = i51.b.a("appExitInfo");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        i51.d dVar = (i51.d) obj2;
        b0 b0Var = (b0) ((n2) obj);
        dVar.a(b, b0Var.b);
        dVar.a(c, b0Var.c);
        dVar.e(d, b0Var.d);
        dVar.a(e, b0Var.e);
        dVar.a(f, b0Var.f);
        dVar.a(g, b0Var.g);
        dVar.a(h, b0Var.h);
        dVar.a(i, b0Var.i);
        dVar.a(j, b0Var.j);
        dVar.a(k, b0Var.k);
        dVar.a(l, b0Var.l);
        dVar.a(m, b0Var.m);
    }
}
