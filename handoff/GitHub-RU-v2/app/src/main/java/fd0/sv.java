package fd0;

import java.util.List;
import kc0.aa0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sv implements aaShadow.a {
    public static final sv a = new sv();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        ek0.f fVar = ek0.f.a;
        ek0.b c = ek0.f.c(eVar, wVar);
        if (str != null) {
            return new aa0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        aa0 aa0Var = (aa0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aa0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, aa0Var.a);
        ek0.f fVar2 = ek0.f.a;
        ek0.f.d(fVar, wVar, aa0Var.b);
    }
}
