package sd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r0 implements aa.a {
    public static final r0 a = new r0();
    public static final List b = sy.d0.o(new String[]{"id", "avatarUrl"});

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
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new d0(str, str2);
        }
        k41.b.B(eVar, "avatarUrl");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d0 d0Var = (d0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d0Var.a);
        fVar.z0("avatarUrl");
        bVar.b(fVar, wVar, d0Var.b);
    }
}
