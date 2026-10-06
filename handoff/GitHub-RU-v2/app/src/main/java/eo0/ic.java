package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ic implements aaShadow.a {
    public static final ic a = new ic();
    public static final List b = sy.d0.n("hasNextPage");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new jn0.ai(bool.booleanValue());
        }
        k41.b.B(eVar, "hasNextPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ai aiVar = (jn0.ai) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aiVar, "value");
        fVar.z0("hasNextPage");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(aiVar.a));
    }
}
