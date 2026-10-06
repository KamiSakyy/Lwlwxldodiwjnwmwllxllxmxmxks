package jm0;

import im0.s0;
import im0.t0;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d0 implements aa.a {
    public static final d0 a = new d0();
    public static final List b = sy.d0Shadow.o(new String[]{"clientMutationId", "user"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        t0 t0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new s0(str, t0Var);
                }
                t0Var = (t0) aa.c.b(aa.c.c(e0.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s0 s0Var = (s0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s0Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, s0Var.a);
        fVar.z0("user");
        aa.c.b(aa.c.c(e0.a, true)).b(fVar, wVar, s0Var.b);
    }
}
