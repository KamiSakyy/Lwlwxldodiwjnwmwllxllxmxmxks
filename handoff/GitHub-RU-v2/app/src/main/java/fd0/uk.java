package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uk implements aaShadow.a {
    public static final uk a = new uk();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.hu huVar = null;
        while (eVar.r0(b) == 0) {
            huVar = (kc0.hu) aa.c.b(aa.c.c(wk.a, true)).a(eVar, wVar);
        }
        return new kc0.fu(huVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.fu fuVar = (kc0.fu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fuVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(wk.a, true)).b(fVar, wVar, fuVar.a);
    }
}
