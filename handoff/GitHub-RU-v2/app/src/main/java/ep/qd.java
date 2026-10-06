package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qd implements aaShadow.a {
    public static final qd a = new qd();
    public static final List b = sy.d0Shadow.o("__typename", "activeLockReason");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        m10.kk kkVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                kkVar = (m10.kk) aa.c.b(n10Shadow.b.h).a(eVar, wVar);
            }
        }
        eVar.s0();
        tt.h hVar = tt.h.a;
        tt.e c = tt.h.c(eVar, wVar);
        if (str != null) {
            return new jo.zj(str, kkVar, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.zj zjVar = (jo.zj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zjVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, zjVar.a);
        fVar.z0("activeLockReason");
        aa.c.b(n10Shadow.b.h).b(fVar, wVar, zjVar.b);
        tt.h hVar = tt.h.a;
        tt.h.d(fVar, wVar, zjVar.c);
    }
}
