package ea0;

import hc0.h6;
import hc0.jc;
import hc0.lc;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "url", "title", "number", "issueState", "issueComments", "isReadByViewer", "createdAt", "repository", "stateReason"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r7 = r7.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r8 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r9 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r11 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r12 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        return new ea0.r(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        k41.b.B(r18, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        k41.b.B(r18, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        k41.b.B(r18, "issueComments");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        k41.b.B(r18, "issueState");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        k41.b.B(r18, "number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        k41.b.B(r18, "title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        k41.b.B(r18, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        k41.b.B(r18, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r4 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r5 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r6 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r7 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r c(ea.e eVar, aa.w wVar) {
        Integer num;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        jc jcVar = null;
        q qVar = null;
        Boolean bool = null;
        ZonedDateTime zonedDateTime = null;
        xShadow xVar = null;
        lc lcVar = null;
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
                case 4:
                    num = num2;
                    String u = eVar.u();
                    k71.k.d(u);
                    jc.Companion.getClass();
                    Iterator it = jc.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((jc) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    jc jcVar2 = (jc) obj;
                    if (jcVar2 != null) {
                        jcVar = jcVar2;
                        break;
                    } else {
                        jcVar = jc.v;
                        break;
                    }
                case 5:
                    num = num2;
                    qVar = (q) aa.c.c(d0.a, false).a(eVar, wVar);
                    break;
                case 6:
                    num = num2;
                    bool = (Boolean) aa.c.k.a(eVar, wVar);
                    break;
                case 7:
                    num = num2;
                    h6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(h6.a).a(eVar, wVar);
                    break;
                case 8:
                    num = num2;
                    xVar = (xShadow) aa.c.c(k0.a, false).a(eVar, wVar);
                    break;
                case 9:
                    num = num2;
                    lcVar = (lc) aa.c.b(ic0.a.t).a(eVar, wVar);
                    break;
            }
            num2 = num;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, r rVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, rVar.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, rVar.b);
        fVar.z0("title");
        bVar.b(fVar, wVar, rVar.c);
        fVar.z0("number");
        fVar.z(rVar.d);
        fVar.z0("issueState");
        fVar.I(rVar.e.r);
        fVar.z0("issueComments");
        aa.c.c(d0.a, false).b(fVar, wVar, rVar.f);
        fVar.z0("isReadByViewer");
        aa.c.k.b(fVar, wVar, rVar.g);
        fVar.z0("createdAt");
        h6.Companion.getClass();
        wVar.e(h6.a).b(fVar, wVar, rVar.h);
        fVar.z0("repository");
        aa.c.c(k0.a, false).b(fVar, wVar, rVar.i);
        fVar.z0("stateReason");
        aa.c.b(ic0.a.t).b(fVar, wVar, rVar.j);
    }
}
