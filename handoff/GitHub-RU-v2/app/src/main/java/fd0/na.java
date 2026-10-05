package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class na implements aa.a {
    public static final na a = new na();
    public static final List b = sy.d0.o(new String[]{"hasNextPage", "endCursor"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.i.a(eVar, wVar);
            }
        }
        if (bool != null) {
            return new kc0.rf(str, bool.booleanValue());
        }
        k41.b.B(eVar, "hasNextPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.rf rfVar = (kc0.rf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rfVar, "value");
        fVar.z0("hasNextPage");
        jo.f4.C(rfVar.a, aa.c.f, fVar, wVar, "endCursor");
        aa.c.i.b(fVar, wVar, rfVar.b);
    }
}
