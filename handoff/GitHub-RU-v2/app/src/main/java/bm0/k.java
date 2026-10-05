package bm0;

import gn0.xc;
import gn0.zc;
import java.util.Iterator;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "number", "issueState", "repository", "stateReason", "titleHTMLString"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r8 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        return new am0.l(r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        k41.b.B(r13, "titleHTMLString");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        k41.b.B(r13, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        k41.b.B(r13, "issueState");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        k41.b.B(r13, "number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        k41.b.B(r13, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        k41.b.B(r13, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r3 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r4 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r4 = r4.intValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static am0.l c(ea.e eVar, aa.w wVar) {
        Integer num;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        xc xcVar = null;
        am0.l0 l0Var = null;
        zc zcVar = null;
        String str3 = null;
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
                    xc.Companion.getClass();
                    Iterator it = xc.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((xc) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    xc xcVar2 = (xc) obj;
                    if (xcVar2 != null) {
                        xcVar = xcVar2;
                        break;
                    } else {
                        xcVar = xc.v;
                        break;
                    }
                case 4:
                    num = num2;
                    l0Var = (am0.l0) aa.c.c(k0.a, false).a(eVar, wVar);
                    break;
                case 5:
                    num = num2;
                    zcVar = (zc) aa.c.b(hn0.a.t).a(eVar, wVar);
                    break;
                case 6:
                    num = num2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            num2 = num;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, am0.l lVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, lVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, lVar.b);
        fVar.z0("number");
        fVar.z(lVar.c);
        fVar.z0("issueState");
        fVar.I(lVar.d.r);
        fVar.z0("repository");
        aa.c.c(k0.a, false).b(fVar, wVar, lVar.e);
        fVar.z0("stateReason");
        aa.c.b(hn0.a.t).b(fVar, wVar, lVar.f);
        fVar.z0("titleHTMLString");
        bVar.b(fVar, wVar, lVar.g);
    }
}
