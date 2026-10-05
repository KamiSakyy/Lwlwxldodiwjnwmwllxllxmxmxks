package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements i51.c {
    public static final g a = new g();
    public static final i51.b b = i51.b.a("identifier");
    public static final i51.b c = i51.b.a("version");
    public static final i51.b d = i51.b.a("displayVersion");
    public static final i51.b e = i51.b.a("organization");
    public static final i51.b f = i51.b.a("installationUuid");
    public static final i51.b g = i51.b.a("developmentPlatform");
    public static final i51.b h = i51.b.a("developmentPlatformVersion");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        i51.d dVar = (i51.d) obj2;
        k0 k0Var = (k0) ((u1) obj);
        dVar.a(b, k0Var.a);
        dVar.a(c, k0Var.b);
        dVar.a(d, k0Var.c);
        dVar.a(e, null);
        dVar.a(f, k0Var.d);
        dVar.a(g, k0Var.e);
        dVar.a(h, k0Var.f);
    }
}
