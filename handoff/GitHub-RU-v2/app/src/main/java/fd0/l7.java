package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l7 implements aaShadow.a {
    public static final l7 a = new l7();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.fb fbVar = null;
        while (eVar.r0(b) == 0) {
            fbVar = (kc0.fb) aa.c.b(aa.c.c(m7.a, true)).a(eVar, wVar);
        }
        return new kc0.eb(fbVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.eb ebVar = (kc0.eb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ebVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(m7.a, true)).b(fVar, wVar, ebVar.a);
    }
}
