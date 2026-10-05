package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vm implements aa.a {
    public static final vm a = new vm();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        cq.v4 c = cq.h5.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jo.bx(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.bx bxVar = (jo.bx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bxVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, bxVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, bxVar.b);
        List list = cq.h5.a;
        cq.v4 v4Var = bxVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v4Var, "value");
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, v4Var.a);
        fVar.z0("databaseId");
        aa.c.b(tp.a.a).b(fVar, wVar, v4Var.b);
        fVar.z0("gitObject");
        aa.c.b(aa.c.c(cq.y4.a, true)).b(fVar, wVar, v4Var.c);
        fVar.z0("viewerCanPush");
        aa.b bVar3 = aa.c.f;
        jo.f4.C(v4Var.d, bVar3, fVar, wVar, "ref");
        aa.c.b(aa.c.c(cq.g5.a, false)).b(fVar, wVar, v4Var.e);
        fVar.z0("owner");
        aa.c.c(cq.f5.a, false).b(fVar, wVar, v4Var.f);
        fVar.z0("isInOrganization");
        jo.f4.C(v4Var.g, bVar3, fVar, wVar, "__typename");
        bVar2.b(fVar, wVar, v4Var.h);
    }
}
