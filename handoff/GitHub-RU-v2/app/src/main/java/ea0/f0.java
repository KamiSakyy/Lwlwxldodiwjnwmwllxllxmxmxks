package ea0;

import hc0.fm;
import hc0.h6;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "title", "number", "totalCommentsCount", "pullRequestState", "pullComments", "isReadByViewer", "isDraft", "createdAt", "repository"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0021. Please report as an issue. */
    public static s c(ea.e eVar, aa.w wVar) {
        Integer num;
        Integer valueOf;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Throwable th2 = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        Integer num3 = null;
        fm fmVar = null;
        v vVar = null;
        Boolean bool2 = null;
        ZonedDateTime zonedDateTime = null;
        y yVar = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    th2 = null;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    th2 = null;
                case 2:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    th2 = null;
                case 3:
                    Boolean bool3 = bool;
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
                    bool = bool3;
                    th2 = null;
                case 4:
                    num = num2;
                    num3 = (Integer) aa.c.b(y20.a.a).a(eVar, wVar);
                    num2 = num;
                case 5:
                    Integer num4 = num2;
                    Boolean bool4 = bool;
                    String u = eVar.u();
                    k71.k.d(u);
                    fm.Companion.getClass();
                    Iterator it = fm.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((fm) obj).r.equals(u)) {
                            }
                        } else {
                            obj = th2;
                        }
                    }
                    fmVar = (fm) obj;
                    if (fmVar == null) {
                        fmVar = fm.v;
                    }
                    num2 = num4;
                    bool = bool4;
                case 6:
                    num = num2;
                    vVar = (v) aa.c.c(i0.a, false).a(eVar, wVar);
                    num2 = num;
                case 7:
                    num = num2;
                    bool2 = (Boolean) aa.c.k.a(eVar, wVar);
                    num2 = num;
                case 8:
                    num = num2;
                    bool = (Boolean) aa.c.f.a(eVar, wVar);
                    num2 = num;
                case 9:
                    num = num2;
                    h6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(h6.a).a(eVar, wVar);
                    num2 = num;
                case 10:
                    num = num2;
                    yVar = (y) aa.c.c(l0.a, false).a(eVar, wVar);
                    num2 = num;
            }
            Integer num5 = num2;
            if (str == null) {
                k41.b.B(eVar, "id");
                throw th2;
            }
            if (str2 == null) {
                k41.b.B(eVar, "url");
                throw th2;
            }
            if (str3 == null) {
                k41.b.B(eVar, "title");
                throw th2;
            }
            if (num5 == null) {
                k41.b.B(eVar, "number");
                throw th2;
            }
            Boolean bool5 = bool;
            int intValue = num5.intValue();
            if (fmVar == null) {
                k41.b.B(eVar, "pullRequestState");
                throw th2;
            }
            if (vVar == null) {
                k41.b.B(eVar, "pullComments");
                throw th2;
            }
            if (bool5 == null) {
                k41.b.B(eVar, "isDraft");
                throw th2;
            }
            boolean booleanValue = bool5.booleanValue();
            if (zonedDateTime == null) {
                k41.b.B(eVar, "createdAt");
                throw th2;
            }
            if (yVar != null) {
                return new s(str, str2, str3, intValue, num3, fmVar, vVar, bool2, booleanValue, zonedDateTime, yVar);
            }
            k41.b.B(eVar, "repository");
            throw th2;
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
        Integer valueOf = Integer.valueOf(sVar.d);
        nn.a aVar = y20.a.a;
        aVar.b(fVar, wVar, valueOf);
        fVar.z0("totalCommentsCount");
        aa.c.b(aVar).b(fVar, wVar, sVar.e);
        fVar.z0("pullRequestState");
        fVar.I(sVar.f.r);
        fVar.z0("pullComments");
        aa.c.c(i0.a, false).b(fVar, wVar, sVar.g);
        fVar.z0("isReadByViewer");
        aa.c.k.b(fVar, wVar, sVar.h);
        fVar.z0("isDraft");
        f4.C(sVar.i, aa.c.f, fVar, wVar, "createdAt");
        h6.Companion.getClass();
        wVar.e(h6.a).b(fVar, wVar, sVar.j);
        fVar.z0("repository");
        aa.c.c(l0.a, false).b(fVar, wVar, sVar.k);
    }
}
