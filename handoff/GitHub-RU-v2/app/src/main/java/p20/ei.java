package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ei implements aa.a {
    public static final ei a = new ei();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        i80.e eVar2 = i80.e.a;
        i80.c c = i80.e.c(eVar, wVar);
        if (str != null) {
            return new u10.kq(c, str);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.kq kqVar = (u10.kq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kqVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, kqVar.a);
        i80.e eVar = i80.e.a;
        i80.e.d(fVar, wVar, kqVar.b);
    }
}
