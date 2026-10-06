package eo0;

import java.util.List;
import jn0.fc0;
import jn0.jc0;
import jn0.kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ox implements aaShadow.a {
    public static final ox a = new ox();
    public static final List b = sy.d0Shadow.o(new String[]{"actor", "pullRequest"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fc0 fc0Var = null;
        jc0 jc0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                fc0Var = (fc0) aa.c.b(aa.c.c(kx.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new kc0(fc0Var, jc0Var);
                }
                jc0Var = (jc0) aa.c.b(aa.c.c(nx.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0 kc0Var = (kc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kc0Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(kx.a, true)).b(fVar, wVar, kc0Var.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(nx.a, true)).b(fVar, wVar, kc0Var.b);
    }
}
