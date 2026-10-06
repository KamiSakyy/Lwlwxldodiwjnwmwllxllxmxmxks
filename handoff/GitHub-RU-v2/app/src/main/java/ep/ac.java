package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ac implements aaShadow.a {
    public static final ac a = new ac();
    public static final List b = sy.d0.n("followUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.uh uhVar = null;
        while (eVar.r0(b) == 0) {
            uhVar = (jo.uh) aa.c.b(aa.c.c(bc.a, false)).a(eVar, wVar);
        }
        return new jo.th(uhVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.th thVar = (jo.th) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(thVar, "value");
        fVar.z0("followUser");
        aa.c.b(aa.c.c(bc.a, false)).b(fVar, wVar, thVar.a);
    }
}
