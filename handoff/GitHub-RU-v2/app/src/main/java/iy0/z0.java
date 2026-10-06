package iy0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z0 implements aa.a {
    public static final z0 a = new z0();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t0 t0Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2Field", "ProjectV2IterationField", "ProjectV2SingleSelectField"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            t0Var = b1.c(eVar, wVar);
        }
        return new r0(str, t0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r0 r0Var = (r0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, r0Var.a);
        t0 t0Var = r0Var.b;
        if (t0Var != null) {
            b1.d(fVar, wVar, t0Var);
        }
    }
}
