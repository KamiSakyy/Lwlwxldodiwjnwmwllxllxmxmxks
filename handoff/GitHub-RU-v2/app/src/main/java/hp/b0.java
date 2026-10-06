package hp;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import m10.o7;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"sessionId", "name", "state", "createdAt", "lastUpdatedAt", "completedAt", "resource", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r9 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return new hp.y(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        k41.b.B(r12, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        k41.b.B(r12, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        k41.b.B(r12, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        k41.b.B(r12, "name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        k41.b.B(r12, "sessionId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r4 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r5 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        o7 o7Var = null;
        ZonedDateTime zonedDateTime = null;
        ZonedDateTime zonedDateTime2 = null;
        ZonedDateTime zonedDateTime3 = null;
        xShadow xVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            aa.xShadow xVar2 = sa.a;
            switch (r0) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    String u = eVar.u();
                    k71.k.d(u);
                    o7.Companion.getClass();
                    Iterator it = o7.D.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((o7) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    o7 o7Var2 = (o7) obj;
                    if (o7Var2 != null) {
                        o7Var = o7Var2;
                        break;
                    } else {
                        o7Var = o7.B;
                        break;
                    }
                case 3:
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(xVar2).a(eVar, wVar);
                    break;
                case 4:
                    sa.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) aa.c.b(wVar.e(xVar2)).a(eVar, wVar);
                    break;
                case 5:
                    sa.Companion.getClass();
                    zonedDateTime3 = (ZonedDateTime) aa.c.b(wVar.e(xVar2)).a(eVar, wVar);
                    break;
                case 6:
                    xVar = (xShadow) aa.c.b(aa.c.c(a0.a, true)).a(eVar, wVar);
                    break;
                case 7:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
        }
    }
}
