package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 implements aaShadow.a {
    public static final e0 a = new e0();
    public static final List b = sy.d0Shadow.o("__typename", "id", "headRefOid");

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
        z70.s7 c = z70.w7.c(eVar, wVar);
        eVar.s0();
        z70.y yVar = z70.y.a;
        z70.v c2 = z70.y.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new u10.t0(str, str2, str3, c, c2);
        }
        k41.b.B(eVar, "headRefOid");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.t0 t0Var = (u10.t0) obj;
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
        List list = z70.w7.a;
        z70.w7.d(fVar, wVar, t0Var.d);
        z70.y yVar = z70.y.a;
        z70.y.d(fVar, wVar, t0Var.e);
    }
}
