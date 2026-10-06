package iy0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a0Shadow implements aa.a {
    public static final List a = sy.d0Shadow.n("sortValues");

    public static z c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(a) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(b0.a, false))).a(eVar, wVar);
        }
        return new z(list);
    }

    public static void d(ea.f fVar, aa.w wVar, z zVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zVar, "value");
        fVar.z0("sortValues");
        aa.c.b(aa.c.a(aa.c.c(b0.a, false))).b(fVar, wVar, zVar.a);
    }
}
