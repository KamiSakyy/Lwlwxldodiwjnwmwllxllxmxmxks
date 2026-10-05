package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class eb implements aa.a {
    public static final eb a = new eb();
    public static final List b = sy.d0.o("clientMutationId", "pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.qg qgVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new u10.og(str, qgVar);
                }
                qgVar = (u10.qg) aa.c.b(aa.c.c(gb.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.og ogVar = (u10.og) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ogVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, ogVar.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(gb.a, false)).b(fVar, wVar, ogVar.b);
    }
}
