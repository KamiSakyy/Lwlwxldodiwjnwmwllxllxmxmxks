package k00;

import j00.p1;
import j00.q1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 implements aa.a {
    public static final s0 a = new s0();
    public static final List b = sy.d0Shadow.o("clientMutationId", "user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        q1 q1Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new p1(str, q1Var);
                }
                q1Var = (q1) aa.c.b(aa.c.c(t0.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p1 p1Var = (p1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p1Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, p1Var.a);
        fVar.z0("user");
        aa.c.b(aa.c.c(t0.a, false)).b(fVar, wVar, p1Var.b);
    }
}
