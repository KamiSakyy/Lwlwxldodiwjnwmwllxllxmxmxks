package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class al implements aaShadow.a {
    public static final al a = new al();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.juShadow juVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                juVar = (jo.ju) aa.c.c(xk.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(tk.a, false)))).a(eVar, wVar);
            }
        }
        if (juVar != null) {
            return new jo.mu(juVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.mu muVar = (jo.mu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(muVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(xk.a, false).b(fVar, wVar, muVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(tk.a, false)))).b(fVar, wVar, muVar.b);
    }
}
