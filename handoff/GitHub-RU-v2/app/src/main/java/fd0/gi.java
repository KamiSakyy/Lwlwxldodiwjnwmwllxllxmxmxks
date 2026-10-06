package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gi implements aaShadow.a {
    public static final gi a = new gi();
    public static final List b = sy.d0Shadow.n("isValid");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new kc0.oq(bool.booleanValue());
        }
        k41.b.B(eVar, "isValid");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.oq oqVar = (kc0.oq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oqVar, "value");
        fVar.z0("isValid");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(oqVar.a));
    }
}
