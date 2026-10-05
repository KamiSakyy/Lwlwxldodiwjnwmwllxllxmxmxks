package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s7 implements aa.a {
    public static final s7 a = new s7();
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
        z70.e3 c = z70.g3.c(eVar, wVar);
        eVar.s0();
        z70.k3 k3Var = z70.k3.a;
        z70.i3 c2 = z70.k3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new u10.pb(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.pb pbVar = (u10.pb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pbVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, pbVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, pbVar.b);
        List list = z70.g3.a;
        z70.e3 e3Var = pbVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e3Var, "value");
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, e3Var.a);
        fVar.z0("number");
        fVar.z(e3Var.b);
        fVar.z0("repository");
        aa.c.c(z70.h3.a, false).b(fVar, wVar, e3Var.c);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, e3Var.d);
        z70.k3 k3Var = z70.k3.a;
        z70.k3.d(fVar, wVar, pbVar.d);
    }
}
