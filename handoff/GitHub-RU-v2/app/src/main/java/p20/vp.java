package p20;

import java.util.List;
import u10.l10;
import u10.m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vp implements aaShadow.a {
    public static final vp a = new vp();
    public static final List b = sy.d0Shadow.n("thread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l10 l10Var = null;
        while (eVar.r0(b) == 0) {
            l10Var = (l10) aa.c.b(aa.c.c(up.a, true)).a(eVar, wVar);
        }
        return new m10(l10Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m10 m10Var = (m10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m10Var, "value");
        fVar.z0("thread");
        aa.c.b(aa.c.c(up.a, true)).b(fVar, wVar, m10Var.a);
    }
}
