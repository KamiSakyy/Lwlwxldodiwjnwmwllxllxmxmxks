package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ii implements aaShadow.a {
    public static final ii a = new ii();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.tq tqVar = null;
        while (eVar.r0(b) == 0) {
            tqVar = (kc0.tq) aa.c.b(aa.c.c(li.a, true)).a(eVar, wVar);
        }
        return new kc0.qq(tqVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.qq qqVar = (kc0.qq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qqVar, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(li.a, true)).b(fVar, wVar, qqVar.a);
    }
}
