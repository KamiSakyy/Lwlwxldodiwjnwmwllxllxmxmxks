package cq0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 implements aa.a {
    public static final i0 a = new i0();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        wq0.a c = wq0.b.c(eVar, wVar);
        if (str != null) {
            return new f(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f fVar2 = (f) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, fVar2.a);
        List list = wq0.b.a;
        wq0.b.d(fVar, wVar, fVar2.b);
    }
}
