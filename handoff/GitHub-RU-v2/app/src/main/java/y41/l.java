package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements i51.c {
    public static final l a = new l();
    public static final i51.b b = i51.b.a("baseAddress");
    public static final i51.b c = i51.b.a("size");
    public static final i51.b d = i51.b.a("name");
    public static final i51.b e = i51.b.a("uuid");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        i51.d dVar = (i51.d) obj2;
        s0 s0Var = (s0) ((w1) obj);
        dVar.d(b, s0Var.a);
        dVar.d(c, s0Var.b);
        dVar.a(d, s0Var.c);
        String str = s0Var.d;
        dVar.a(e, str != null ? str.getBytes(n2.a) : null);
    }
}
