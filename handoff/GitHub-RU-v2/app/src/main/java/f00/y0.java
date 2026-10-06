package f00;

import java.util.List;
import java.util.Set;
import tz.j4;
import tz.n4;
import tz.r4;
import tz.t4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 implements aa.a {
    public static final y0 a = new y0();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        tz.o oVar;
        r4 r4Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        j4 j4Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2Field"}), set2, str, set)) {
            eVar.s0();
            oVar = tz.p.c(eVar, wVar);
        } else {
            oVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2SingleSelectField"}), set2, str, set)) {
            eVar.s0();
            r4Var = t4.c(eVar, wVar);
        } else {
            r4Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2IterationField"}), set2, str, set)) {
            eVar.s0();
            j4Var = n4.cShadow(eVar, wVar);
        }
        return new q0(str, oVar, r4Var, j4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q0 q0Var = (q0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, q0Var.a);
        tz.o oVar = q0Var.b;
        if (oVar != null) {
            tz.p.d(fVar, wVar, oVar);
        }
        r4 r4Var = q0Var.c;
        if (r4Var != null) {
            t4.d(fVar, wVar, r4Var);
        }
        j4 j4Var = q0Var.d;
        if (j4Var != null) {
            n4.d(fVar, wVar, j4Var);
        }
    }
}
