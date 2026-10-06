package ny0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements aa.a {
    public static final i a = new i();
    public static final List b = sy.d0Shadow.n("getsCiFailedOnly");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new my0.n(bool.booleanValue());
        }
        k41.b.B(eVar, "getsCiFailedOnly");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        my0.n nVar = (my0.n) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nVar, "value");
        fVar.z0("getsCiFailedOnly");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(nVar.a));
    }
}
