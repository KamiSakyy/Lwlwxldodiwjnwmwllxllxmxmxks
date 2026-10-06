package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ne implements aaShadow.a {
    public static final ne a = new ne();
    public static final List b = sy.d0Shadow.n("deleteSavedNotificationThread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.nl nlVar = null;
        while (eVar.r0(b) == 0) {
            nlVar = (jo.nl) aa.c.b(aa.c.c(oe.a, false)).a(eVar, wVar);
        }
        return new jo.ml(nlVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ml mlVar = (jo.ml) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mlVar, "value");
        fVar.z0("deleteSavedNotificationThread");
        aa.c.b(aa.c.c(oe.a, false)).b(fVar, wVar, mlVar.a);
    }
}
