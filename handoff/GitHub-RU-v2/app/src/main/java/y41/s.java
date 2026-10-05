package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s implements i51.c {
    public static final s a = new s();
    public static final i51.b b = i51.b.a("batteryLevel");
    public static final i51.b c = i51.b.a("batteryVelocity");
    public static final i51.b d = i51.b.a("proximityOn");
    public static final i51.b e = i51.b.a("orientation");
    public static final i51.b f = i51.b.a("ramUsed");
    public static final i51.b g = i51.b.a("diskUsed");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        i51.d dVar = (i51.d) obj2;
        b1 b1Var = (b1) ((e2) obj);
        dVar.a(b, b1Var.a);
        dVar.e(c, b1Var.b);
        dVar.g(d, b1Var.c);
        dVar.e(e, b1Var.d);
        dVar.d(f, b1Var.e);
        dVar.d(g, b1Var.f);
    }
}
