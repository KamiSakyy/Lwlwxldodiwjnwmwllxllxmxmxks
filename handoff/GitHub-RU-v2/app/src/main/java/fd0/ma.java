package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ma implements aa.a {
    public static final ma a = new ma();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        bn0.e c = bn0.f.c(eVar, wVar);
        if (str != null) {
            return new kc0.qf(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.qf qfVar = (kc0.qf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qfVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, qfVar.a);
        List list = bn0.f.a;
        bn0.f.d(fVar, wVar, qfVar.b);
    }
}
