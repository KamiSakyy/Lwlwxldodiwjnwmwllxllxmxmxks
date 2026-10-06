package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j7 implements aa.a {
    public static final j7 a = new j7();
    public static final List b = sy.d0Shadow.n("viewerCanPush");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new w5(bool.booleanValue());
        }
        k41.b.B(eVar, "viewerCanPush");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w5 w5Var = (w5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w5Var, "value");
        fVar.z0("viewerCanPush");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(w5Var.a));
    }
}
