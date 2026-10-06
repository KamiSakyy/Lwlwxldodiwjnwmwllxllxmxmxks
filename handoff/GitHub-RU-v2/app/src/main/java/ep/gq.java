package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gqShadow implements aaShadow.a {
    public static final gqShadow a = new gqShadow();
    public static final List b = sy.d0.o("id", "activePullRequests", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.d10 d10Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                d10Var = (jo.d10) aa.c.c(yp.a, false).a(eVar, wVar);
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
        if (d10Var == null) {
            k41.b.B(eVar, "activePullRequests");
            throw null;
        }
        if (str2 != null) {
            return new jo.m10(str, d10Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.m10Shadow m10Var = (jo.m10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m10Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m10Var.a);
        fVar.z0("activePullRequests");
        aa.c.c(yp.a, false).b(fVar, wVar, m10Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, m10Var.c);
    }
}
