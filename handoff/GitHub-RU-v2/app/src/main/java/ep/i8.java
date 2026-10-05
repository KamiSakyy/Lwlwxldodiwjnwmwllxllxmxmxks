package ep;

import java.util.List;
import m10.n40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i8 implements aa.a {
    public static final i8 a = new i8();
    public static final List b = sy.d0.o("id", "viewerPermission", "owner", "hasNestedDiscussionAnswersEnabled", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        n40 n40Var = null;
        jo.hc hcVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                n40Var = (n40) aa.c.b(n10.b.A).a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                hcVar = (jo.hc) aa.c.c(h8.a, false).a(eVar, wVar);
            } else if (r0 == 3) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (hcVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "hasNestedDiscussionAnswersEnabled");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str2 != null) {
            return new jo.ic(str, n40Var, hcVar, booleanValue, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ic icVar = (jo.ic) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(icVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, icVar.a);
        fVar.z0("viewerPermission");
        aa.c.b(n10.b.A).b(fVar, wVar, icVar.b);
        fVar.z0("owner");
        aa.c.c(h8.a, false).b(fVar, wVar, icVar.c);
        fVar.z0("hasNestedDiscussionAnswersEnabled");
        jo.f4.C(icVar.d, aa.c.f, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, icVar.e);
    }
}
