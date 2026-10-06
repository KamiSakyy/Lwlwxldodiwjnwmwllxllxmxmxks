package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t9 implements aaShadow.a {
    public static final t9 a = new t9();
    public static final List b = sy.d0Shadow.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ne neVar = null;
        while (eVar.r0(b) == 0) {
            neVar = (u10.ne) aa.c.b(aa.c.c(u9.a, true)).a(eVar, wVar);
        }
        return new u10.me(neVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.me meVar = (u10.me) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(meVar, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(u9.a, true)).b(fVar, wVar, meVar.a);
    }
}
