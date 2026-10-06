package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m7 implements aaShadow.a {
    public static final m7 a = new m7();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        kc0.gb gbVar;
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
        if (m71.a.v(m71.a.O(new String[]{"Discussion"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            gbVar = n7.c(eVar, wVar);
        } else {
            gbVar = null;
        }
        if (str2 != null) {
            return new kc0.fb(str, str2, gbVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.fb fbVar = (kc0.fb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fbVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fbVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, fbVar.b);
        kc0.gb gbVar = fbVar.c;
        if (gbVar != null) {
            n7.d(fVar, wVar, gbVar);
        }
    }
}
