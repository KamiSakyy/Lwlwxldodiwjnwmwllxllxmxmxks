package zk;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b1 {
    public final a2 a;
    public final cn.a b;

    public b1(a2 a2Var, cn.a aVar) {
        k71.k.g(a2Var, "updatePullRequestReviewersUseCase");
        k71.k.g(aVar, "timelineStore");
        this.a = a2Var;
        this.b = aVar;
    }

    public final y71.y a(oa.j jVar, String str, List list, List list2, j71.c cVar) {
        k71.k.g(str, "id");
        return new y71.y(b31.b.J(this.a.a(jVar, str, list, x61.r.r, list2, true, cVar), jVar, cVar), new an.d(this, jVar, str, list, null, 13), 6);
    }
}
