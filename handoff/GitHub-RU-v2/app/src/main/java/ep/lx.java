package ep;

import java.util.List;
import jo.cc0;
import jo.dc0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lx implements aa.a {
    public static final lx a = new lx();
    public static final List b = sy.d0.n("updateDiscussionComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        dc0 dc0Var = null;
        while (eVar.r0(b) == 0) {
            dc0Var = (dc0) aa.c.b(aa.c.c(mx.a, false)).a(eVar, wVar);
        }
        return new cc0(dc0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        cc0 cc0Var = (cc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cc0Var, "value");
        fVar.z0("updateDiscussionComment");
        aa.c.b(aa.c.c(mx.a, false)).b(fVar, wVar, cc0Var.a);
    }
}
