package g40;

import hc0.fm;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 implements aa.a {
    public static final n0 a = new n0();
    public static final List b = sy.d0Shadow.o("id", "state", "headRefName", "number", "title", "repository", "__typename");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        r5 = r5.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r7 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r8 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return new g40.k(r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        k41.b.B(r14, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        k41.b.B(r14, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        k41.b.B(r14, "title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        k41.b.B(r14, "number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        k41.b.B(r14, "headRefName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        k41.b.B(r14, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        k41.b.B(r14, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r4 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r5 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        Integer num;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        fm fmVar = null;
        String str2 = null;
        String str3 = null;
        u uVar = null;
        String str4 = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    num = num2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    num = num2;
                    String u = eVar.u();
                    k71.k.d(u);
                    fm.Companion.getClass();
                    Iterator it = fm.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((fm) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    fm fmVar2 = (fm) obj;
                    if (fmVar2 != null) {
                        fmVar = fmVar2;
                        break;
                    } else {
                        fmVar = fm.v;
                        break;
                    }
                case 2:
                    num = num2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
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
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 5:
                    num = num2;
                    uVar = (u) aa.c.c(x0.a, false).a(eVar, wVar);
                    break;
                case 6:
                    num = num2;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            num2 = num;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k kVar = (k) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, kVar.a);
        fVar.z0("state");
        fVar.I(kVar.b.r);
        fVar.z0("headRefName");
        bVar.b(fVar, wVar, kVar.c);
        fVar.z0("number");
        fVar.z(kVar.d);
        fVar.z0("title");
        bVar.b(fVar, wVar, kVar.e);
        fVar.z0("repository");
        aa.c.c(x0.a, false).b(fVar, wVar, kVar.f);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, kVar.g);
    }
}
