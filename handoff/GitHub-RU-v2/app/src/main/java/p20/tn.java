package p20;

import java.util.List;
import u10.ry;
import u10.ty;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tn implements aaShadow.a {
    public static final tn a = new tn();
    public static final List b = sy.d0Shadow.n("setLabelsForLabelable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ty tyVar = null;
        while (eVar.r0(b) == 0) {
            tyVar = (ty) aa.c.b(aa.c.c(vn.a, false)).a(eVar, wVar);
        }
        return new ry(tyVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ry ryVar = (ry) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ryVar, "value");
        fVar.z0("setLabelsForLabelable");
        aa.c.b(aa.c.c(vn.a, false)).b(fVar, wVar, ryVar.a);
    }
}
