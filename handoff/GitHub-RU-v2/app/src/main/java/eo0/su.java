package eo0;

import java.util.List;
import jn0.e80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class su implements aa.a {
    public static final su a = new su();
    public static final List b = sy.d0.o(new String[]{"__typename", "activeLockReason"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        pz0.ig igVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                igVar = (pz0.ig) aa.c.b(qz0.a.z).a(eVar, wVar);
            }
        }
        eVar.s0();
        ks0.h hVar = ks0.h.a;
        ks0.e c = ks0.h.c(eVar, wVar);
        if (str != null) {
            return new e80(str, igVar, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e80 e80Var = (e80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e80Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, e80Var.a);
        fVar.z0("activeLockReason");
        aa.c.b(qz0.a.z).b(fVar, wVar, e80Var.b);
        ks0.h hVar = ks0.h.a;
        ks0.h.d(fVar, wVar, e80Var.c);
    }
}
