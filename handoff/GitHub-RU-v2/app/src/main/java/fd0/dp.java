package fd0;

import java.util.List;
import kc0.j00;
import kc0.m00;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dp implements aa.a {
    public static final dp a = new dp();
    public static final List b = sy.d0.n("assignable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j00 j00Var = null;
        while (eVar.r0(b) == 0) {
            j00Var = (j00) aa.c.b(aa.c.c(bp.a, true)).a(eVar, wVar);
        }
        return new m00(j00Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m00 m00Var = (m00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m00Var, "value");
        fVar.z0("assignable");
        aa.c.b(aa.c.c(bp.a, true)).b(fVar, wVar, m00Var.a);
    }
}
