package c20;

import b20.o2;
import b20.p2;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r1 implements aa.a {
    public static final r1 a = new r1();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p2 p2Var = null;
        while (eVar.r0(b) == 0) {
            p2Var = (p2) aa.c.b(aa.c.c(s1.a, false)).a(eVar, wVar);
        }
        return new o2(p2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o2 o2Var = (o2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o2Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(s1.a, false)).b(fVar, wVar, o2Var.a);
    }
}
