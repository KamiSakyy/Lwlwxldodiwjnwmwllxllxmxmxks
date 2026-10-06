package ny0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v implements aa.a {
    public static final v a = new v();
    public static final List b = sy.d0Shadow.o(new String[]{"clientMutationId", "user"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        my0.h0 h0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new my0.g0(str, h0Var);
                }
                h0Var = (my0.h0) aa.c.b(aa.c.c(w.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        my0.g0 g0Var = (my0.g0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g0Var, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, g0Var.a);
        fVar.z0("user");
        aa.c.b(aa.c.c(w.a, false)).b(fVar, wVar, g0Var.b);
    }
}
