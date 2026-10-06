package eo0;

import java.util.List;
import jn0.e40;
import jn0.g40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zr implements aaShadow.a {
    public static final zr a = new zr();
    public static final List b = sy.d0.n("setLabelsForLabelable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        g40 g40Var = null;
        while (eVar.r0(b) == 0) {
            g40Var = (g40) aa.c.b(aa.c.c(bs.a, false)).a(eVar, wVar);
        }
        return new e40(g40Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e40 e40Var = (e40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e40Var, "value");
        fVar.z0("setLabelsForLabelable");
        aa.c.b(aa.c.c(bs.a, false)).b(fVar, wVar, e40Var.a);
    }
}
