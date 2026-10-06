package sc0;

import java.util.List;
import rc0.f2;
import wc0.i2;
import wc0.l2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m1 implements aa.a {
    public static final m1 a = new m1();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        i2 c = l2.c(eVar, wVar);
        if (str != null) {
            return new f2(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f2 f2Var = (f2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f2Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, f2Var.a);
        List list = l2.a;
        l2.d(fVar, wVar, f2Var.b);
    }
}
