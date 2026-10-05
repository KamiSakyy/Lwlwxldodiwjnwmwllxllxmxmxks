package k00;

import j00.j1;
import j00.k1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o0 implements aa.a {
    public static final o0 a = new o0();
    public static final List b = sy.d0.o("clientMutationId", "user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        k1 k1Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new j1(str, k1Var);
                }
                k1Var = (k1) aa.c.b(aa.c.c(p0.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j1 j1Var = (j1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j1Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, j1Var.a);
        fVar.z0("user");
        aa.c.b(aa.c.c(p0.a, false)).b(fVar, wVar, j1Var.b);
    }
}
