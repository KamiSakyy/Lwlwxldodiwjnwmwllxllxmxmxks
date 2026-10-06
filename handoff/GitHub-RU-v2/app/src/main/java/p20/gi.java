package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gi implements aaShadow.a {
    public static final gi a = new gi();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new u10.oq(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.oq oqVar = (u10.oq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oqVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, oqVar.a);
    }
}
