package g50;

import aa.w;
import ea.e;
import ea.f;
import java.util.List;
import jo.f4;
import k71.k;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c implements aa.a {
    public static final List a = l.r(new String[]{"id", "name", "emojiHTML", "isAnswerable", "isPollable", "description", "template", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r10 = r5;
        r5 = r6.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r10 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r6 = r10.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r9 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        return new g50.b(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        k41.b.B(r11, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        k41.b.B(r11, "isPollable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        k41.b.B(r11, "isAnswerable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        k41.b.B(r11, "emojiHTML");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        k41.b.B(r11, "name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        k41.b.B(r11, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r3 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r6 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b c(e eVar, w wVar) {
        Boolean bool;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool3 = null;
        String str4 = null;
        a aVar = null;
        String str5 = null;
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
                    bool = bool2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 4:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 5:
                    bool = bool2;
                    str4 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 6:
                    aVar = (a) aa.c.b(aa.c.c(d.a, false)).a(eVar, wVar);
                    bool2 = bool2;
                    bool3 = bool3;
                    continue;
                case 7:
                    bool = bool2;
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(f fVar, w wVar, b bVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, bVar.a);
        fVar.z0("name");
        bVar2.b(fVar, wVar, bVar.b);
        fVar.z0("emojiHTML");
        bVar2.b(fVar, wVar, bVar.c);
        fVar.z0("isAnswerable");
        aa.b bVar3 = aa.c.f;
        f4.C(bVar.d, bVar3, fVar, wVar, "isPollable");
        f4.C(bVar.e, bVar3, fVar, wVar, "description");
        aa.c.i.b(fVar, wVar, bVar.f);
        fVar.z0("template");
        aa.c.b(aa.c.c(d.a, false)).b(fVar, wVar, bVar.g);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, bVar.h);
    }

}
