package cq;

import java.util.Iterator;
import java.util.List;
import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "title", "bodyHTML", "bodyText", "baseRefName", "headRefName", "state", "isDraft", "number", "repository"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r9 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r11 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r13 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r16 = r12;
        r12 = r13.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r16 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        r13 = r16.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r14 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        return new cq.n3(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        k41.b.B(r19, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        k41.b.B(r19, "number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        k41.b.B(r19, "isDraft");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        k41.b.B(r19, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        k41.b.B(r19, "headRefName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        k41.b.B(r19, "baseRefName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        k41.b.B(r19, "bodyText");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        k41.b.B(r19, "bodyHTML");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        k41.b.B(r19, "title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        k41.b.B(r19, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        k41.b.B(r19, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        r19.s0();
        r13 = pv.f.a;
        r15 = pv.f.c(r19, r20);
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r4 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r6 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r7 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n3 c(ea.e eVar, aa.w wVar) {
        Object obj;
        Integer valueOf;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Throwable th2 = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        b00 b00Var = null;
        Integer num = null;
        m3 m3Var = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 4:
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 5:
                    str6 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 6:
                    str7 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 7:
                    Boolean bool2 = bool;
                    Integer num2 = num;
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
                    bool = bool2;
                    num = num2;
                    break;
                case 8:
                    bool = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 9:
                    Boolean bool3 = bool;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num = valueOf;
                    bool = bool3;
                    break;
                case 10:
                    m3Var = (m3) aa.c.c(p3.a, true).a(eVar, wVar);
                    bool = bool;
                    continue;
            }
            th2 = null;
        }
    }
}
