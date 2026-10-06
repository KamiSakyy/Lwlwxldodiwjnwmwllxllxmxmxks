package uf0;

import gn0.jr;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z0 implements aa.a {
    public static final z0 a = new z0();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "name", "owner", "viewerPermission", "isOrganizationDiscussionRepository", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        l0 l0Var = null;
        jr jrVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                l0Var = (l0) aa.c.c(w0.a, false).a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                jrVar = (jr) aa.c.b(hn0.b.h).a(eVar, wVar);
            } else if (r0 == 4) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                bool = bool2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (l0Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "isOrganizationDiscussionRepository");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str3 != null) {
            return new o0(str, str2, l0Var, jrVar, booleanValue, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o0 o0Var = (o0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, o0Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, o0Var.b);
        fVar.z0("owner");
        aa.c.c(w0.a, false).b(fVar, wVar, o0Var.c);
        fVar.z0("viewerPermission");
        aa.c.b(hn0.b.h).b(fVar, wVar, o0Var.d);
        fVar.z0("isOrganizationDiscussionRepository");
        f4.C(o0Var.e, aa.c.f, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, o0Var.f);
    }
}
