package p20;

import java.util.List;
import u10.b60;
import u10.j60;
import u10.k60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dt implements aaShadow.a {
    public static final dt a = new dt();
    public static final List b = sy.d0Shadow.o("actor", "pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b60 b60Var = null;
        j60 j60Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                b60Var = (b60) aa.c.b(aa.c.c(vs.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new k60(b60Var, j60Var);
                }
                j60Var = (j60) aa.c.b(aa.c.c(ct.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k60 k60Var = (k60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k60Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(vs.a, true)).b(fVar, wVar, k60Var.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(ct.a, true)).b(fVar, wVar, k60Var.b);
    }
}
