package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o7 implements aa.a {
    public static final o7 a = new o7();
    public static final List b = sy.d0.o("actor", "pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.cb cbVar = null;
        jo.hb hbVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                cbVar = (jo.cb) aa.c.b(aa.c.c(l7.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jo.gb(cbVar, hbVar);
                }
                hbVar = (jo.hb) aa.c.b(aa.c.c(p7.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.gb gbVar = (jo.gb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gbVar, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(l7.a, true)).b(fVar, wVar, gbVar.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(p7.a, false)).b(fVar, wVar, gbVar.b);
    }
}
