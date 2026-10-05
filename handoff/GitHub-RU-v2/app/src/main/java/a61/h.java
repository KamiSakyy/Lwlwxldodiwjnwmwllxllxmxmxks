package a61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements i51.c {
    public static final h a = new h();
    public static final i51.b b = i51.b.a("sessionId");
    public static final i51.b c = i51.b.a("firstSessionId");
    public static final i51.b d = i51.b.a("sessionIndex");
    public static final i51.b e = i51.b.a("eventTimestampUs");
    public static final i51.b f = i51.b.a("dataCollectionStatus");
    public static final i51.b g = i51.b.a("firebaseInstallationId");
    public static final i51.b h = i51.b.a("firebaseAuthenticationToken");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        z0 z0Var = (z0) obj;
        i51.d dVar = (i51.d) obj2;
        dVar.a(b, z0Var.a);
        dVar.a(c, z0Var.b);
        dVar.e(d, z0Var.c);
        dVar.d(e, z0Var.d);
        dVar.a(f, z0Var.e);
        dVar.a(g, z0Var.f);
        dVar.a(h, z0Var.g);
    }
}
