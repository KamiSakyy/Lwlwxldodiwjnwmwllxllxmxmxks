package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oq implements aa.a {
    public static final oq a = new oq();
    public static final List b = sy.d0.o("id", "gitObject", "ref", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.w10 w10Var = null;
        jo.x10 x10Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                w10Var = (jo.w10) aa.c.b(aa.c.c(mq.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                x10Var = (jo.x10) aa.c.b(aa.c.c(nq.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
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
            return new jo.y10(str, w10Var, x10Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.y10 y10Var = (jo.y10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y10Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, y10Var.a);
        fVar.z0("gitObject");
        aa.c.b(aa.c.c(mq.a, true)).b(fVar, wVar, y10Var.b);
        fVar.z0("ref");
        aa.c.b(aa.c.c(nq.a, false)).b(fVar, wVar, y10Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, y10Var.d);
    }
}
