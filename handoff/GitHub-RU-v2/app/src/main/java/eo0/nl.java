package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nl implements aa.a {
    public static final nl a = new nl();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

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
        ap0.z3 c = ap0.l4.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jn0.ev(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ev evVar = (jn0.ev) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(evVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, evVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, evVar.b);
        List list = ap0.l4.a;
        ap0.z3 z3Var = evVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z3Var, "value");
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, z3Var.a);
        fVar.z0("databaseId");
        aa.c.b(ro0.a.a).b(fVar, wVar, z3Var.b);
        fVar.z0("gitObject");
        aa.c.b(aa.c.c(ap0.c4.a, true)).b(fVar, wVar, z3Var.c);
        fVar.z0("viewerCanPush");
        aa.b bVar3 = aa.c.f;
        jo.f4.C(z3Var.d, bVar3, fVar, wVar, "ref");
        aa.c.b(aa.c.c(ap0.k4.a, false)).b(fVar, wVar, z3Var.e);
        fVar.z0("owner");
        aa.c.c(ap0.j4.a, false).b(fVar, wVar, z3Var.f);
        fVar.z0("isInOrganization");
        jo.f4.C(z3Var.g, bVar3, fVar, wVar, "__typename");
        bVar2.b(fVar, wVar, z3Var.h);
    }
}
