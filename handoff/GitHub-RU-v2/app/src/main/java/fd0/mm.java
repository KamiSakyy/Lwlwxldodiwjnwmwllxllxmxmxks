package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mm implements aa.a {
    public static final mm a = new mm();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.tw twVar = null;
        while (eVar.r0(b) == 0) {
            twVar = (kc0.tw) aa.c.b(aa.c.c(qm.a, false)).a(eVar, wVar);
        }
        return new kc0.pw(twVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.pw pwVar = (kc0.pw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pwVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(qm.a, false)).b(fVar, wVar, pwVar.a);
    }
}
