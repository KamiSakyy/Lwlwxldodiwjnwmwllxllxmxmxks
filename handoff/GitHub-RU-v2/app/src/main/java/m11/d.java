package m11;

import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements i51.c {
    public static final d a = new d();
    public static final i51.b b = new i51.b("logSource", f4.x(f4.w(l51.e.class, new l51.a(1))));
    public static final i51.b c = new i51.b("logEventDropped", f4.x(f4.w(l51.e.class, new l51.a(2))));

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        p11.e eVar = (p11.e) obj;
        i51.d dVar = (i51.d) obj2;
        dVar.a(b, eVar.a);
        dVar.a(c, eVar.b);
    }
}
