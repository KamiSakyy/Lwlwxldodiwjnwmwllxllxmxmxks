package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ea implements aa.a {
    public static final ea a = new ea();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        ss.a c = ss.b.c(eVar, wVar);
        if (str != null) {
            return new jo.ef(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ef efVar = (jo.ef) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(efVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, efVar.a);
        List list = ss.b.a;
        ss.b.d(fVar, wVar, efVar.b);
    }










}
