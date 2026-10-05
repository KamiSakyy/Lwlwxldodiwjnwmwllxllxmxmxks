package ep;

import java.util.List;
import jo.ek0;
import jo.fk0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u20 implements aa.a {
    public static final u20 a = new u20();
    public static final List b = sy.d0.o("repositories", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ek0 ek0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ek0Var = (ek0) aa.c.c(t20.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (ek0Var == null) {
            k41.b.B(eVar, "repositories");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new fk0(ek0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fk0 fk0Var = (fk0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fk0Var, "value");
        fVar.z0("repositories");
        aa.c.c(t20.a, false).b(fVar, wVar, fk0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fk0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, fk0Var.c);
    }
}
