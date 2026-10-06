package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t5 implements aaShadow.a {
    public static final t5 a = new t5();
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
        z70.e c = z70.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new u10.u8(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.u8 u8Var = (u10.u8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u8Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u8Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, u8Var.b);
        List list = z70.f.a;
        z70.e eVar = u8Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, eVar.a);
        fVar.z0("lastEditedAt");
        hc0.h6.Companion.getClass();
        aa.c.b(wVar.e(hc0.h6.a)).b(fVar, wVar, eVar.b);
        fVar.z0("state");
        fVar.I(eVar.c.r);
        fVar.z0("id");
        bVar2.b(fVar, wVar, eVar.d);
        z70.w2 w2Var = z70.w2.a;
        z70.w2.d(fVar, wVar, eVar.e);
    }
}
