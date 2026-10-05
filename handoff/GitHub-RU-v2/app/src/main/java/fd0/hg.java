package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hg implements aa.a {
    public static final hg a = new hg();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        qf0.a c = qf0.b.c(eVar, wVar);
        if (str != null) {
            return new kc0.fo(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.fo foVar = (kc0.fo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(foVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, foVar.a);
        List list = qf0.b.a;
        qf0.b.d(fVar, wVar, foVar.b);
    }
}
