package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tl implements aaShadow.a {
    public static final tl a = new tl();
    public static final List b = sy.d0Shadow.n("gitUrl");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new jn0.mv(str);
        }
        k41.b.B(eVar, "gitUrl");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.mv mvVar = (jn0.mv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mvVar, "value");
        fVar.z0("gitUrl");
        aa.c.a.b(fVar, wVar, mvVar.a);
    }
}
