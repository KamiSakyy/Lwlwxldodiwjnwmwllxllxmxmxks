package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kq implements aa.a {
    public static final kq a = new kq();
    public static final List b = sy.d0.o("defaultBranchRef", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.r10 r10Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                r10Var = (jo.r10) aa.c.b(aa.c.c(jq.a, true)).a(eVar, wVar);
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
            return new jo.s10(r10Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.s10 s10Var = (jo.s10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s10Var, "value");
        fVar.z0("defaultBranchRef");
        aa.c.b(aa.c.c(jq.a, true)).b(fVar, wVar, s10Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, s10Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, s10Var.c);
    }
}
