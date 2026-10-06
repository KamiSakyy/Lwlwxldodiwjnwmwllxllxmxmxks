package eo0;

import java.util.List;
import jn0.y30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wr implements aaShadow.a {
    public static final wr a = new wr();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        ep0.c c = ep0.d.c(eVar, wVar);
        if (str != null) {
            return new y30(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        y30 y30Var = (y30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y30Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, y30Var.a);
        List list = ep0.d.a;
        ep0.c cVar = y30Var.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, cVar.a);
        ep0.a aVar = cVar.b;
        if (aVar != null) {
            ep0.e.d(fVar, wVar, aVar);
        }
        ep0.b bVar = cVar.c;
        if (bVar != null) {
            ep0.f.d(fVar, wVar, bVar);
        }
    }
}
