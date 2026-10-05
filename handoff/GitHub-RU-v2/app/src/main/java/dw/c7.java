package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c7 implements aa.a {
    public static final c7 a = new c7();
    public static final List b = sy.d0.o("id", "subIssuesSummary", "__typename");

    public static z6 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        y6 y6Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                y6Var = (y6) aa.c.c(d7.a, false).a(eVar, wVar);
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
        if (y6Var == null) {
            k41.b.B(eVar, "subIssuesSummary");
            throw null;
        }
        if (str2 != null) {
            return new z6(str, y6Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, z6 z6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z6Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z6Var.a);
        fVar.z0("subIssuesSummary");
        aa.c.c(d7.a, false).b(fVar, wVar, z6Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, z6Var.c);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (z6) obj);
    }
}
