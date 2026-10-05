package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w6 implements aa.a {
    public static final w6 a = new w6();
    public static final List b = sy.d0.o("id", "subIssues", "__typename");

    public static r6 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        q6 q6Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                q6Var = (q6) aa.c.c(x6.a, false).a(eVar, wVar);
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
        if (q6Var == null) {
            k41.b.B(eVar, "subIssues");
            throw null;
        }
        if (str2 != null) {
            return new r6(str, q6Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, r6 r6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r6Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r6Var.a);
        fVar.z0("subIssues");
        aa.c.c(x6.a, false).b(fVar, wVar, r6Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, r6Var.c);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (r6) obj);
    }
}
