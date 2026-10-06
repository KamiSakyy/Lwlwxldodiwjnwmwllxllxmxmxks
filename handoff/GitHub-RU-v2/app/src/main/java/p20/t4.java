package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t4 implements aaShadow.a {
    public static final t4 a = new t4();
    public static final List b = sy.d0Shadow.o("id", "replyTo", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.o7 o7Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                o7Var = (u10.o7) aa.c.b(aa.c.c(z4.a, false)).a(eVar, wVar);
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
            return new u10.h7(str, o7Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.h7 h7Var = (u10.h7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h7Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h7Var.a);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(z4.a, false)).b(fVar, wVar, h7Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, h7Var.c);
    }
}
