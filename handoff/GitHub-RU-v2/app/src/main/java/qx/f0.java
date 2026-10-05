package qx;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4;
import m10.b00;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "title", "number", "totalCommentsCount", "pullRequestState", "pullComments", "isReadByViewer", "isDraft", "createdAt", "repository", "isInMergeQueue"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0023. Please report as an issue. */
    public static s c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Boolean bool2;
        Integer valueOf;
        Object obj;
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool3 = null;
        Integer num3 = null;
        b00 b00Var = null;
        v vVar = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        ZonedDateTime zonedDateTime = null;
        y yVar = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                case 2:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                case 3:
                    bool = bool3;
                    bool2 = bool5;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num2 = valueOf;
                    bool3 = bool;
                    bool5 = bool2;
                case 4:
                    num3 = (Integer) aa.c.b(tp.a.a).a(eVar, wVar);
                case 5:
                    Integer num4 = num2;
                    bool = bool3;
                    bool2 = bool5;
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
                    num2 = num4;
                    bool3 = bool;
                    bool5 = bool2;
                case 6:
                    num = num2;
                    vVar = (v) aa.c.c(i0.a, false).a(eVar, wVar);
                    num2 = num;
                case 7:
                    bool4 = (Boolean) aa.c.k.a(eVar, wVar);
                case 8:
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                case 9:
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
                case 10:
                    num = num2;
                    yVar = (y) aa.c.c(l0.a, false).a(eVar, wVar);
                    num2 = num;
                case 11:
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
            }
            Integer num5 = num2;
            if (str == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (str3 == null) {
                k41.b.B(eVar, "title");
                throw null;
            }
            if (num5 == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            Boolean bool6 = bool3;
            int intValue = num5.intValue();
            if (b00Var == null) {
                k41.b.B(eVar, "pullRequestState");
                throw null;
            }
            if (vVar == null) {
                k41.b.B(eVar, "pullComments");
                throw null;
            }
            if (bool6 == null) {
                k41.b.B(eVar, "isDraft");
                throw null;
            }
            Boolean bool7 = bool5;
            boolean booleanValue = bool6.booleanValue();
            if (zonedDateTime == null) {
                k41.b.B(eVar, "createdAt");
                throw null;
            }
            if (yVar == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (bool7 != null) {
                return new s(str, str2, str3, intValue, num3, b00Var, vVar, bool4, booleanValue, zonedDateTime, yVar, bool7.booleanValue());
            }
            k41.b.B(eVar, "isInMergeQueue");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, s sVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, sVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, sVar.b);
        fVar.z0("title");
        bVar.b(fVar, wVar, sVar.c);
        fVar.z0("number");
        int i = sVar.d;
        nn.a aVar = tp.a.a;
        f1.e.A(i, aVar, fVar, wVar, "totalCommentsCount");
        aa.c.b(aVar).b(fVar, wVar, sVar.e);
        fVar.z0("pullRequestState");
        fVar.I(sVar.f.r);
        fVar.z0("pullComments");
        aa.c.c(i0.a, false).b(fVar, wVar, sVar.g);
        fVar.z0("isReadByViewer");
        aa.c.k.b(fVar, wVar, sVar.h);
        fVar.z0("isDraft");
        aa.b bVar2 = aa.c.f;
        f4.C(sVar.i, bVar2, fVar, wVar, "createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, sVar.j);
        fVar.z0("repository");
        aa.c.c(l0.a, false).b(fVar, wVar, sVar.k);
        fVar.z0("isInMergeQueue");
        bVar2.b(fVar, wVar, Boolean.valueOf(sVar.l));
    }
}
