package k00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements aa.a {
    public static final l a = new l();
    public static final List b = sy.d0Shadow.n("getsCiFailedOnly");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new j00.s(bool.booleanValue());
        }
        k41.b.B(eVar, "getsCiFailedOnly");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00.s sVar = (j00.s) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sVar, "value");
        fVar.z0("getsCiFailedOnly");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(sVar.a));
    }
}
