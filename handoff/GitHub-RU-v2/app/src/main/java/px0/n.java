package px0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n implements aa.a {
    public static final List a = sy.d0Shadow.n("id");

    public static ox0.o c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new ox0.o(str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, ox0.o oVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, oVar.a);
    }
}
