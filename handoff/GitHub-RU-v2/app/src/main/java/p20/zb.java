package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zb implements aa.a {
    public static final zb a = new zb();
    public static final List b = sy.d0.n("success");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.k.a(eVar, wVar);
        }
        return new u10.bi(bool);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.bi biVar = (u10.bi) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(biVar, "value");
        fVar.z0("success");
        aa.c.k.b(fVar, wVar, biVar.a);
    }
}
