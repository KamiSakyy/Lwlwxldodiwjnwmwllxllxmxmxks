package p20;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fd implements aaShadow.a {
    public static final fd a = new fd();
    public static final List b = sy.d0.o("__typename", "id", "baseRefName", "mergeCommit", "mergedBy", "mergeStateStatus", "viewerCanDeleteHeadRef", "viewerCanReopen");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r9 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r11 = r8;
        r8 = r9.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r11 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        return new u10.vj(r2, r3, r4, r5, r6, r7, r8, r11.booleanValue(), r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        k41.b.B(r13, "viewerCanReopen");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        k41.b.B(r13, "viewerCanDeleteHeadRef");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        k41.b.B(r13, "mergeStateStatus");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        k41.b.B(r13, "baseRefName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        k41.b.B(r13, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        k41.b.B(r13, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        r13.s0();
        r9 = z70.n3.a;
        r10 = z70.n3.c(r13, r14);
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (r3 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r4 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r7 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        u10.sj sjVar = null;
        u10.uj ujVar = null;
        hc0.ff ffVar = null;
        Boolean bool3 = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool = bool2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    bool = bool2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    bool = bool2;
                    sjVar = (u10.sj) aa.c.b(aa.c.c(cd.a, false)).a(eVar, wVar);
                    break;
                case 4:
                    bool = bool2;
                    ujVar = (u10.uj) aa.c.b(aa.c.c(ed.a, true)).a(eVar, wVar);
                    break;
                case 5:
                    Boolean bool4 = bool2;
                    Boolean bool5 = bool3;
                    String u = eVar.u();
                    k71.k.d(u);
                    hc0.ff.Companion.getClass();
                    Iterator it = hc0.ff.w.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((hc0.ff) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    hc0.ff ffVar2 = (hc0.ff) obj;
                    ffVar = ffVar2 == null ? hc0.ff.u : ffVar2;
                    bool2 = bool4;
                    bool3 = bool5;
                    continue;
                case 6:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 7:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.vj vjVar = (u10.vj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vjVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, vjVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, vjVar.b);
        fVar.z0("baseRefName");
        bVar.b(fVar, wVar, vjVar.c);
        fVar.z0("mergeCommit");
        aa.c.b(aa.c.c(cd.a, false)).b(fVar, wVar, vjVar.d);
        fVar.z0("mergedBy");
        aa.c.b(aa.c.c(ed.a, true)).b(fVar, wVar, vjVar.e);
        fVar.z0("mergeStateStatus");
        fVar.I(vjVar.f.r);
        fVar.z0("viewerCanDeleteHeadRef");
        aa.b bVar2 = aa.c.f;
        jo.f4.C(vjVar.g, bVar2, fVar, wVar, "viewerCanReopen");
        bVar2.b(fVar, wVar, Boolean.valueOf(vjVar.h));
        z70.n3 n3Var = z70.n3.a;
        z70.n3.d(fVar, wVar, vjVar.i);
    }
}
