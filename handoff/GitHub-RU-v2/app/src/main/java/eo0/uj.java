package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uj implements aa.a {
    public static final uj a = new uj();
    public static final List b = sy.d0.n("isValid");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new jn0.qs(bool.booleanValue());
        }
        k41.b.B(eVar, "isValid");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.qs qsVar = (jn0.qs) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qsVar, "value");
        fVar.z0("isValid");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(qsVar.a));
    }
}
