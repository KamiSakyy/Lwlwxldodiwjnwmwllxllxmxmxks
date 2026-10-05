package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n8 implements aa.a {
    public static final n8 a = new n8();
    public static final List b = sy.d0.o(new String[]{"__typename", "contributorsCount", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        oj0.e2 c = oj0.l2.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "contributorsCount");
            throw null;
        }
        int intValue = num.intValue();
        if (str2 != null) {
            return new kc0.uc(str, intValue, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.uc ucVar = (kc0.uc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ucVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ucVar.a);
        fVar.z0("contributorsCount");
        fVar.z(ucVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, ucVar.c);
        List list = oj0.l2.a;
        oj0.l2.d(fVar, wVar, ucVar.d);
    }
}
