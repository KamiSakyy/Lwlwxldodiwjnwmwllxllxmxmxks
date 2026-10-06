package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yl implements aaShadow.a {
    public static final yl a = new yl();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.xv xvVar = null;
        while (eVar.r0(b) == 0) {
            xvVar = (kc0.xv) aa.c.b(aa.c.c(cm.a, false)).a(eVar, wVar);
        }
        return new kc0.tv(xvVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.tv tvVar = (kc0.tv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tvVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(cm.a, false)).b(fVar, wVar, tvVar.a);
    }
}
