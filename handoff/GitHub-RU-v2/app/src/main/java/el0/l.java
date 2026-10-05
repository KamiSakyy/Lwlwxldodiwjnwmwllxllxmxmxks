package el0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements aa.a {
    public static final l a = new l();
    public static final List b = sy.d0.o(new String[]{"workflowRun", "app", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        dl0.h0 h0Var = null;
        dl0.q qVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                h0Var = (dl0.h0) aa.c.b(aa.c.c(a0.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                qVar = (dl0.q) aa.c.b(aa.c.c(k.a, false)).a(eVar, wVar);
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
            return new dl0.r(h0Var, qVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        dl0.r rVar = (dl0.r) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("workflowRun");
        aa.c.b(aa.c.c(a0.a, false)).b(fVar, wVar, rVar.a);
        fVar.z0("app");
        aa.c.b(aa.c.c(k.a, false)).b(fVar, wVar, rVar.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, rVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, rVar.d);
    }
}
