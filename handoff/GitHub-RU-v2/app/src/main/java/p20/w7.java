package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w7 implements aaShadow.a {
    public static final w7 a = new w7();
    public static final List b = sy.d0.o("actor", "pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.sb sbVar = null;
        u10.wb wbVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                sbVar = (u10.sb) aa.c.b(aa.c.c(u7.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new u10.vb(sbVar, wbVar);
                }
                wbVar = (u10.wb) aa.c.b(aa.c.c(x7.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.vb vbVar = (u10.vb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vbVar, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(u7.a, true)).b(fVar, wVar, vbVar.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(x7.a, true)).b(fVar, wVar, vbVar.b);
    }
}
