package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fc implements aa.a {
    public static final fc a = new fc();
    public static final List b = sy.d0.n("success");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.k.a(eVar, wVar);
        }
        return new kc0.bi(bool);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.bi biVar = (kc0.bi) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(biVar, "value");
        fVar.z0("success");
        aa.c.k.b(fVar, wVar, biVar.a);
    }
}
