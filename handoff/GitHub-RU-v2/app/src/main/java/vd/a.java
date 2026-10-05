package vd;

import com.github.rudroid.viewmodels.issuesorpullrequests.d6;
import com.github.service.models.response.IssueOrPullRequestState;
import java.util.Iterator;
import k71.k;
import yz0.f;
import yz0.i2;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    public static final boolean a(i2 i2Var, d6 d6Var) {
        k.g(i2Var, "<this>");
        k.g(d6Var, "configuration");
        if (i2Var.a0 || d6Var.j || !i2Var.u0 || !i2Var.M || i2Var.p != IssueOrPullRequestState.ISSUE_OPEN) {
            return false;
        }
        Object r12 = i2Var.x;
        if (r12.isEmpty()) {
            return true;
        }
        Iterator it = r12.iterator();
        while (it.hasNext()) {
            if (((f) it.next()).s()) {
                return false;
            }
        }
        return true;
    }
}
