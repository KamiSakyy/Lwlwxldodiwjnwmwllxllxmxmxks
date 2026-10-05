package w80;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g3 implements aa.a {
    public static final g3 a = new g3();
    public static final List b = sy.d0.o("column", "project", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        x2 x2Var = null;
        a3 a3Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                x2Var = (x2) aa.c.b(aa.c.c(e3.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                a3Var = (a3) aa.c.c(h3.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (a3Var == null) {
            k41.b.B(eVar, "project");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new z2(x2Var, a3Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z2 z2Var = (z2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z2Var, "value");
        fVar.z0("column");
        aa.c.b(aa.c.c(e3.a, false)).b(fVar, wVar, z2Var.a);
        fVar.z0("project");
        aa.c.c(h3.a, false).b(fVar, wVar, z2Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z2Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, z2Var.d);
    }
}
