package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class kl implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("contributors");

    public static jn0.zu c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.vu vuVar = null;
        while (eVar.r0(a) == 0) {
            vuVar = (jn0.vu) aa.c.c(gl.a, false).a(eVar, wVar);
        }
        if (vuVar != null) {
            return new jn0.zu(vuVar);
        }
        k41.b.B(eVar, "contributors");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.zu zuVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zuVar, "value");
        fVar.z0("contributors");
        aa.c.c(gl.a, false).b(fVar, wVar, zuVar.a);
    }
}
