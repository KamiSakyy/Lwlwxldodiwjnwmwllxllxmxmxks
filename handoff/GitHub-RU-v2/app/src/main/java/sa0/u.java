package sa0;

import aa.w;
import java.util.List;
import ra0.c0;
import ra0.f0;
import ra0.g0;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u implements aa.a {
    public static final u a = new u();
    public static final List b = d0Shadow.o("item", "user");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c0 c0Var = null;
        g0 g0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                c0Var = (c0) aa.c.b(aa.c.c(r.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new f0(c0Var, g0Var);
                }
                g0Var = (g0) aa.c.b(aa.c.c(v.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        f0 f0Var = (f0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f0Var, "value");
        fVar.z0("item");
        aa.c.b(aa.c.c(r.a, true)).b(fVar, wVar, f0Var.a);
        fVar.z0("user");
        aa.c.b(aa.c.c(v.a, false)).b(fVar, wVar, f0Var.b);
    }
}
