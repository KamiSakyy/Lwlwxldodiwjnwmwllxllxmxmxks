package ep;

import java.util.List;
import jo.oe0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cz implements aa.a {
    public static final cz a = new cz();
    public static final List b = sy.d0.n("viewerCanPush");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new oe0(bool.booleanValue());
        }
        k41.b.B(eVar, "viewerCanPush");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        oe0 oe0Var = (oe0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oe0Var, "value");
        fVar.z0("viewerCanPush");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(oe0Var.a));
    }
}
