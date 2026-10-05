package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n implements i51.c {
    public static final n a = new n();
    public static final i51.b b = i51.b.a("type");
    public static final i51.b c = i51.b.a("reason");
    public static final i51.b d = i51.b.a("frames");
    public static final i51.b e = i51.b.a("causedBy");
    public static final i51.b f = i51.b.a("overflowCount");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        i51.d dVar = (i51.d) obj2;
        t0 t0Var = (t0) ((x1) obj);
        dVar.a(b, t0Var.a);
        dVar.a(c, t0Var.b);
        dVar.a(d, t0Var.c);
        dVar.a(e, t0Var.d);
        dVar.e(f, t0Var.e);
    }
}
