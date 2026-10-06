package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lk implements aaShadow.a {
    public static final lk a = new lk();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        gu0.f fVar = gu0.f.a;
        gu0.c c = gu0.f.c(eVar, wVar);
        if (str != null) {
            return new jn0.ot(c, str);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ot otVar = (jn0.ot) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(otVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, otVar.a);
        gu0.f fVar2 = gu0.f.a;
        gu0.f.d(fVar, wVar, otVar.b);
    }
}
