package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fd implements aaShadow.a {
    public static final fd a = new fd();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        gh0.d c = gh0.e.c(eVar, wVar);
        if (str != null) {
            return new kc0.xj(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.xj xjVar = (kc0.xj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xjVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, xjVar.a);
        List list = gh0.e.a;
        gh0.e.d(fVar, wVar, xjVar.b);
    }
}
