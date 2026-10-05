package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y implements i51.c {
    public static final y a = new y();
    public static final i51.b b = i51.b.a("platform");
    public static final i51.b c = i51.b.a("version");
    public static final i51.b d = i51.b.a("buildVersion");
    public static final i51.b e = i51.b.a("jailbroken");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        i51.d dVar = (i51.d) obj2;
        i1 i1Var = (i1) ((k2) obj);
        dVar.e(b, i1Var.a);
        dVar.a(c, i1Var.b);
        dVar.a(d, i1Var.c);
        dVar.g(e, i1Var.d);
    }
}
