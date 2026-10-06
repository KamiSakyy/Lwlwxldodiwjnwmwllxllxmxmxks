package sr;

import aa.w;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import m10.wi;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "number", "title", "issueState", "repository", "duplicateOf", "stateReason", "id"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r7 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r8 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r11 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        return new sr.c(r4, r5, r6, r7, r8, r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        k41.b.B(r17, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        k41.b.B(r17, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        k41.b.B(r17, "issueState");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        k41.b.B(r17, "title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        k41.b.B(r17, "number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        k41.b.B(r17, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r5 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        r5 = r5.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r6 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c c(ea.e eVar, w wVar) {
        Integer num;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        wi wiVar = null;
        h hVar = null;
        b bVar = null;
        yi yiVar = null;
        String str3 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    num = num2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4Shadow.c(1, nextLong, "substring(...)");
                        }
                        num2 = Integer.valueOf((int) nextLong);
                    } else {
                        num2 = Integer.valueOf((int) nextLong);
                        continue;
                    }
                case 2:
                    num = num2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
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
                case 4:
                    num = num2;
                    hVar = (h) aa.c.c(s.a, false).a(eVar, wVar);
                    break;
                case 5:
                    num = num2;
                    bVar = (b) aa.c.b(aa.c.c(m.a, true)).a(eVar, wVar);
                    break;
                case 6:
                    num = num2;
                    yiVar = (yi) aa.c.b(n10.b.f).a(eVar, wVar);
                    break;
                case 7:
                    num = num2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            num2 = num;
        }
    }

    public static void d(ea.f fVar, w wVar, c cVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("number");
        fVar.z(cVar.b);
        fVar.z0("title");
        bVar.b(fVar, wVar, cVar.c);
        fVar.z0("issueState");
        fVar.I(cVar.d.r);
        fVar.z0("repository");
        aa.c.c(s.a, false).b(fVar, wVar, cVar.e);
        fVar.z0("duplicateOf");
        aa.c.b(aa.c.c(m.a, true)).b(fVar, wVar, cVar.f);
        fVar.z0("stateReason");
        aa.c.b(n10.b.f).b(fVar, wVar, cVar.g);
        fVar.z0("id");
        bVar.b(fVar, wVar, cVar.h);
    }
}
