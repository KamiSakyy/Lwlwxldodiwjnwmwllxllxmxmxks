package cq;

import java.time.LocalDate;
import java.util.List;
import m10.qa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n implements aa.a {
    public static final List a = x61.l.r(new String[]{"resetDate", "freeOverageCount", "premiumOverageCount", "entitlement", "isOveragePermitted", "freeRemaining", "premiumRemaining", "quotaId"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r8 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r7 = r8.doubleValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r9 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r9 = r9.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r12 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        return new cq.m(r2, r3, r5, r7, r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        k41.b.B(r13, "quotaId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        k41.b.B(r13, "isOveragePermitted");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        k41.b.B(r13, "entitlement");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        k41.b.B(r13, "premiumOverageCount");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        k41.b.B(r13, "freeOverageCount");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r6 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        r7 = r3;
        r8 = r4;
        r3 = r6.doubleValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r7 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r9 = r5;
        r5 = r7.doubleValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m c(ea.e eVar, aa.w wVar) {
        Double d;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Double d2 = null;
        LocalDate localDate = null;
        Double d3 = null;
        Double d4 = null;
        Boolean bool = null;
        Double d5 = null;
        Double d6 = null;
        String str = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    d = d2;
                    qa.Companion.getClass();
                    localDate = (LocalDate) no.a.h(wVar, qa.a, eVar, wVar);
                    break;
                case 1:
                    d2 = (Double) aa.c.c.a(eVar, wVar);
                    continue;
                case 2:
                    d = d2;
                    d3 = (Double) aa.c.c.a(eVar, wVar);
                    break;
                case 3:
                    d = d2;
                    d4 = (Double) aa.c.c.a(eVar, wVar);
                    break;
                case 4:
                    d = d2;
                    bool = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 5:
                    d = d2;
                    d5 = (Double) aa.c.j.a(eVar, wVar);
                    break;
                case 6:
                    d = d2;
                    d6 = (Double) aa.c.j.a(eVar, wVar);
                    break;
                case 7:
                    d = d2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            d2 = d;
        }
    }
}
