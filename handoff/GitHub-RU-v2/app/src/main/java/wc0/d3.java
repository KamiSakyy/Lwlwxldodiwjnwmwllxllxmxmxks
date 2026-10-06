package wc0;

import gn0.jr;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d3 implements aa.a {
    public static final d3 a = new d3();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "name", "owner", "viewerPermission", "defaultBranchRef", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        s2 s2Var = null;
        jr jrVar = null;
        p2 p2Var = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                s2Var = (s2) aa.c.c(c3.a, false).a(eVar, wVar);
            } else if (r0 == 3) {
                jrVar = (jr) aa.c.b(hn0.b.h).a(eVar, wVar);
            } else if (r0 == 4) {
                p2Var = (p2) aa.c.b(aa.c.c(z2.a, false)).a(eVar, wVar);
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
        if (s2Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str3 != null) {
            return new t2(str, str2, s2Var, jrVar, p2Var, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t2 t2Var = (t2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t2Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t2Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, t2Var.b);
        fVar.z0("owner");
        aa.c.c(c3.a, false).b(fVar, wVar, t2Var.c);
        fVar.z0("viewerPermission");
        aa.c.b(hn0.b.h).b(fVar, wVar, t2Var.d);
        fVar.z0("defaultBranchRef");
        aa.c.b(aa.c.c(z2.a, false)).b(fVar, wVar, t2Var.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, t2Var.f);
    }
}
