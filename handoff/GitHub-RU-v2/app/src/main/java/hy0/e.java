package hy0;

import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public class e implements aa.a {
    public static final e a = new e();
    public static final List b = d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        iy0.w wVar2 = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"ProjectV2Field", "ProjectV2IterationField", "ProjectV2SingleSelectField"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            wVar2 = iy0.xShadow.c(eVar, wVar);
        }
        return new gy0.f(str, wVar2);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        gy0.f fVar2 = (gy0.f) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, fVar2.a);
        iy0.w wVar2 = fVar2.b;
        if (wVar2 != null) {
            iy0.xShadow.d(fVar, wVar, wVar2);
        }
    }
}
