package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class on implements aa.a {
    public static final on a = new on();
    public static final List b = sy.d0.o("id", "position", "pullRequest", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        jo.ey eyVar = null;
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
            } else if (r0 == 2) {
                eyVar = (jo.ey) aa.c.b(aa.c.c(rn.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "position");
            throw null;
        }
        int intValue = num.intValue();
        if (str2 != null) {
            return new jo.ay(str, intValue, eyVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ay ayVar = (jo.ay) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ayVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ayVar.a);
        fVar.z0("position");
        fVar.z(ayVar.b);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(rn.a, true)).b(fVar, wVar, ayVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ayVar.d);
    }
}
