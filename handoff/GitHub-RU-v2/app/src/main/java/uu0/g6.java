package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g6 implements aa.a {
    public static final g6 a = new g6();
    public static final List b = sy.d0.o(new String[]{"id", "subIssuesSummary", "__typename"});

    public static d6 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        c6 c6Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                c6Var = (c6) aa.c.c(h6.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (c6Var == null) {
            k41.b.B(eVar, "subIssuesSummary");
            throw null;
        }
        if (str2 != null) {
            return new d6(str, c6Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, d6 d6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d6Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d6Var.a);
        fVar.z0("subIssuesSummary");
        aa.c.c(h6.a, false).b(fVar, wVar, d6Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, d6Var.c);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (d6) obj);
    }
}
