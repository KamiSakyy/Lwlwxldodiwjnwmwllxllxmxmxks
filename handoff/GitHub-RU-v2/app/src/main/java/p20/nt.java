package p20;

import java.util.List;
import u10.m60;
import u10.t60;
import u10.v60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nt implements aa.a {
    public static final nt a = new nt();
    public static final List b = sy.d0.o("actor", "pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m60 m60Var = null;
        t60 t60Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                m60Var = (m60) aa.c.b(aa.c.c(et.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new v60(m60Var, t60Var);
                }
                t60Var = (t60) aa.c.b(aa.c.c(lt.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v60 v60Var = (v60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v60Var, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(et.a, true)).b(fVar, wVar, v60Var.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(lt.a, false)).b(fVar, wVar, v60Var.b);
    }
}
