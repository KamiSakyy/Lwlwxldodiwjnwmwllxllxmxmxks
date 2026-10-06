package ep;

import java.util.List;
import jo.mb0;
import jo.nb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bx implements aaShadow.a {
    public static final bx a = new bx();
    public static final List b = sy.d0.n("unminimizedComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        nb0 nb0Var = null;
        while (eVar.r0(b) == 0) {
            nb0Var = (nb0) aa.c.b(aa.c.c(cx.a, true)).a(eVar, wVar);
        }
        return new mb0(nb0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        mb0 mb0Var = (mb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mb0Var, "value");
        fVar.z0("unminimizedComment");
        aa.c.b(aa.c.c(cx.a, true)).b(fVar, wVar, mb0Var.a);
    }
}
