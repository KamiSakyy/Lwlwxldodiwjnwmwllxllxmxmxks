package k00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u implements aa.a {
    public static final u a = new u();
    public static final List b = sy.d0.o("clientMutationId", "user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        j00.g0 g0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new j00.f0(str, g0Var);
                }
                g0Var = (j00.g0) aa.c.b(aa.c.c(v.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00.f0 f0Var = (j00.f0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f0Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, f0Var.a);
        fVar.z0("user");
        aa.c.b(aa.c.c(v.a, false)).b(fVar, wVar, f0Var.b);
    }
}
