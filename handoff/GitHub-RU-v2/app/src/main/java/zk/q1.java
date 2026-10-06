package zk;

import com.github.service.models.response.type.PullRequestReviewEvent;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q1 {
    public oa.g a;

    public q1(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, PullRequestReviewEvent pullRequestReviewEvent, String str2, j71.c cVar, c71.c cVar2) {
        p1 p1Var;
        int i;
        if (cVar2 instanceof p1) {
            p1Var = (p1) cVar2;
            int i2 = p1Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p1Var.y = i2 - Integer.MIN_VALUE;
                Object obj = p1Var.w;
                b71.a aVar = b71.a.r;
                i = p1Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    z01.h1 h1Var = (z01.h1) this.a.a(jVar);
                    p1Var.u = jVar;
                    p1Var.v = cVar;
                    p1Var.y = 1;
                    obj = h1Var.c(str, pullRequestReviewEvent, str2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = p1Var.v;
                    jVar = p1Var.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        p1Var = new p1(this, cVar2);
        Object obj2 = p1Var.w;
        b71.a aVar2 = b71.a.r;
        i = p1Var.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }

    public q1(Object... a) {
    }
}
