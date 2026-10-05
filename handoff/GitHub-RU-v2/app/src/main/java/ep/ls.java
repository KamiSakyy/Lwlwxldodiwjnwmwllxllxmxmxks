package ep;

import java.util.List;
import jo.m40;
import jo.s40;
import jo.t40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ls implements aa.a {
    public static final ls a = new ls();
    public static final List b = sy.d0.o("__typename", "name", "id", "issueTypes", "pinnedIssues");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        m40 m40Var = null;
        s40 s40Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                m40Var = (m40) aa.c.b(aa.c.c(es.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                s40Var = (s40) aa.c.b(aa.c.c(ks.a, false)).a(eVar, wVar);
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
            return new t40(str, str2, str3, m40Var, s40Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t40 t40Var = (t40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t40Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t40Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, t40Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, t40Var.c);
        fVar.z0("issueTypes");
        aa.c.b(aa.c.c(es.a, false)).b(fVar, wVar, t40Var.d);
        fVar.z0("pinnedIssues");
        aa.c.b(aa.c.c(ks.a, false)).b(fVar, wVar, t40Var.e);
    }
}
