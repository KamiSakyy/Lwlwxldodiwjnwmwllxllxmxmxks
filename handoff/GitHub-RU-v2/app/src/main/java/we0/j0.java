package we0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j0 implements aa.a {
    public static final j0 a = new j0();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        o oVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"ImageFileType"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            oVar = r0.c(eVar, wVar);
        }
        return new g(str, oVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g gVar = (g) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, gVar.a);
        o oVar = gVar.b;
        if (oVar != null) {
            List list = r0.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, oVar.a);
        }
    }
}
