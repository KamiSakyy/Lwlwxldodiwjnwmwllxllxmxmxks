package ep;

import java.util.List;
import jo.fd0;
import jo.id0;
import jo.kd0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class iy implements aa.a {
    public static final iy a = new iy();
    public static final List b = sy.d0.o("actor", "issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fd0 fd0Var = null;
        id0 id0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                fd0Var = (fd0) aa.c.b(aa.c.c(ey.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new kd0(fd0Var, id0Var);
                }
                id0Var = (id0) aa.c.b(aa.c.c(gy.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kd0 kd0Var = (kd0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kd0Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(ey.a, true)).b(fVar, wVar, kd0Var.a);
        fVar.z0("issue");
        aa.c.b(aa.c.c(gy.a, true)).b(fVar, wVar, kd0Var.b);
    }
}
