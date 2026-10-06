package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zh implements aaShadow.a {
    public static final zh a = new zh();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new u10.dq(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.dq dqVar = (u10.dq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dqVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, dqVar.a);
    }
}
