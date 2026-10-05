package gp;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c implements aa.a {
    public static final List a = sy.d0.n("__typename");

    public static fp.e c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        hp.c c = hp.d.c(eVar, wVar);
        if (str != null) {
            return new fp.e(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, fp.e eVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, eVar.a);
        List list = hp.d.a;
        hp.d.d(fVar, wVar, eVar.b);
    }
}
