package fd0;

import java.util.List;
import kc0.c30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zq implements aa.a {
    public static final zq a = new zq();
    public static final List b = sy.d0.o(new String[]{"__typename", "hasIssuesEnabled", "isDiscussionsEnabled", "isArchived", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                bool3 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                bool4 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        eVar.s0();
        oj0.v3 c = oj0.x3.c(eVar, wVar);
        eVar.s0();
        oj0.h c2 = oj0.m.c(eVar, wVar);
        Boolean bool5 = bool2;
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (bool5 == null) {
            k41.b.B(eVar, "hasIssuesEnabled");
            throw null;
        }
        Boolean bool6 = bool3;
        boolean booleanValue = bool5.booleanValue();
        if (bool6 == null) {
            k41.b.B(eVar, "isDiscussionsEnabled");
            throw null;
        }
        Boolean bool7 = bool4;
        boolean booleanValue2 = bool6.booleanValue();
        if (bool7 == null) {
            k41.b.B(eVar, "isArchived");
            throw null;
        }
        boolean booleanValue3 = bool7.booleanValue();
        if (str2 != null) {
            return new c30(str, booleanValue, booleanValue2, booleanValue3, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c30 c30Var = (c30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c30Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c30Var.a);
        fVar.z0("hasIssuesEnabled");
        aa.b bVar2 = aa.c.f;
        jo.f4.C(c30Var.b, bVar2, fVar, wVar, "isDiscussionsEnabled");
        jo.f4.C(c30Var.c, bVar2, fVar, wVar, "isArchived");
        jo.f4.C(c30Var.d, bVar2, fVar, wVar, "id");
        bVar.b(fVar, wVar, c30Var.e);
        List list = oj0.x3.a;
        oj0.x3.d(fVar, wVar, c30Var.f);
        List list2 = oj0.m.a;
        oj0.m.d(fVar, wVar, c30Var.g);
    }
}
