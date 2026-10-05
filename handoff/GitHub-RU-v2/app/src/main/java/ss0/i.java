package ss0;

import aa.w;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "enqueuer", "estimatedTimeToMerge", "jump", "solo", "position", "pullRequest", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r11 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r12 = r6;
        r6 = r11.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r12 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r7 = r12.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r9 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        return new ss0.g(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        k41.b.B(r14, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        k41.b.B(r14, "position");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        k41.b.B(r14, "solo");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        k41.b.B(r14, "jump");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        k41.b.B(r14, "enqueuer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        k41.b.B(r14, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r3 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r7 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r11 = r5;
        r5 = r7.booleanValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g c(ea.e eVar, w wVar) {
        Boolean bool;
        Integer valueOf;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        e eVar2 = null;
        Integer num = null;
        Boolean bool3 = null;
        Integer num2 = null;
        f fVar = null;
        String str2 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool = bool2;
                    eVar2 = (e) aa.c.c(h.a, true).a(eVar, wVar);
                    break;
                case 2:
                    bool = bool2;
                    num = (Integer) aa.c.b(ro0.a.a).a(eVar, wVar);
                    break;
                case 3:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 4:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 5:
                    Boolean bool4 = bool2;
                    Boolean bool5 = bool3;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num2 = valueOf;
                    bool2 = bool4;
                    bool3 = bool5;
                    continue;
                case 6:
                    bool = bool2;
                    fVar = (f) aa.c.b(aa.c.c(j.a, true)).a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, w wVar, g gVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gVar.a);
        fVar.z0("enqueuer");
        aa.c.c(h.a, true).b(fVar, wVar, gVar.b);
        fVar.z0("estimatedTimeToMerge");
        nn.a aVar = ro0.a.a;
        aa.c.b(aVar).b(fVar, wVar, gVar.c);
        fVar.z0("jump");
        aa.b bVar2 = aa.c.f;
        f4.C(gVar.d, bVar2, fVar, wVar, "solo");
        f4.C(gVar.e, bVar2, fVar, wVar, "position");
        f1.e.v(gVar.f, aVar, fVar, wVar, "pullRequest");
        aa.c.b(aa.c.c(j.a, true)).b(fVar, wVar, gVar.g);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, gVar.h);
    }
}
