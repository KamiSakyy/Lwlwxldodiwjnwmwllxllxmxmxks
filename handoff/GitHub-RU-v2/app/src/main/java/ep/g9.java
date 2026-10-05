package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g9 implements aa.a {
    public static final g9 a = new g9();
    public static final List b = sy.d0.o("actor", "pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.rd rdVar = null;
        jo.vd vdVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                rdVar = (jo.rd) aa.c.b(aa.c.c(e9.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jo.ud(rdVar, vdVar);
                }
                vdVar = (jo.vd) aa.c.b(aa.c.c(h9.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ud udVar = (jo.ud) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(udVar, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(e9.a, true)).b(fVar, wVar, udVar.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(h9.a, true)).b(fVar, wVar, udVar.b);
    }
}
