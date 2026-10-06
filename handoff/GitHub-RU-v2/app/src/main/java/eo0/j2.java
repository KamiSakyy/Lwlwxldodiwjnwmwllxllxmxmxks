package eo0;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j2 implements aaShadow.a {
    public static final j2 a = new j2();
    public static final List b = sy.d0.o(new String[]{"pushedDate", "statusCheckRollup", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ZonedDateTime zonedDateTime = null;
        jn0.n4 n4Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                pz0.o7.Companion.getClass();
                zonedDateTime = (ZonedDateTime) no.a.h(wVar, pz0.o7.a, eVar, wVar);
            } else if (r0 == 1) {
                n4Var = (jn0.n4) aa.c.b(aa.c.c(w2.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
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
            return new jn0.z3(zonedDateTime, n4Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.z3 z3Var = (jn0.z3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z3Var, "value");
        fVar.z0("pushedDate");
        pz0.o7.Companion.getClass();
        aa.c.b(wVar.e(pz0.o7.a)).b(fVar, wVar, z3Var.a);
        fVar.z0("statusCheckRollup");
        aa.c.b(aa.c.c(w2.a, false)).b(fVar, wVar, z3Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z3Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, z3Var.d);
    }
}
