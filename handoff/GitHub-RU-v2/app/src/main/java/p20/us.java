package p20;

import java.util.List;
import u10.v50;
import u10.z50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class us implements aaShadow.a {
    public static final us a = new us();
    public static final List b = sy.d0Shadow.o("pullRequest", "clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v50 v50Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                v50Var = (v50) aa.c.b(aa.c.c(qs.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new z50(v50Var, str);
                }
                str = (String) aa.c.i.a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z50 z50Var = (z50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z50Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(qs.a, true)).b(fVar, wVar, z50Var.a);
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, z50Var.b);
    }
}
