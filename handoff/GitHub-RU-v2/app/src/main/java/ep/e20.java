package ep;

import java.util.List;
import jo.lj0;
import jo.qj0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e20 implements aa.a {
    public static final e20 a = new e20();
    public static final List b = sy.d0.o("repository", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        qj0 qj0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                qj0Var = (qj0) aa.c.b(aa.c.c(j20.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new lj0(qj0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        lj0 lj0Var = (lj0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lj0Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(j20.a, false)).b(fVar, wVar, lj0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, lj0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, lj0Var.c);
    }
}
