package c30;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h0 implements aa.a {
    public static final List a = sy.d0Shadow.n("textFieldFileLines");

    public static t c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(a) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(m0.a, true)))).a(eVar, wVar);
        }
        return new t(list);
    }

    public static void d(ea.f fVar, aa.w wVar, t tVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tVar, "value");
        fVar.z0("textFieldFileLines");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(m0.a, true)))).b(fVar, wVar, tVar.a);
    }
}
