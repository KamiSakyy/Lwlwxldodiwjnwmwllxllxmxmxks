package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gm implements aaShadow.a {
    public static final gm a = new gm();
    public static final List b = sy.d0Shadow.o("issue", "subIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.bw bwVar = null;
        jo.fw fwVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bwVar = (jo.bw) aa.c.b(aa.c.c(dm.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jo.ew(bwVar, fwVar);
                }
                fwVar = (jo.fw) aa.c.b(aa.c.c(hm.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ew ewVar = (jo.ew) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ewVar, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(dm.a, true)).b(fVar, wVar, ewVar.a);
        fVar.z0("subIssue");
        aa.c.b(aa.c.c(hm.a, false)).b(fVar, wVar, ewVar.b);
    }
}
