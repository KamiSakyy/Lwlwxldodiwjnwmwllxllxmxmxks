package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements i51.c {
    public static final r a = new r();
    public static final i51.b b = i51.b.a("processName");
    public static final i51.b c = i51.b.a("pid");
    public static final i51.b d = i51.b.a("importance");
    public static final i51.b e = i51.b.a("defaultProcess");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        i51.d dVar = (i51.d) obj2;
        z0 z0Var = (z0) ((c2) obj);
        dVar.a(b, z0Var.a);
        dVar.e(c, z0Var.b);
        dVar.e(d, z0Var.c);
        dVar.g(e, z0Var.d);
    }
}
