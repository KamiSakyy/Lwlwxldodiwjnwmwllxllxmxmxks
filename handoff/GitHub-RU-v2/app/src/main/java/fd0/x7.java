package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x7 implements aaShadow.a {
    public static final x7 a = new x7();
    public static final List b = sy.d0.n("pullRequestReview");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.yb ybVar = null;
        while (eVar.r0(b) == 0) {
            ybVar = (kc0.yb) aa.c.b(aa.c.c(z7.a, true)).a(eVar, wVar);
        }
        return new kc0.wb(ybVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.wb wbVar = (kc0.wb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wbVar, "value");
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(z7.a, true)).b(fVar, wVar, wbVar.a);
    }
}
