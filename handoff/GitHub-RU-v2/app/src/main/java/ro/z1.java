package ro;

import java.util.List;
import qo.c3;
import qo.d3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z1 implements aa.a {
    public static final z1 a = new z1();
    public static final List b = sy.d0Shadow.o("repository", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d3 d3Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                d3Var = (d3) aa.c.b(aa.c.c(a2.a, false)).a(eVar, wVar);
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
            return new c3(d3Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c3 c3Var = (c3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c3Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(a2.a, false)).b(fVar, wVar, c3Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c3Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, c3Var.c);
    }
}
