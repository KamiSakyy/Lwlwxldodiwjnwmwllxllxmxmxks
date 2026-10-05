package m11;

import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements i51.c {
    public static final c a = new c();
    public static final i51.b b = new i51.b("eventsDroppedCount", f4.x(f4.w(l51.e.class, new l51.a(1))));
    public static final i51.b c = new i51.b("reason", f4.x(f4.w(l51.e.class, new l51.a(3))));

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        p11.d dVar = (p11.d) obj;
        i51.d dVar2 = (i51.d) obj2;
        dVar2.d(b, dVar.a);
        dVar2.a(c, dVar.b);
    }
}
