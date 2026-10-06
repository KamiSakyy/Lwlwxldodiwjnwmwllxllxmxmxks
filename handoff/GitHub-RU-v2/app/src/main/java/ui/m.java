package ui;

import java.util.List;
import y71.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public oa.g a;

    public m(oa.g gVar) {
        k71.k.g(gVar, "agentsService");
        this.a = gVar;
    }

    public final y a(oa.j jVar, List list, on.g gVar, Integer num, j71.c cVar) {
        k71.k.g(jVar, "user");
        k71.k.g(list, "filters");
        k71.k.g(gVar, "order");
        return b31.b.J(((on.e) this.a.a(jVar)).j(list, gVar, num), jVar, cVar);
    }
}
