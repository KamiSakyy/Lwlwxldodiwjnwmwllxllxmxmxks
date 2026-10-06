package ep;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v2 implements aaShadow.a {
    public static final v2 a = new v2();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        jo.t4 t4Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        jo.r4 r4Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"StatusContext"}), set2, str, set)) {
            eVar.s0();
            t4Var = z2.c(eVar, wVar);
        } else {
            t4Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CheckRun"}), set2, str, set)) {
            eVar.s0();
            r4Var = x2.c(eVar, wVar);
        }
        return new jo.p4(str, t4Var, r4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.p4 p4Var = (jo.p4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p4Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, p4Var.a);
        jo.t4 t4Var = p4Var.b;
        if (t4Var != null) {
            z2.d(fVar, wVar, t4Var);
        }
        jo.r4 r4Var = p4Var.c;
        if (r4Var != null) {
            x2.d(fVar, wVar, r4Var);
        }
    }
}
