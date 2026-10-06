package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class sf implements aaShadow.a {
    public static final List a = sy.d0.n("mentionableUsers");

    public static jo.gn c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.dn dnVar = null;
        while (eVar.r0(a) == 0) {
            dnVar = (jo.dn) aa.c.c(pf.a, false).a(eVar, wVar);
        }
        if (dnVar != null) {
            return new jo.gn(dnVar);
        }
        k41.b.B(eVar, "mentionableUsers");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.gn gnVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gnVar, "value");
        fVar.z0("mentionableUsers");
        aa.c.c(pf.a, false).b(fVar, wVar, gnVar.a);
    }
}
