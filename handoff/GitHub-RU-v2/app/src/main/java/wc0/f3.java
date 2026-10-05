package wc0;

import gn0.c20;
import gn0.r6;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "title", "runNumber", "eventType", "createdAt", "workflow", "checkSuite", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r6 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r7 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r8 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r9 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        return new wc0.v2(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        k41.b.B(r14, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        k41.b.B(r14, "checkSuite");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        k41.b.B(r14, "workflow");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        k41.b.B(r14, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        k41.b.B(r14, "eventType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        k41.b.B(r14, "runNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        k41.b.B(r14, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r4 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r4 = r4.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r5 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v2 c(ea.e eVar, aa.w wVar) {
        Integer num;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        c20 c20Var = null;
        ZonedDateTime zonedDateTime = null;
        u2 u2Var = null;
        n2 n2Var = null;
        String str3 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    num = num2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    num = num2;
                    str2 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 2:
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                        }
                        num2 = Integer.valueOf((int) nextLong);
                    } else {
                        num2 = Integer.valueOf((int) nextLong);
                        continue;
                    }
                case 3:
                    num = num2;
                    String u = eVar.u();
                    k71.k.d(u);
                    c20.Companion.getClass();
                    Iterator it = c20.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((c20) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    c20 c20Var2 = (c20) obj;
                    if (c20Var2 != null) {
                        c20Var = c20Var2;
                        break;
                    } else {
                        c20Var = c20.t;
                        break;
                    }
                case 4:
                    num = num2;
                    r6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(r6.a).a(eVar, wVar);
                    break;
                case 5:
                    num = num2;
                    u2Var = (u2) aa.c.c(e3.a, false).a(eVar, wVar);
                    break;
                case 6:
                    num = num2;
                    n2Var = (n2) aa.c.c(x2.a, false).a(eVar, wVar);
                    break;
                case 7:
                    num = num2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            num2 = num;
        }
    }
}
