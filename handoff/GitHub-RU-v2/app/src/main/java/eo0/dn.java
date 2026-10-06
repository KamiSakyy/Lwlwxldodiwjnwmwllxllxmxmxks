package eo0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dn implements aaShadow.a {
    public static final dn a = new dn();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        jn0.bx bxVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        jn0.ax axVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            bxVar = ym.c(eVar, wVar);
        } else {
            bxVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            axVar = xm.c(eVar, wVar);
        }
        return new jn0.gx(str, bxVar, axVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.gx gxVar = (jn0.gx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gxVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, gxVar.a);
        jn0.bx bxVar = gxVar.b;
        if (bxVar != null) {
            ym.d(fVar, wVar, bxVar);
        }
        jn0.ax axVar = gxVar.c;
        if (axVar != null) {
            xm.d(fVar, wVar, axVar);
        }
    }
}
