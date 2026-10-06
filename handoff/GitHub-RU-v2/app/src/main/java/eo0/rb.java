package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rb implements aaShadow.a {
    public static final rb a = new rb();
    public static final List b = sy.d0Shadow.n("__typename");

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
            return new jn0.hh(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.hh hhVar = (jn0.hh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hhVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, hhVar.a);
        List list = hz0.f.a;
        hz0.f.d(fVar, wVar, hhVar.b);
    }
}
