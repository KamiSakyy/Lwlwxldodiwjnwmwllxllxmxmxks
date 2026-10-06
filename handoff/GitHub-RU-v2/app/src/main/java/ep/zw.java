package ep;

import java.util.List;
import jo.kb0;
import jo.mb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zw implements aaShadow.a {
    public static final zw a = new zw();
    public static final List b = sy.d0Shadow.n("unminimizeComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        mb0 mb0Var = null;
        while (eVar.r0(b) == 0) {
            mb0Var = (mb0) aa.c.b(aa.c.c(bx.a, false)).a(eVar, wVar);
        }
        return new kb0(mb0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kb0 kb0Var = (kb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kb0Var, "value");
        fVar.z0("unminimizeComment");
        aa.c.b(aa.c.c(bx.a, false)).b(fVar, wVar, kb0Var.a);
    }
}
