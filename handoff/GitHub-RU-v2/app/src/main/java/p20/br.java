package p20;

import java.util.List;
import u10.j30;
import u10.k30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class br implements aa.a {
    public static final br a = new br();
    public static final List b = sy.d0.o("__typename", "subscribable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        j30 j30Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                j30Var = (j30) aa.c.b(aa.c.c(ar.a, true)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new k30(str, j30Var);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k30 k30Var = (k30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k30Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, k30Var.a);
        fVar.z0("subscribable");
        aa.c.b(aa.c.c(ar.a, true)).b(fVar, wVar, k30Var.b);
    }
}
