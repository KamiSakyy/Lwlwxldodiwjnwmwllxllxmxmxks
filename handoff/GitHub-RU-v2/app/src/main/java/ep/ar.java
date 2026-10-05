package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ar implements aa.a {
    public static final ar a = new ar();
    public static final List b = sy.d0.o("defaultBranchRef", "refs", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.n20 n20Var = null;
        jo.p20 p20Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                n20Var = (jo.n20) aa.c.b(aa.c.c(xq.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                p20Var = (jo.p20) aa.c.b(aa.c.c(zq.a, false)).a(eVar, wVar);
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
            return new jo.q20(n20Var, p20Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.q20 q20Var = (jo.q20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q20Var, "value");
        fVar.z0("defaultBranchRef");
        aa.c.b(aa.c.c(xq.a, false)).b(fVar, wVar, q20Var.a);
        fVar.z0("refs");
        aa.c.b(aa.c.c(zq.a, false)).b(fVar, wVar, q20Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, q20Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, q20Var.d);
    }
}
