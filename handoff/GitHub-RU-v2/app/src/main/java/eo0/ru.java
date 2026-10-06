package eo0;

import java.util.List;
import jn0.a80;
import jn0.d80;
import jn0.e80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ru implements aaShadow.a {
    public static final ru a = new ru();
    public static final List b = sy.d0.o(new String[]{"actor", "unlockedRecord"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        a80 a80Var = null;
        e80 e80Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                a80Var = (a80) aa.c.b(aa.c.c(pu.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new d80(a80Var, e80Var);
                }
                e80Var = (e80) aa.c.b(aa.c.c(su.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d80 d80Var = (d80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d80Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(pu.a, true)).b(fVar, wVar, d80Var.a);
        fVar.z0("unlockedRecord");
        aa.c.b(aa.c.c(su.a, true)).b(fVar, wVar, d80Var.b);
    }
}
