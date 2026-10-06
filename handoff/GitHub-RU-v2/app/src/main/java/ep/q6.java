package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q6 implements aa.a {
    public static final q6 a = new q6();
    public static final List b = sy.d0.n("success");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.k.a(eVar, wVar);
        }
        return new jo.aaShadow(bool);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.aaShadow aaVar = (jo.aaShadow) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aaVar, "value");
        fVar.z0("success");
        aa.c.k.b(fVar, wVar, aaVar.a);
    }
}
