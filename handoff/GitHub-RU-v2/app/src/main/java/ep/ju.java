package ep;

import java.util.List;
import java.util.Set;
import jo.m70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class juShadow implements aaShadow.a {
    public static final juShadow a = new juShadow();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        qx.c1 c1Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        tu.s sVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            c1Var = qx.d1.c(eVar, wVar);
        } else {
            c1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            sVar = tu.t.c(eVar, wVar);
        }
        return new m70(str, c1Var, sVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m70 m70Var = (m70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m70Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, m70Var.a);
        qx.c1 c1Var = m70Var.b;
        if (c1Var != null) {
            qx.d1.d(fVar, wVar, c1Var);
        }
        tu.s sVar = m70Var.c;
        if (sVar != null) {
            tu.t.d(fVar, wVar, sVar);
        }
    }
}
