package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vl implements aaShadow.a {
    public static final vl a = new vl();
    public static final List b = sy.d0Shadow.o("subject", "reaction");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.ov ovVar = null;
        jo.mv mvVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ovVar = (jo.ov) aa.c.b(aa.c.c(wl.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jo.nv(ovVar, mvVar);
                }
                mvVar = (jo.mv) aa.c.b(aa.c.c(ul.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.nv nvVar = (jo.nv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nvVar, "value");
        fVar.z0("subject");
        aa.c.b(aa.c.c(wl.a, true)).b(fVar, wVar, nvVar.a);
        fVar.z0("reaction");
        aa.c.b(aa.c.c(ul.a, false)).b(fVar, wVar, nvVar.b);
    }
}
