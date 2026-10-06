package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tj implements aaShadow.a {
    public static final tj a = new tj();
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
        sd0.h0 c = sd0.t0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new kc0.ts(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ts tsVar = (kc0.ts) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tsVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, tsVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, tsVar.b);
        List list = sd0.t0.a;
        sd0.h0 h0Var = tsVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h0Var, "value");
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, h0Var.a);
        fVar.z0("databaseId");
        aa.c.b(od0.b.a).b(fVar, wVar, h0Var.b);
        fVar.z0("gitObject");
        aa.c.b(aa.c.c(sd0.k0.a, true)).b(fVar, wVar, h0Var.c);
        fVar.z0("viewerCanPush");
        aa.b bVar3 = aa.c.f;
        jo.f4.C(h0Var.d, bVar3, fVar, wVar, "ref");
        aa.c.b(aa.c.c(sd0.s0.a, false)).b(fVar, wVar, h0Var.e);
        fVar.z0("owner");
        aa.c.c(sd0.r0.a, false).b(fVar, wVar, h0Var.f);
        fVar.z0("isInOrganization");
        jo.f4.C(h0Var.g, bVar3, fVar, wVar, "__typename");
        bVar2.b(fVar, wVar, h0Var.h);
    }
}
