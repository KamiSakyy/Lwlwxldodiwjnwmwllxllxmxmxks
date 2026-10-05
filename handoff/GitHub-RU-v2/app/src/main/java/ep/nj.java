package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nj implements aa.a {
    public static final nj a = new nj();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        cq.l7 l7Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            l7Var = cq.t7.c(eVar, wVar);
        }
        return new jo.os(str, l7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.os osVar = (jo.os) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(osVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, osVar.a);
        cq.l7 l7Var = osVar.b;
        if (l7Var != null) {
            cq.t7.d(fVar, wVar, l7Var);
        }
    }
}
