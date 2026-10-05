package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class va implements aa.a {
    public static final va a = new va();
    public static final List b = sy.d0.o("actor", "lockedRecord");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.yf yfVar = null;
        u10.cg cgVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                yfVar = (u10.yf) aa.c.b(aa.c.c(ta.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new u10.bg(yfVar, cgVar);
                }
                cgVar = (u10.cg) aa.c.b(aa.c.c(wa.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.bg bgVar = (u10.bg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bgVar, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(ta.a, true)).b(fVar, wVar, bgVar.a);
        fVar.z0("lockedRecord");
        aa.c.b(aa.c.c(wa.a, true)).b(fVar, wVar, bgVar.b);
    }
}
