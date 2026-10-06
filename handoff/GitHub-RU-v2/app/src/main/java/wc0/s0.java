package wc0;

import gn0.c20;
import gn0.r6;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "billableDurationInSeconds", "runNumber", "createdAt", "updatedAt", "resourcePath", "eventType", "url", "workflow", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r8 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r9 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r10 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r11 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r12 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r13 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        return new wc0.r0(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        k41.b.B(r18, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        k41.b.B(r18, "workflow");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        k41.b.B(r18, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        k41.b.B(r18, "eventType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        k41.b.B(r18, "resourcePath");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        k41.b.B(r18, "updatedAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        k41.b.B(r18, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        k41.b.B(r18, "runNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        k41.b.B(r18, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r4 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (r6 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        r6 = r6.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r7 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r0 c(ea.e eVar, aa.w wVar) {
        Integer num;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        Integer num3 = null;
        ZonedDateTime zonedDateTime = null;
        ZonedDateTime zonedDateTime2 = null;
        String str2 = null;
        c20 c20Var = null;
        String str3 = null;
        q0 q0Var = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(a);
            aa.xShadow xVar = r6.a;
            switch (r0) {
                case 0:
                    num = num2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    num = num2;
                    num3 = (Integer) aa.c.b(od0.b.a).a(eVar, wVar);
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
                    r6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                    break;
                case 4:
                    num = num2;
                    r6.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                    break;
                case 5:
                    num = num2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 6:
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
                case 7:
                    num = num2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 8:
                    num = num2;
                    q0Var = (q0) aa.c.c(t0.a, false).a(eVar, wVar);
                    break;
                case 9:
                    num = num2;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            num2 = num;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, r0 r0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r0Var.a);
        fVar.z0("billableDurationInSeconds");
        nn.a aVar = od0.b.a;
        aa.c.b(aVar).b(fVar, wVar, r0Var.b);
        fVar.z0("runNumber");
        aVar.b(fVar, wVar, Integer.valueOf(r0Var.c));
        fVar.z0("createdAt");
        r6.Companion.getClass();
        aa.xShadow xVar = r6.a;
        wVar.e(xVar).b(fVar, wVar, r0Var.d);
        fVar.z0("updatedAt");
        wVar.e(xVar).b(fVar, wVar, r0Var.e);
        fVar.z0("resourcePath");
        bVar.b(fVar, wVar, r0Var.f);
        fVar.z0("eventType");
        fVar.I(r0Var.g.r);
        fVar.z0("url");
        bVar.b(fVar, wVar, r0Var.h);
        fVar.z0("workflow");
        aa.c.c(t0.a, false).b(fVar, wVar, r0Var.i);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, r0Var.j);
    }
}
