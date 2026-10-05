package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h9 implements aa.a {
    public static final h9 a = new h9();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        kc0.zd zdVar;
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
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Commit"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            zdVar = i9.c(eVar, wVar);
        } else {
            zdVar = null;
        }
        if (str2 != null) {
            return new kc0.yd(str, str2, zdVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.yd ydVar = (kc0.yd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ydVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ydVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, ydVar.b);
        kc0.zd zdVar = ydVar.c;
        if (zdVar != null) {
            i9.d(fVar, wVar, zdVar);
        }
    }
}
