package er;

import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 implements aa.a {
    public static final n0 a = new n0();
    public static final List b = sy.d0Shadow.o("id", "state", "headRefName", "number", "title", "repository", "isInMergeQueue", "__typename");

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001d. Please report as an issue. */
    public final Object a(ea.e eVar, aa.w wVar) {
        Integer num;
        Integer num2;
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num3 = null;
        String str = null;
        b00 b00Var = null;
        String str2 = null;
        Boolean bool2 = null;
        String str3 = null;
        u uVar = null;
        String str4 = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    num = num3;
                    str = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 1:
                    num2 = num3;
                    bool = bool2;
                    String u = eVar.u();
                    k71.k.d(u);
                    b00.Companion.getClass();
                    Iterator it = b00.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((b00) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    b00 b00Var2 = (b00) obj;
                    b00Var = b00Var2 == null ? b00.v : b00Var2;
                    num3 = num2;
                    bool2 = bool;
                case 2:
                    num = num3;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 3:
                    bool = bool2;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                        }
                        num3 = Integer.valueOf((int) nextLong);
                    } else {
                        num3 = Integer.valueOf((int) nextLong);
                    }
                    bool2 = bool;
                case 4:
                    num = num3;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
                case 5:
                    num2 = num3;
                    bool = bool2;
                    uVar = (u) aa.c.c(x0.a, false).a(eVar, wVar);
                    num3 = num2;
                    bool2 = bool;
                case 6:
                    num = num3;
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num;
                case 7:
                    num = num3;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num;
            }
            Integer num4 = num3;
            if (str == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (b00Var == null) {
                k41.b.B(eVar, "state");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "headRefName");
                throw null;
            }
            if (num4 == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            Boolean bool3 = bool2;
            int intValue = num4.intValue();
            if (str3 == null) {
                k41.b.B(eVar, "title");
                throw null;
            }
            if (uVar == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (bool3 == null) {
                k41.b.B(eVar, "isInMergeQueue");
                throw null;
            }
            boolean booleanValue = bool3.booleanValue();
            if (str4 != null) {
                return new k(str, b00Var, str2, intValue, str3, uVar, booleanValue, str4);
            }
            k41.b.B(eVar, "__typename");
            throw null;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k kVar = (k) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, kVar.a);
        fVar.z0("state");
        fVar.I(kVar.b.r);
        fVar.z0("headRefName");
        bVar.b(fVar, wVar, kVar.c);
        fVar.z0("number");
        fVar.z(kVar.d);
        fVar.z0("title");
        bVar.b(fVar, wVar, kVar.e);
        fVar.z0("repository");
        aa.c.c(x0.a, false).b(fVar, wVar, kVar.f);
        fVar.z0("isInMergeQueue");
        f4.C(kVar.g, aa.c.f, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, kVar.h);
    }
}
