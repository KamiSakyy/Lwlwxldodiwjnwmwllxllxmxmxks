package p20;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l2 implements aaShadow.a {
    public static final l2 a = new l2();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        u10.e4 e4Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        u10.c4 c4Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"StatusContext"}), set2, str, set)) {
            eVar.s0();
            e4Var = p2.c(eVar, wVar);
        } else {
            e4Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CheckRun"}), set2, str, set)) {
            eVar.s0();
            c4Var = n2.c(eVar, wVar);
        }
        return new u10.a4(str, e4Var, c4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.a4 a4Var = (u10.a4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a4Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, a4Var.a);
        u10.e4 e4Var = a4Var.b;
        if (e4Var != null) {
            p2.d(fVar, wVar, e4Var);
        }
        u10.c4 c4Var = a4Var.c;
        if (c4Var != null) {
            n2.d(fVar, wVar, c4Var);
        }
    }
}
