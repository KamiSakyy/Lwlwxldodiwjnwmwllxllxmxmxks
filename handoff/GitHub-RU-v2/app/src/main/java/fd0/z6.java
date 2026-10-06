package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z6 implements aaShadow.a {
    public static final z6 a = new z6();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.oa oaVar = null;
        while (eVar.r0(b) == 0) {
            oaVar = (kc0.oa) aa.c.b(aa.c.c(b7.a, true)).a(eVar, wVar);
        }
        return new kc0.ma(oaVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ma maVar = (kc0.ma) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(maVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(b7.a, true)).b(fVar, wVar, maVar.a);
    }
}
