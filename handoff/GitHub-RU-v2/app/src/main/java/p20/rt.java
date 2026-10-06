package p20;

import java.util.List;
import u10.a70;
import u10.b70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rt implements aaShadow.a {
    public static final rt a = new rt();
    public static final List b = sy.d0.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        a70 a70Var = null;
        while (eVar.r0(b) == 0) {
            a70Var = (a70) aa.c.b(aa.c.c(qt.a, false)).a(eVar, wVar);
        }
        return new b70(a70Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b70 b70Var = (b70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b70Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(qt.a, false)).b(fVar, wVar, b70Var.a);
    }
}
