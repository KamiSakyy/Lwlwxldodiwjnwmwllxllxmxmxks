package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hj implements aaShadow.a {
    public static final hj a = new hj();
    public static final List b = sy.d0Shadow.n("subject");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.cs csVar = null;
        while (eVar.r0(b) == 0) {
            csVar = (kc0.cs) aa.c.b(aa.c.c(ij.a, true)).a(eVar, wVar);
        }
        return new kc0.bs(csVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.bs bsVar = (kc0.bs) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bsVar, "value");
        fVar.z0("subject");
        aa.c.b(aa.c.c(ij.a, true)).b(fVar, wVar, bsVar.a);
    }
}
