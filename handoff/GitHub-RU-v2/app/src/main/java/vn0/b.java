package vn0;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import pz0.o7;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b implements aa.a {
    public static final List a = x61.l.r(new String[]{"externalId", "name", "conclusion", "status", "startedAt", "completedAt", "secondsToCompletion", "number"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return new vn0.a(r2, r3, r4, r5, r6, r7, r8, r9.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        k41.b.B(r12, "number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        k41.b.B(r12, "status");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        k41.b.B(r12, "name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r5 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r9 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a c(ea.e eVar, aa.w wVar) {
        Integer num;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        pz0.y2 y2Var = null;
        pz0.e3 e3Var = null;
        ZonedDateTime zonedDateTime = null;
        ZonedDateTime zonedDateTime2 = null;
        Integer num3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            aa.xShadow xVar = o7.a;
            nn.a aVar = ro0.a.a;
            switch (r0) {
                case 0:
                    num = num2;
                    str = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 1:
                    num = num2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    num = num2;
                    y2Var = (pz0.y2) aa.c.b(qz0.a.c).a(eVar, wVar);
                    break;
                case 3:
                    num = num2;
                    String u = eVar.u();
                    k71.k.d(u);
                    pz0.e3.Companion.getClass();
                    Iterator it = pz0.e3.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((pz0.e3) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    pz0.e3 e3Var2 = (pz0.e3) obj;
                    if (e3Var2 != null) {
                        e3Var = e3Var2;
                        break;
                    } else {
                        e3Var = pz0.e3.t;
                        break;
                    }
                case 4:
                    num = num2;
                    o7.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) aa.c.b(wVar.e(xVar)).a(eVar, wVar);
                    break;
                case 5:
                    num = num2;
                    o7.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) aa.c.b(wVar.e(xVar)).a(eVar, wVar);
                    break;
                case 6:
                    num = num2;
                    num3 = (Integer) aa.c.b(aVar).a(eVar, wVar);
                    break;
                case 7:
                    num2 = (Integer) aVar.a(eVar, wVar);
                    continue;
            }
            num2 = num;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, a aVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("externalId");
        aa.c.i.b(fVar, wVar, aVar.a);
        fVar.z0("name");
        aa.c.a.b(fVar, wVar, aVar.b);
        fVar.z0("conclusion");
        aa.c.b(qz0.a.c).b(fVar, wVar, aVar.c);
        fVar.z0("status");
        fVar.I(aVar.d.r);
        fVar.z0("startedAt");
        o7.Companion.getClass();
        aa.xShadow xVar = o7.a;
        aa.c.b(wVar.e(xVar)).b(fVar, wVar, aVar.e);
        no.a.e(fVar, "completedAt", wVar, xVar).b(fVar, wVar, aVar.f);
        fVar.z0("secondsToCompletion");
        nn.a aVar2 = ro0.a.a;
        aa.c.b(aVar2).b(fVar, wVar, aVar.g);
        fVar.z0("number");
        aVar2.b(fVar, wVar, Integer.valueOf(aVar.h));
    }
}
