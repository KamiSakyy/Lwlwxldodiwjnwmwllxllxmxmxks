package sr;

import aa.w;
import java.util.Iterator;
import java.util.List;
import jo.f4;
import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "number", "title", "pullRequestState", "repository", "isInMergeQueue", "isDraft", "id"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0019. Please report as an issue. */
    public static d c(ea.e eVar, w wVar) {
        Integer num;
        Boolean bool;
        Boolean bool2;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        Boolean bool3 = null;
        String str2 = null;
        b00 b00Var = null;
        g gVar = null;
        Boolean bool4 = null;
        String str3 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    num = num2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 1:
                    bool = bool3;
                    bool2 = bool4;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                        }
                        num2 = Integer.valueOf((int) nextLong);
                    } else {
                        num2 = Integer.valueOf((int) nextLong);
                    }
                    bool3 = bool;
                    bool4 = bool2;
                case 2:
                    num = num2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 3:
                    Integer num3 = num2;
                    bool = bool3;
                    bool2 = bool4;
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
                    b00Var = (b00) obj;
                    if (b00Var == null) {
                        b00Var = b00.v;
                    }
                    num2 = num3;
                    bool3 = bool;
                    bool4 = bool2;
                case 4:
                    gVar = (g) aa.c.c(r.a, false).a(eVar, wVar);
                    num2 = num2;
                    bool3 = bool3;
                case 5:
                    num = num2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    num2 = num;
                case 6:
                    num = num2;
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    num2 = num;
                case 7:
                    num = num2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
            }
            Integer num4 = num2;
            if (str == null) {
                k41.b.B(eVar, "__typename");
                throw null;
            }
            if (num4 == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            Boolean bool5 = bool3;
            int intValue = num4.intValue();
            if (str2 == null) {
                k41.b.B(eVar, "title");
                throw null;
            }
            if (b00Var == null) {
                k41.b.B(eVar, "pullRequestState");
                throw null;
            }
            if (gVar == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (bool5 == null) {
                k41.b.B(eVar, "isInMergeQueue");
                throw null;
            }
            Boolean bool6 = bool4;
            boolean booleanValue = bool5.booleanValue();
            if (bool6 == null) {
                k41.b.B(eVar, "isDraft");
                throw null;
            }
            boolean booleanValue2 = bool6.booleanValue();
            if (str3 != null) {
                return new d(str, intValue, str2, b00Var, gVar, booleanValue, booleanValue2, str3);
            }
            k41.b.B(eVar, "id");
            throw null;
        }
    }

    public static void d(ea.f fVar, w wVar, d dVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dVar.a);
        fVar.z0("number");
        fVar.z(dVar.b);
        fVar.z0("title");
        bVar.b(fVar, wVar, dVar.c);
        fVar.z0("pullRequestState");
        fVar.I(dVar.d.r);
        fVar.z0("repository");
        aa.c.c(r.a, false).b(fVar, wVar, dVar.e);
        fVar.z0("isInMergeQueue");
        aa.b bVar2 = aa.c.f;
        f4.C(dVar.f, bVar2, fVar, wVar, "isDraft");
        f4.C(dVar.g, bVar2, fVar, wVar, "id");
        bVar.b(fVar, wVar, dVar.h);
    }
}
