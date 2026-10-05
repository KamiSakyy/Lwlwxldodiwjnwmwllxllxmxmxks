package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kh implements aa.a {
    public static final kh a = new kh();
    public static final List b = sy.d0.n("isValid");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new u10.kp(bool.booleanValue());
        }
        k41.b.B(eVar, "isValid");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.kp kpVar = (u10.kp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kpVar, "value");
        fVar.z0("isValid");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(kpVar.a));
    }
}
