package nb0;

import java.util.List;
import mb0.m0;
import mb0.n0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z implements aa.a {
    public static final z a = new z();
    public static final List b = sy.d0Shadow.o("clientMutationId", "user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        n0 n0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new m0(str, n0Var);
                }
                n0Var = (n0) aa.c.b(aa.c.c(a0.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m0 m0Var = (m0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m0Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, m0Var.a);
        fVar.z0("user");
        aa.c.b(aa.c.c(a0.a, false)).b(fVar, wVar, m0Var.b);
    }
}
