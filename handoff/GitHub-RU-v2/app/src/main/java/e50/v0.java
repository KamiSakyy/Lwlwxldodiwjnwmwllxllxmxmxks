package e50;

import hc0.fq;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 implements aa.a {
    public static final v0 a = new v0();
    public static final List b = sy.d0Shadow.o("id", "name", "owner", "viewerPermission", "isOrganizationDiscussionRepository", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        h0 h0Var = null;
        fq fqVar = null;
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
                h0Var = (h0) aa.c.c(s0.a, false).a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                fqVar = (fq) aa.c.b(ic0.b.h).a(eVar, wVar);
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
        if (h0Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "isOrganizationDiscussionRepository");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str3 != null) {
            return new k0(str, str2, h0Var, fqVar, booleanValue, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k0 k0Var = (k0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k0Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, k0Var.b);
        fVar.z0("owner");
        aa.c.c(s0.a, false).b(fVar, wVar, k0Var.c);
        fVar.z0("viewerPermission");
        aa.c.b(ic0.b.h).b(fVar, wVar, k0Var.d);
        fVar.z0("isOrganizationDiscussionRepository");
        f4.C(k0Var.e, aa.c.f, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, k0Var.f);
    }
}
