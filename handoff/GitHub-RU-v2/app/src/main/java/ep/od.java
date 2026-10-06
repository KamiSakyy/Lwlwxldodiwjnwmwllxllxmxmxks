package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class od implements aaShadow.a {
    public static final od a = new od();
    public static final List b = sy.d0.n("lockLockable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.yj yjVar = null;
        while (eVar.r0(b) == 0) {
            yjVar = (jo.yj) aa.c.b(aa.c.c(pd.a, false)).a(eVar, wVar);
        }
        return new jo.xj(yjVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.xj xjVar = (jo.xj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xjVar, "value");
        fVar.z0("lockLockable");
        aa.c.b(aa.c.c(pd.a, false)).b(fVar, wVar, xjVar.a);
    }
}
