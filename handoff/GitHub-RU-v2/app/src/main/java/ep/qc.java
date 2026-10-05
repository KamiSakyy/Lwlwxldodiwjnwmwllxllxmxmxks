package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qc implements aa.a {
    public static final qc a = new qc();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        e10.e c = e10.f.c(eVar, wVar);
        if (str != null) {
            return new jo.pi(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.pi piVar = (jo.pi) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(piVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, piVar.a);
        List list = e10.f.a;
        e10.f.d(fVar, wVar, piVar.b);
    }
}
