package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lc implements aaShadow.a {
    public static final lc a = new lc();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        q60.d c = q60.e.c(eVar, wVar);
        if (str != null) {
            return new u10.vi(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.vi viVar = (u10.vi) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(viVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, viVar.a);
        List list = q60.e.a;
        q60.e.d(fVar, wVar, viVar.b);
    }
}
