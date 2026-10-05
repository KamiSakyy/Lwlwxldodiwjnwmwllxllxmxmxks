package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rq implements aa.a {
    public static final rq a = new rq();
    public static final List b = sy.d0.o("repository", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.j20 j20Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                j20Var = (jo.j20) aa.c.b(aa.c.c(vq.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jo.f20(j20Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.f20 f20Var = (jo.f20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f20Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(vq.a, false)).b(fVar, wVar, f20Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f20Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, f20Var.c);
    }
}
