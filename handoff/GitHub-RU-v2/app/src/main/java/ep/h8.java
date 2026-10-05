package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h8 implements aa.a {
    public static final h8 a = new h8();
    public static final List b = sy.d0.n("id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new jo.hc(str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.hc hcVar = (jo.hc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hcVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, hcVar.a);
    }
}
