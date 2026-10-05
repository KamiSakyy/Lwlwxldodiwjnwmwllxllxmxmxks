package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y2 implements aa.a {
    public static final y2 a = new y2();
    public static final List b = sy.d0.n("title");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new w2(str);
        }
        k41.b.B(eVar, "title");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w2 w2Var = (w2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w2Var, "value");
        fVar.z0("title");
        aa.c.a.b(fVar, wVar, w2Var.a);
    }
}
