package gr0;

import aa.w;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "question", "viewerHasVoted", "totalVoteCount", "viewerCanVote", "options", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r9 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r10 = r5;
        r5 = r9.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r10 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r6 = r10.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r8 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        return new gr0.i(r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        k41.b.B(r13, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        k41.b.B(r13, "viewerCanVote");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        k41.b.B(r13, "totalVoteCount");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        k41.b.B(r13, "viewerHasVoted");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        k41.b.B(r13, "question");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        k41.b.B(r13, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r3 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r9 = r4;
        r4 = r6.booleanValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i c(ea.e eVar, w wVar) {
        Boolean bool;
        Integer valueOf;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        Boolean bool3 = null;
        h hVar = null;
        String str3 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool = bool2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 3:
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
                    num = valueOf;
                    bool2 = bool4;
                    bool3 = bool5;
                    continue;
                case 4:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 5:
                    hVar = (h) aa.c.b(aa.c.c(l.a, false)).a(eVar, wVar);
                    bool2 = bool2;
                    num = num;
                    continue;
                case 6:
                    bool = bool2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, w wVar, i iVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iVar.a);
        fVar.z0("question");
        bVar.b(fVar, wVar, iVar.b);
        fVar.z0("viewerHasVoted");
        aa.b bVar2 = aa.c.f;
        f4.C(iVar.c, bVar2, fVar, wVar, "totalVoteCount");
        fVar.z(iVar.d);
        fVar.z0("viewerCanVote");
        f4.C(iVar.e, bVar2, fVar, wVar, "options");
        aa.c.b(aa.c.c(l.a, false)).b(fVar, wVar, iVar.f);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, iVar.g);
    }
}
