package p20;

import java.util.List;
import u10.sy;

/* loaded from: /home/user/work/p/classes3.dex */
public final class un implements aa.a {
    public static final un a = new un();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        c60.j c = c60.n.c(eVar, wVar);
        if (str != null) {
            return new sy(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        sy syVar = (sy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(syVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, syVar.a);
        List list = c60.n.a;
        c60.n.d(fVar, wVar, syVar.b);
    }
}
