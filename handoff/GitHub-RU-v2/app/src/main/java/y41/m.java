package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements i51.c {
    public static final m a = new m();
    public static final i51.b b = i51.b.a("threads");
    public static final i51.b c = i51.b.a("exception");
    public static final i51.b d = i51.b.a("appExitInfo");
    public static final i51.b e = i51.b.a("signal");
    public static final i51.b f = i51.b.a("binaries");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        i51.d dVar = (i51.d) obj2;
        r0 r0Var = (r0) ((b2) obj);
        dVar.a(b, r0Var.a);
        dVar.a(c, r0Var.b);
        dVar.a(d, r0Var.c);
        dVar.a(e, r0Var.d);
        dVar.a(f, r0Var.e);
    }
}
