package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 implements aaShadow.a {
    public static final a0 a = new a0();
    public static final List b = sy.d0.o("__typename", "replyTo", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.r0 r0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                r0Var = (jo.r0) aa.c.b(aa.c.c(c0.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        ms.v c = ms.z.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jo.o0(str, r0Var, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.o0 o0Var = (jo.o0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, o0Var.a);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(c0.a, true)).b(fVar, wVar, o0Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, o0Var.c);
        List list = ms.z.a;
        ms.z.d(fVar, wVar, o0Var.d);
    }
}
