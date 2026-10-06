package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dd implements aaShadow.a {
    public static final dd a = new dd();
    public static final List b = sy.d0Shadow.o("actor", "pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.pj pjVar = null;
        u10.vj vjVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                pjVar = (u10.pj) aa.c.b(aa.c.c(ad.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new u10.tj(pjVar, vjVar);
                }
                vjVar = (u10.vj) aa.c.b(aa.c.c(fd.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.tj tjVar = (u10.tj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tjVar, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(ad.a, true)).b(fVar, wVar, tjVar.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(fd.a, true)).b(fVar, wVar, tjVar.b);
    }
}
