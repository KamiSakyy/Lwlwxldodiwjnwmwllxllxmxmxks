package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qe implements aaShadow.a {
    public static final qe a = new qe();
    public static final List b = sy.d0.n("success");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.k.a(eVar, wVar);
        }
        return new jo.rl(bool);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.rl rlVar = (jo.rl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rlVar, "value");
        fVar.z0("success");
        aa.c.k.b(fVar, wVar, rlVar.a);
    }
}
