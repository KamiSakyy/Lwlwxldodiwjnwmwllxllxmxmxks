package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pd implements aa.a {
    public static final pd a = new pd();
    public static final List b = sy.d0.o("actor", "lockedRecord");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.vj vjVar = null;
        jo.zj zjVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                vjVar = (jo.vj) aa.c.b(aa.c.c(nd.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jo.yj(vjVar, zjVar);
                }
                zjVar = (jo.zj) aa.c.b(aa.c.c(qd.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.yj yjVar = (jo.yj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yjVar, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(nd.a, true)).b(fVar, wVar, yjVar.a);
        fVar.z0("lockedRecord");
        aa.c.b(aa.c.c(qd.a, true)).b(fVar, wVar, yjVar.b);
    }
}
