package fd0;

import java.util.List;
import kc0.l00;
import kc0.m00;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cp implements aaShadow.a {
    public static final cp a = new cp();
    public static final List b = sy.d0.n("replaceAssigneesForAssignable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m00 m00Var = null;
        while (eVar.r0(b) == 0) {
            m00Var = (m00) aa.c.b(aa.c.c(dp.a, false)).a(eVar, wVar);
        }
        return new l00(m00Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l00 l00Var = (l00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l00Var, "value");
        fVar.z0("replaceAssigneesForAssignable");
        aa.c.b(aa.c.c(dp.a, false)).b(fVar, wVar, l00Var.a);
    }
}
