package fd0;

import java.util.List;
import kc0.my;
import kc0.oy;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qn implements aaShadow.a {
    public static final qn a = new qn();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        oy oyVar = null;
        while (eVar.r0(b) == 0) {
            oyVar = (oy) aa.c.b(aa.c.c(sn.a, false)).a(eVar, wVar);
        }
        return new my(oyVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        my myVar = (my) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(myVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(sn.a, false)).b(fVar, wVar, myVar.a);
    }
}
