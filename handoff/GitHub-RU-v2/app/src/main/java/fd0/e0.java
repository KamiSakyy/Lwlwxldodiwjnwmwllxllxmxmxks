package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e0 implements aaShadow.a {
    public static final e0 a = new e0();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "headRefOid"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        ri0.h8 c = ri0.l8.c(eVar, wVar);
        eVar.s0();
        ri0.z zVar = ri0.z.a;
        ri0.v c2 = ri0.z.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new kc0.t0(str, str2, str3, c, c2);
        }
        k41.b.B(eVar, "headRefOid");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.t0 t0Var = (kc0.t0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, t0Var.b);
        fVar.z0("headRefOid");
        bVar.b(fVar, wVar, t0Var.c);
        List list = ri0.l8.a;
        ri0.l8.d(fVar, wVar, t0Var.d);
        ri0.z zVar = ri0.z.a;
        ri0.z.d(fVar, wVar, t0Var.e);
    }
}
