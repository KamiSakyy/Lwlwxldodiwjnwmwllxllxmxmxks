package ct;

import java.util.Iterator;
import java.util.List;
import jo.f4;
import m10.wi;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "issueState", "title", "url", "number", "repository", "stateReason", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r6 = r6.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r7 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r9 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return new ct.q0(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        k41.b.B(r14, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        k41.b.B(r14, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        k41.b.B(r14, "number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        k41.b.B(r14, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        k41.b.B(r14, "title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        k41.b.B(r14, "issueState");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        k41.b.B(r14, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r4 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r5 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q0 c(ea.e eVar, aa.w wVar) {
        Integer num;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        wi wiVar = null;
        String str2 = null;
        String str3 = null;
        p0 p0Var = null;
        yi yiVar = null;
        String str4 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    num = num2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    num = num2;
                    String u = eVar.u();
                    k71.k.d(u);
                    wi.Companion.getClass();
                    Iterator it = wi.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((wi) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    wi wiVar2 = (wi) obj;
                    if (wiVar2 != null) {
                        wiVar = wiVar2;
                        break;
                    } else {
                        wiVar = wi.v;
                        break;
                    }
                case 2:
                    num = num2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    num = num2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 4:
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
                case 5:
                    num = num2;
                    p0Var = (p0) aa.c.c(t0.a, false).a(eVar, wVar);
                    break;
                case 6:
                    num = num2;
                    yiVar = (yi) aa.c.b(n10.b.f).a(eVar, wVar);
                    break;
                case 7:
                    num = num2;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            num2 = num;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, q0 q0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, q0Var.a);
        fVar.z0("issueState");
        fVar.I(q0Var.b.r);
        fVar.z0("title");
        bVar.b(fVar, wVar, q0Var.c);
        fVar.z0("url");
        bVar.b(fVar, wVar, q0Var.d);
        fVar.z0("number");
        fVar.z(q0Var.e);
        fVar.z0("repository");
        aa.c.c(t0.a, false).b(fVar, wVar, q0Var.f);
        fVar.z0("stateReason");
        aa.c.b(n10.b.f).b(fVar, wVar, q0Var.g);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, q0Var.h);
    }
}
