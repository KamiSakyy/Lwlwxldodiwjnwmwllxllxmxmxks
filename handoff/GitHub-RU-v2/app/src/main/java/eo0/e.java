package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public class e implements aaShadow.a {
    public static final e a = new e();
    public static final List b = sy.d0Shadow.n("comment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.h hVar = null;
        while (eVar.r0(b) == 0) {
            hVar = (jn0.h) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
        }
        return new jn0.g(hVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.g gVar = (jn0.g) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("comment");
        aa.c.b(aa.c.c(f.a, true)).b(fVar, wVar, gVar.a);
    }
}
