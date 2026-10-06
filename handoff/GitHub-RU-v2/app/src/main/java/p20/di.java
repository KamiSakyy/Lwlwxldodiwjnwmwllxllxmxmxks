package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class di implements aaShadow.a {
    public static final di a = new di();
    public static final List b = sy.d0Shadow.o("subject", "reaction");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.kq kqVar = null;
        u10.iq iqVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                kqVar = (u10.kq) aa.c.b(aa.c.c(ei.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new u10.jq(kqVar, iqVar);
                }
                iqVar = (u10.iq) aa.c.b(aa.c.c(ci.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.jq jqVar = (u10.jq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jqVar, "value");
        fVar.z0("subject");
        aa.c.b(aa.c.c(ei.a, true)).b(fVar, wVar, jqVar.a);
        fVar.z0("reaction");
        aa.c.b(aa.c.c(ci.a, false)).b(fVar, wVar, jqVar.b);
    }
}
