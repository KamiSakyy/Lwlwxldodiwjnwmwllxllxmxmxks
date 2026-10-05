package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sk implements aa.a {
    public static final sk a = new sk();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        e30.a c = e30.b.c(eVar, wVar);
        if (str != null) {
            return new u10.cu(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.cu cuVar = (u10.cu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cuVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, cuVar.a);
        List list = e30.b.a;
        e30.b.d(fVar, wVar, cuVar.b);
    }
}
