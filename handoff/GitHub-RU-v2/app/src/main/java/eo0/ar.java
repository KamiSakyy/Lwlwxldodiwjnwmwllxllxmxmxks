package eo0;

import java.util.List;
import jn0.m20;
import jn0.s20;
import jn0.t20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ar implements aaShadow.a {
    public static final ar a = new ar();
    public static final List b = sy.d0.o(new String[]{"__typename", "name", "id", "issueTypes", "pinnedIssues"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        m20 m20Var = null;
        s20 s20Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                m20Var = (m20) aa.c.b(aa.c.c(tq.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                s20Var = (s20) aa.c.b(aa.c.c(zq.a, false)).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str3 != null) {
            return new t20(str, str2, str3, m20Var, s20Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t20 t20Var = (t20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t20Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t20Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, t20Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, t20Var.c);
        fVar.z0("issueTypes");
        aa.c.b(aa.c.c(tq.a, false)).b(fVar, wVar, t20Var.d);
        fVar.z0("pinnedIssues");
        aa.c.b(aa.c.c(zq.a, false)).b(fVar, wVar, t20Var.e);
    }
}
