package vn0;

import java.util.List;
import pz0.py;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h3 implements aa.a {
    public static final h3 a = new h3();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "name", "owner", "viewerPermission", "defaultBranchRef", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        w2 w2Var = null;
        py pyVar = null;
        t2 t2Var = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                w2Var = (w2) aa.c.c(g3.a, false).a(eVar, wVar);
            } else if (r0 == 3) {
                pyVar = (py) aa.c.b(qz0.b.o).a(eVar, wVar);
            } else if (r0 == 4) {
                t2Var = (t2) aa.c.b(aa.c.c(d3.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (w2Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str3 != null) {
            return new x2(str, str2, w2Var, pyVar, t2Var, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x2 x2Var = (x2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x2Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x2Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, x2Var.b);
        fVar.z0("owner");
        aa.c.c(g3.a, false).b(fVar, wVar, x2Var.c);
        fVar.z0("viewerPermission");
        aa.c.b(qz0.b.o).b(fVar, wVar, x2Var.d);
        fVar.z0("defaultBranchRef");
        aa.c.b(aa.c.c(d3.a, false)).b(fVar, wVar, x2Var.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, x2Var.f);
    }
}
