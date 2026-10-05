package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class m0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "url", "title", "bodyHTML", "bodyText", "number", "repository"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r8 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r9 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r10 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r10 = r10.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r11 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        return new cq.l0(r4, r5, r6, r7, r8, r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        k41.b.B(r17, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        k41.b.B(r17, "number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        k41.b.B(r17, "bodyText");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        k41.b.B(r17, "bodyHTML");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        k41.b.B(r17, "title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        k41.b.B(r17, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        k41.b.B(r17, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        k41.b.B(r17, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        r17.s0();
        r10 = pv.f.a;
        r12 = pv.f.c(r17, r18);
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (r4 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r6 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r7 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l0 c(ea.e eVar, aa.w wVar) {
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        k0 k0Var = null;
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
                    num = num2;
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 5:
                    num = num2;
                    str6 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 6:
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
                case 7:
                    num = num2;
                    k0Var = (k0) aa.c.c(n0.a, true).a(eVar, wVar);
                    break;
            }
            num2 = num;
        }
    }
}
