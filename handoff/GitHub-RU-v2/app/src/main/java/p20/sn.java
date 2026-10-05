package p20;

import java.util.List;
import u10.ly;
import u10.oy;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sn implements aa.a {
    public static final sn a = new sn();
    public static final List b = sy.d0.n("assignable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ly lyVar = null;
        while (eVar.r0(b) == 0) {
            lyVar = (ly) aa.c.b(aa.c.c(qn.a, true)).a(eVar, wVar);
        }
        return new oy(lyVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        oy oyVar = (oy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oyVar, "value");
        fVar.z0("assignable");
        aa.c.b(aa.c.c(qn.a, true)).b(fVar, wVar, oyVar.a);
    }
}
