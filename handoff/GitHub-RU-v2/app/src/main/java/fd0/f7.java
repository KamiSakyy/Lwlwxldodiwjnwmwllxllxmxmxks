package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f7 implements aaShadow.a {
    public static final f7 a = new f7();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.wa waVar = null;
        while (eVar.r0(b) == 0) {
            waVar = (kc0.wa) aa.c.b(aa.c.c(h7.a, false)).a(eVar, wVar);
        }
        return new kc0.ua(waVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ua uaVar = (kc0.ua) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uaVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(h7.a, false)).b(fVar, wVar, uaVar.a);
    }
}
