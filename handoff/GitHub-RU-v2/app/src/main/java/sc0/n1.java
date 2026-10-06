package sc0;

import java.util.List;
import rc0.i2;
import rc0.j2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n1 implements aa.a {
    public static final n1 a = new n1();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        j2 j2Var = null;
        while (eVar.r0(b) == 0) {
            j2Var = (j2) aa.c.b(aa.c.c(o1.a, true)).a(eVar, wVar);
        }
        return new i2(j2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i2 i2Var = (i2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i2Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(o1.a, true)).b(fVar, wVar, i2Var.a);
    }
}
