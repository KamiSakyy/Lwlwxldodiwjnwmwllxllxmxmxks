package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nc implements aaShadow.a {
    public static final nc a = new nc();
    public static final List b = sy.d0Shadow.n("success");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.k.a(eVar, wVar);
        }
        return new kc0.ri(bool);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ri riVar = (kc0.ri) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(riVar, "value");
        fVar.z0("success");
        aa.c.k.b(fVar, wVar, riVar.a);
    }
}
