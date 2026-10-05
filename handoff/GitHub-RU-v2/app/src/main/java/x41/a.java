package x41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements i51.c {
    public static final a a = new a();
    public static final i51.b b = i51.b.a("rolloutId");
    public static final i51.b c = i51.b.a("parameterKey");
    public static final i51.b d = i51.b.a("parameterValue");
    public static final i51.b e = i51.b.a("variantId");
    public static final i51.b f = i51.b.a("templateVersion");

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        i51.d dVar = (i51.d) obj2;
        b bVar = (b) ((n) obj);
        dVar.a(b, bVar.b);
        dVar.a(c, bVar.c);
        dVar.a(d, bVar.d);
        dVar.a(e, bVar.e);
        dVar.d(f, bVar.f);
    }
}
