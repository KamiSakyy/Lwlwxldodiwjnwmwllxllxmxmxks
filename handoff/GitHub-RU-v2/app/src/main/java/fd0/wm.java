package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wm implements aaShadow.a {
    public static final wm a = new wm();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ex exVar = null;
        while (eVar.r0(b) == 0) {
            exVar = (kc0.ex) aa.c.b(aa.c.c(xm.a, false)).a(eVar, wVar);
        }
        return new kc0.dx(exVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.dx dxVar = (kc0.dx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dxVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(xm.a, false)).b(fVar, wVar, dxVar.a);
    }
}
