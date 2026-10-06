package ep;

import java.util.List;
import jo.e60;
import jo.g60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ltShadow implements aaShadow.a {
    public static final ltShadow a = new ltShadow();
    public static final List b = sy.d0.n("setLabelsForLabelable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        g60 g60Var = null;
        while (eVar.r0(b) == 0) {
            g60Var = (g60) aa.c.b(aa.c.c(nt.a, false)).a(eVar, wVar);
        }
        return new e60(g60Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e60 e60Var = (e60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e60Var, "value");
        fVar.z0("setLabelsForLabelable");
        aa.c.b(aa.c.c(nt.a, false)).b(fVar, wVar, e60Var.a);
    }
}
