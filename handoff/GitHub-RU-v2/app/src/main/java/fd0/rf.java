package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rf implements aaShadow.a {
    public static final rf a = new rf();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.mn mnVar = null;
        while (eVar.r0(b) == 0) {
            mnVar = (kc0.mn) aa.c.b(aa.c.c(vf.a, false)).a(eVar, wVar);
        }
        return new kc0.in(mnVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.in inVar = (kc0.in) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(inVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(vf.a, false)).b(fVar, wVar, inVar.a);
    }
}
