package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pd implements aaShadow.a {
    public static final pd a = new pd();
    public static final List b = sy.d0Shadow.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new u10.lk(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.lk lkVar = (u10.lk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lkVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, lkVar.a);
    }
}
