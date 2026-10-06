package zk;

import com.github.service.models.response.type.PullRequestUpdateState;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b2 {
    public final oa.g a;

    public b2(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    public static y71.y a(b2 b2Var, oa.j jVar, String str, PullRequestUpdateState pullRequestUpdateState, String str2, j71.c cVar, int i) {
        if ((i & 4) != 0) {
            pullRequestUpdateState = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        b2Var.getClass();
        k71.k.g(str, "id");
        return b31.b.J(((z01.t0) b2Var.a.a(jVar)).k(str, pullRequestUpdateState, str2, (ArrayList) null), jVar, cVar);
    }

    public b2(Object... a) {
    }
}
