package m11;

import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements i51.c {
    public static final f a = new f();
    public static final i51.b b = new i51.b("currentCacheSizeBytes", f4.x(f4.w(l51.e.class, new l51.a(1))));
    public static final i51.b c = new i51.b("maxCacheSizeBytes", f4.x(f4.w(l51.e.class, new l51.a(2))));

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        p11.f fVar = (p11.f) obj;
        i51.d dVar = (i51.d) obj2;
        dVar.d(b, fVar.a);
        dVar.d(c, fVar.b);
    }
}
