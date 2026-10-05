package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class x implements aa.a {
    public static final List a = sy.d0.n("__typename");

    public static r c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new r(str);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, r rVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, rVar.a);
    }
}
