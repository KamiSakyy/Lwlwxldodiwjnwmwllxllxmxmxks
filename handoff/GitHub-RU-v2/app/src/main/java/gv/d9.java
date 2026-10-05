package gv;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d9 implements aa.a {
    public static final d9 a = new d9();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        t8 t8Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        s8 s8Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            t8Var = b9.c(eVar, wVar);
        } else {
            t8Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Bot"}), set2, str, set)) {
            eVar.s0();
            s8Var = a9.c(eVar, wVar);
        }
        return new v8(str, t8Var, s8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v8 v8Var = (v8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v8Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, v8Var.a);
        t8 t8Var = v8Var.b;
        if (t8Var != null) {
            b9.d(fVar, wVar, t8Var);
        }
        s8 s8Var = v8Var.c;
        if (s8Var != null) {
            a9.d(fVar, wVar, s8Var);
        }
    }
}
