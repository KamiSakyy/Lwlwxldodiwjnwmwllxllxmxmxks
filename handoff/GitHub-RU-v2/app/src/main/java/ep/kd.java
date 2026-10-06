package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kd implements aaShadow.a {
    public static final kd a = new kd();
    public static final List b = sy.d0.o("clientMutationId", "copilot", "copilotProPlus", "viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.pj pjVar = null;
        jo.qj qjVar = null;
        jo.tj tjVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                pjVar = (jo.pj) aa.c.b(aa.c.c(id.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                qjVar = (jo.qj) aa.c.b(aa.c.c(jd.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    return new jo.rj(str, pjVar, qjVar, tjVar);
                }
                tjVar = (jo.tj) aa.c.b(aa.c.c(md.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.rj rjVar = (jo.rj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rjVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, rjVar.a);
        fVar.z0("copilot");
        aa.c.b(aa.c.c(id.a, false)).b(fVar, wVar, rjVar.b);
        fVar.z0("copilotProPlus");
        aa.c.b(aa.c.c(jd.a, false)).b(fVar, wVar, rjVar.c);
        fVar.z0("viewer");
        aa.c.b(aa.c.c(md.a, false)).b(fVar, wVar, rjVar.d);
    }
}
