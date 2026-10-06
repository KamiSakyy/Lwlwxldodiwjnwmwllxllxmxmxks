package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t implements i51.c {
    public static final t a = new t();
    public static final i51.b b = i51.b.a("timestamp");
    public static final i51.b c = i51.b.a("type");
    public static final i51.b d = i51.b.a("app");
    public static final i51.b e = i51.b.a("device");
    public static final i51.b f = i51.b.a("log");
    public static final i51.b g = i51.b.a("rollouts");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        i51.d dVar = (i51.d) obj2;
        p0 p0Var = (p0) ((j2) obj);
        dVar.d(b, p0Var.a);
        dVar.a(c, p0Var.b);
        dVar.a(d, p0Var.c);
        dVar.a(e, p0Var.d);
        dVar.a(f, p0Var.e);
        dVar.a(g, p0Var.f);
    }
    public Object B(Object p1) { return null; }
    public Object f(Object p1, Object p2, Object p3) { return null; }
    public Object x() { return null; }
}
