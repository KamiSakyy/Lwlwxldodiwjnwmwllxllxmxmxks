package k00;

import j00.d1;
import j00.e1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 implements aa.a {
    public static final k0 a = new k0();
    public static final List b = sy.d0Shadow.o("clientMutationId", "user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        e1 e1Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new d1(str, e1Var);
                }
                e1Var = (e1) aa.c.b(aa.c.c(l0.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d1 d1Var = (d1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d1Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, d1Var.a);
        fVar.z0("user");
        aa.c.b(aa.c.c(l0.a, true)).b(fVar, wVar, d1Var.b);
    }
}
