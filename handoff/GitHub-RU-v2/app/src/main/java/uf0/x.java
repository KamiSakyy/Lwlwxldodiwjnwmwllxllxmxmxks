package uf0;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x implements aa.a {
    public static final x a = new x();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        fi0.a c = fi0.b.c(eVar, wVar);
        if (str != null) {
            return new q(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q qVar = (q) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, qVar.a);
        List list = fi0.b.a;
        fi0.a aVar = qVar.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("hasPreviousPage");
        f4.C(aVar.a, aa.c.f, fVar, wVar, "startCursor");
        aa.c.i.b(fVar, wVar, aVar.b);
    }
}
