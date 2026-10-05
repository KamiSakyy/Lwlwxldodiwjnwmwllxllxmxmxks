package wx0;

import java.time.LocalDate;
import java.util.List;
import pz0.m7;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "iterationId", "title", "titleHTML", "duration", "startDate", "field"});

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
    
        if (r8 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return new wx0.e1(r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        k41.b.B(r14, "field");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        k41.b.B(r14, "startDate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        k41.b.B(r14, "duration");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        k41.b.B(r14, "titleHTML");
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
    
        k41.b.B(r14, "iterationId");
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
    public static e1 c(ea.e eVar, aa.w wVar) {
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        LocalDate localDate = null;
        t tVar = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    num = num2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    num = num2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    num = num2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    num = num2;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 4:
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4.c(1, nextLong, "substring(...)");
                        }
                        num2 = Integer.valueOf((int) nextLong);
                    } else {
                        num2 = Integer.valueOf((int) nextLong);
                        continue;
                    }
                case 5:
                    num = num2;
                    m7.Companion.getClass();
                    localDate = (LocalDate) wVar.e(m7.a).a(eVar, wVar);
                    break;
                case 6:
                    num = num2;
                    tVar = (t) aa.c.c(b2.a, true).a(eVar, wVar);
                    break;
            }
            num2 = num;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, e1 e1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e1Var.a);
        fVar.z0("iterationId");
        bVar.b(fVar, wVar, e1Var.b);
        fVar.z0("title");
        bVar.b(fVar, wVar, e1Var.c);
        fVar.z0("titleHTML");
        bVar.b(fVar, wVar, e1Var.d);
        fVar.z0("duration");
        fVar.z(e1Var.e);
        fVar.z0("startDate");
        m7.Companion.getClass();
        wVar.e(m7.a).b(fVar, wVar, e1Var.f);
        fVar.z0("field");
        aa.c.c(b2.a, true).b(fVar, wVar, e1Var.g);
    }
}
