package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ac implements aa.a {
    public static final ac a = new ac();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        hz0.e c = hz0.f.c(eVar, wVar);
        if (str != null) {
            return new jn0.sh(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.sh shVar = (jn0.sh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(shVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, shVar.a);
        List list = hz0.f.a;
        hz0.f.d(fVar, wVar, shVar.b);
    }
}
