package e50;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c1 implements aa.a {
    public static final c1 a = new c1();
    public static final List b = sy.d0.o("id", "name", "owner", "isOrganizationDiscussionRepository", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        w0 w0Var = null;
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
                w0Var = (w0) aa.c.c(b1.a, false).a(eVar, wVar);
            } else if (r0 == 3) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 4) {
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
        if (w0Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "isOrganizationDiscussionRepository");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str3 != null) {
            return new x0(str, str2, w0Var, booleanValue, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x0 x0Var = (x0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x0Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, x0Var.b);
        fVar.z0("owner");
        aa.c.c(b1.a, false).b(fVar, wVar, x0Var.c);
        fVar.z0("isOrganizationDiscussionRepository");
        f4.C(x0Var.d, aa.c.f, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, x0Var.e);
    }
}
