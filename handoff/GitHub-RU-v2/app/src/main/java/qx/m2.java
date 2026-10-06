package qx;

import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m2 implements aa.a {
    public static final m2 a = new m2();
    public static final List b = sy.d0Shadow.o("getsParticipatingWeb", "getsWatchingWeb");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        Boolean bool2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "getsParticipatingWeb");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new k2(booleanValue, bool2.booleanValue());
        }
        k41.b.B(eVar, "getsWatchingWeb");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k2 k2Var = (k2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k2Var, "value");
        fVar.z0("getsParticipatingWeb");
        aa.b bVar = aa.c.f;
        f4.C(k2Var.a, bVar, fVar, wVar, "getsWatchingWeb");
        bVar.b(fVar, wVar, Boolean.valueOf(k2Var.b));
    }
}
