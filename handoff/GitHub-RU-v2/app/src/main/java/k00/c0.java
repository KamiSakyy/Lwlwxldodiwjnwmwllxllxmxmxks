package k00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 implements aa.a {
    public static final c0 a = new c0();
    public static final List b = sy.d0Shadow.o("clientMutationId", "user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        j00.s0 s0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new j00.r0(str, s0Var);
                }
                s0Var = (j00.s0) aa.c.b(aa.c.c(d0.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00.r0 r0Var = (j00.r0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r0Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, r0Var.a);
        fVar.z0("user");
        aa.c.b(aa.c.c(d0.a, false)).b(fVar, wVar, r0Var.b);
    }
}
