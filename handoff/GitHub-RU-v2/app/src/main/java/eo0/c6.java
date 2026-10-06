package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c6 implements aaShadow.a {
    public static final c6 a = new c6();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new jn0.h9(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.h9 h9Var = (jn0.h9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h9Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, h9Var.a);
    }
}
