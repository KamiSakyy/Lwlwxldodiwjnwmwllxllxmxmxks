package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t0 implements aaShadow.a {
    public static final t0 a = new t0();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id", "headRefOid", "pendingReviews"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        kc0.l1 l1Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                l1Var = (kc0.l1) aa.c.b(aa.c.c(s0.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        ri0.z zVar = ri0.z.a;
        ri0.v c = ri0.z.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new kc0.m1(str, str2, str3, l1Var, c);
        }
        k41.b.B(eVar, "headRefOid");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.m1 m1Var = (kc0.m1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, m1Var.b);
        fVar.z0("headRefOid");
        bVar.b(fVar, wVar, m1Var.c);
        fVar.z0("pendingReviews");
        aa.c.b(aa.c.c(s0.a, false)).b(fVar, wVar, m1Var.d);
        ri0.z zVar = ri0.z.a;
        ri0.z.d(fVar, wVar, m1Var.e);
    }
}
