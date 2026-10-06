package xz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r implements aa.a {
    public static final r a = new r();
    public static final List b = sy.d0Shadow.o("__typename", "item");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        m mVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                mVar = (m) aa.c.b(aa.c.c(q.a, true)).a(eVar, wVar);
            }
        }
        eVar.s0();
        f00.b0 c = f00.c0.c(eVar, wVar);
        if (str != null) {
            return new n(str, mVar, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n nVar = (n) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, nVar.a);
        fVar.z0("item");
        aa.c.b(aa.c.c(q.a, true)).b(fVar, wVar, nVar.b);
        List list = f00.c0.a;
        f00.c0.d(fVar, wVar, nVar.c);
    }
}
