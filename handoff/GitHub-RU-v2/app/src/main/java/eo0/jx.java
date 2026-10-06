package eo0;

import java.util.List;
import jn0.dc0;
import jn0.zb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jx implements aaShadow.a {
    public static final jx a = new jx();
    public static final List b = sy.d0.o(new String[]{"pullRequest", "clientMutationId"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        zb0 zb0Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                zb0Var = (zb0) aa.c.b(aa.c.c(fx.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new dc0(zb0Var, str);
                }
                str = (String) aa.c.i.a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        dc0 dc0Var = (dc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dc0Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(fx.a, true)).b(fVar, wVar, dc0Var.a);
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, dc0Var.b);
    }
}
