package g40;

import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 implements aa.a {
    public static final l0 a = new l0();
    public static final List b = sy.d0Shadow.o("path", "isGenerated", "submodule", "fileType");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        xShadow xVar = null;
        g gVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                xVar = (xShadow) aa.c.b(aa.c.c(a1.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                gVar = (g) aa.c.b(aa.c.c(j0.a, true)).a(eVar, wVar);
            }
        }
        if (bool != null) {
            return new i(str, bool.booleanValue(), xVar, gVar);
        }
        k41.b.B(eVar, "isGenerated");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i iVar = (i) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("path");
        aa.c.i.b(fVar, wVar, iVar.a);
        fVar.z0("isGenerated");
        f4.C(iVar.b, aa.c.f, fVar, wVar, "submodule");
        aa.c.b(aa.c.c(a1.a, false)).b(fVar, wVar, iVar.c);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(j0.a, true)).b(fVar, wVar, iVar.d);
    }
}
