package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements i51.c {
    public static final i a = new i();
    public static final i51.b b = i51.b.a("arch");
    public static final i51.b c = i51.b.a("model");
    public static final i51.b d = i51.b.a("cores");
    public static final i51.b e = i51.b.a("ram");
    public static final i51.b f = i51.b.a("diskSpace");
    public static final i51.b g = i51.b.a("simulator");
    public static final i51.b h = i51.b.a("state");
    public static final i51.b i = i51.b.a("manufacturer");
    public static final i51.b j = i51.b.a("modelClass");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        i51.d dVar = (i51.d) obj2;
        n0 n0Var = (n0) ((v1) obj);
        dVar.e(b, n0Var.a);
        dVar.a(c, n0Var.b);
        dVar.e(d, n0Var.c);
        dVar.d(e, n0Var.d);
        dVar.d(f, n0Var.e);
        dVar.g(g, n0Var.f);
        dVar.e(h, n0Var.g);
        dVar.a(i, n0Var.h);
        dVar.a(j, n0Var.i);
    }
}
