package p20;

import java.util.List;
import java.util.Set;
import u10.q00;
import u10.s00;
import u10.v00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dp implements aaShadow.a {
    public static final dp a = new dp();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        s00 s00Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        v00 v00Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            s00Var = fp.c(eVar, wVar);
        } else {
            s00Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            v00Var = ip.c(eVar, wVar);
        }
        return new q00(str, s00Var, v00Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q00 q00Var = (q00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q00Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, q00Var.a);
        s00 s00Var = q00Var.b;
        if (s00Var != null) {
            fp.d(fVar, wVar, s00Var);
        }
        v00 v00Var = q00Var.c;
        if (v00Var != null) {
            ip.d(fVar, wVar, v00Var);
        }
    }
}
