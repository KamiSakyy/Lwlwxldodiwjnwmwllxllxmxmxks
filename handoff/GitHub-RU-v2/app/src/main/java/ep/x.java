package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x implements aa.a {
    public static final x a = new x();
    public static final List b = sy.d0.o("reactable", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.j0 j0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                j0Var = (jo.j0) aa.c.c(w.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (j0Var == null) {
            k41.b.B(eVar, "reactable");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jo.k0(j0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.k0 k0Var = (jo.k0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k0Var, "value");
        fVar.z0("reactable");
        aa.c.c(w.a, true).b(fVar, wVar, k0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, k0Var.c);
    }
}
