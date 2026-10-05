package s01;

import in.r;
import java.util.LinkedHashSet;
import java.util.Set;
import rm0.ya;
import v71.v;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p extends l {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v vVar, j71.c cVar, j71.e eVar, o oVar, j71.e eVar2, j71.c cVar2, j71.c cVar3, j71.c cVar4, j71.c cVar5, j71.e eVar3, LinkedHashSet linkedHashSet, int i) {
        super(jVar, bVar, vVar, cVar, cVar, eVar, oVar, eVar2, cVar2, cVar3, cVar4, cVar5, r16, r2, r18, r3, r4, r1);
        ga.h hVar = ga.h.r;
        boolean z = (i & 2048) == 0;
        ya yaVar = new ya(10);
        j71.e yaVar2 = (i & 8192) != 0 ? new ya(11) : eVar3;
        Set set = (i & 16384) != 0 ? r.b : linkedHashSet;
        ra.c cVar6 = new ra.c(17);
        hVar = (i & 65536) != 0 ? ga.h.t : hVar;
        k71.k.g(jVar, "client");
        k71.k.g(bVar, "cachedClient");
        k71.k.g(vVar, "ioDispatcher");
        k71.k.g(set, "partialNodeErrorTypes");
    }
}
