package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g9 implements aaShadow.a {
    public static final List a = sy.d0.n("id");

    public static u10.vd c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new u10.vd(str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.vd vdVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vdVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, vdVar.a);
    }
}
