package uu0;

import java.util.Iterator;
import java.util.List;
import pz0.bf;
import pz0.df;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t0 implements aa.a {
    public static final t0 a = new t0();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "title", "titleHTML", "number", "repository", "stateReason", "state", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r7 = r7.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r8 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r10 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r11 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        return new uu0.p0(r4, r5, r6, r7, r8, r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        k41.b.B(r17, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        k41.b.B(r17, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        k41.b.B(r17, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        k41.b.B(r17, "number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        k41.b.B(r17, "titleHTML");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        k41.b.B(r17, "title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        k41.b.B(r17, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r6 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r7 == null) goto L22;
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
        String str2 = null;
        String str3 = null;
        q0 q0Var = null;
        df dfVar = null;
        bf bfVar = null;
        String str4 = null;
        while (true) {
            switch (eVar.r0(b)) {
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
                            nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                        }
                        num2 = Integer.valueOf((int) nextLong);
                    } else {
                        num2 = Integer.valueOf((int) nextLong);
                        continue;
                    }
                case 4:
                    num = num2;
                    q0Var = (q0) aa.c.c(v0.a, false).a(eVar, wVar);
                    break;
                case 5:
                    num = num2;
                    dfVar = (df) aa.c.b(qz0.a.x).a(eVar, wVar);
                    break;
                case 6:
                    num = num2;
                    String u = eVar.u();
                    k71.k.d(u);
                    bf.Companion.getClass();
                    Iterator it = bf.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((bf) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    bf bfVar2 = (bf) obj;
                    if (bfVar2 != null) {
                        bfVar = bfVar2;
                        break;
                    } else {
                        bfVar = bf.v;
                        break;
                    }
                case 7:
                    num = num2;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            num2 = num;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p0 p0Var = (p0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p0Var.a);
        fVar.z0("title");
        bVar.b(fVar, wVar, p0Var.b);
        fVar.z0("titleHTML");
        bVar.b(fVar, wVar, p0Var.c);
        fVar.z0("number");
        fVar.z(p0Var.d);
        fVar.z0("repository");
        aa.c.c(v0.a, false).b(fVar, wVar, p0Var.e);
        fVar.z0("stateReason");
        aa.c.b(qz0.a.x).b(fVar, wVar, p0Var.f);
        fVar.z0("state");
        fVar.I(p0Var.g.r);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p0Var.h);
    }
}
