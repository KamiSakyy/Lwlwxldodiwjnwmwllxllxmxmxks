package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x6 implements aaShadow.a {
    public static final x6 a = new x6();
    public static final List b = sy.d0.n("id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new u10.ia(str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ia iaVar = (u10.ia) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iaVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, iaVar.a);
    }
}
