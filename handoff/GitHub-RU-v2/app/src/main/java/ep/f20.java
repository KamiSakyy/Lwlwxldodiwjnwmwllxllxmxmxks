package ep;

import java.util.List;
import java.util.Set;
import jo.mj0;
import jo.oj0;
import jo.pj0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f20 implements aa.a {
    public static final f20 a = new f20();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        oj0 oj0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        pj0 pj0Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            oj0Var = h20.c(eVar, wVar);
        } else {
            oj0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            pj0Var = i20.c(eVar, wVar);
        }
        return new mj0(str, oj0Var, pj0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        mj0 mj0Var = (mj0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mj0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, mj0Var.a);
        oj0 oj0Var = mj0Var.b;
        if (oj0Var != null) {
            h20.d(fVar, wVar, oj0Var);
        }
        pj0 pj0Var = mj0Var.c;
        if (pj0Var != null) {
            i20.d(fVar, wVar, pj0Var);
        }
    }
}
