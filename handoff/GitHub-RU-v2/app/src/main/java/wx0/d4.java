package wx0;

import java.util.List;
import pz0.py;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d4 implements aa.a {
    public static final d4 a = new d4();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "name", "owner", "viewerPermission"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        s1 s1Var = null;
        py pyVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                s1Var = (s1) aa.c.c(a4.a, true).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                pyVar = (py) aa.c.b(qz0.b.o).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (s1Var != null) {
            return new u1(str, str2, str3, s1Var, pyVar);
        }
        k41.b.B(eVar, "owner");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u1 u1Var = (u1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, u1Var.b);
        fVar.z0("name");
        bVar.b(fVar, wVar, u1Var.c);
        fVar.z0("owner");
        aa.c.c(a4.a, true).b(fVar, wVar, u1Var.d);
        fVar.z0("viewerPermission");
        aa.c.b(qz0.b.o).b(fVar, wVar, u1Var.e);
    }
}
