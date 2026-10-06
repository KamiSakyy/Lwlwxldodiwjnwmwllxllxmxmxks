package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lk implements aaShadow.a {
    public static final lk a = new lk();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        eq.c c = eq.d.c(eVar, wVar);
        if (str != null) {
            return new jo.wt(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.wt wtVar = (jo.wt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wtVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, wtVar.a);
        List list = eq.d.a;
        eq.d.d(fVar, wVar, wtVar.b);
    }
}
