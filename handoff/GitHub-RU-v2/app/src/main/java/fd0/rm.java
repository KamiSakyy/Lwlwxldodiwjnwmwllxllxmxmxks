package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rm implements aaShadow.a {
    public static final rm a = new rm();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ax axVar = null;
        while (eVar.r0(b) == 0) {
            axVar = (kc0.ax) aa.c.b(aa.c.c(vm.a, false)).a(eVar, wVar);
        }
        return new kc0.ww(axVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ww wwVar = (kc0.ww) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wwVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(vm.a, false)).b(fVar, wVar, wwVar.a);
    }
}
