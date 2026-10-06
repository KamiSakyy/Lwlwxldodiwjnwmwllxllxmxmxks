package a61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements i51.c {
    public static final f a = new f();
    public static final i51.b b = i51.b.a("processName");
    public static final i51.b c = i51.b.a("pid");
    public static final i51.b d = i51.b.a("importance");
    public static final i51.b e = i51.b.a("defaultProcess");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        i51.d dVar = (i51.d) obj2;
        dVar.a(b, c0Var.a);
        dVar.e(c, c0Var.b);
        dVar.e(d, c0Var.c);
        dVar.g(e, c0Var.d);
    }
}
