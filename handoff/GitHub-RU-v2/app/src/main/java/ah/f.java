package ah;

import com.github.rudroid.repository.pullrequests.RepositoryPullRequestsFragment;
import com.github.rudroid.uitoolkit.utils.lists.t;
import java.util.List;
import m0.m;
import m0.s;
import w61.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class f implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ s s;

    public /* synthetic */ f(s sVar, int i) {
        this.r = i;
        this.s = sVar;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, java.util.List] */
    public final Object a() {
        int i = this.r;
        s sVar = this.s;
        switch (i) {
            case 0:
                return new k(Boolean.valueOf(t.b(sVar)), Boolean.valueOf(t.c(sVar)));
            case 1:
                return Boolean.valueOf(sVar.e.b.y() > 0);
            case 2:
                return Boolean.valueOf(sVar.e.b.y() > 0);
            case 3:
                return Boolean.valueOf(t.c(sVar));
            case 4:
                return Boolean.valueOf(sVar.e.b.y() > 0);
            case 5:
                return Boolean.valueOf(sVar.e.b.y() > 0);
            case 6:
                return Boolean.valueOf(sVar.e.b.y() > 0);
            case 7:
                return Boolean.valueOf(sVar.e.b.y() > 0);
            case 8:
                return Boolean.valueOf(sVar.e.b.y() > 0);
            case 9:
                return Boolean.valueOf(sVar.e.b.y() > 0);
            case 10:
                r71.e[] eVarArr = RepositoryPullRequestsFragment.N0;
                return Boolean.valueOf(sVar.e.b.y() > 0);
            case 11:
                m mVar = (m) x61.m.f0((List) sVar.h().k);
                return new k(Integer.valueOf(mVar != null ? mVar.a : 0), Integer.valueOf(sVar.h().n));
            case 12:
                return new k(Integer.valueOf(sVar.e.c.y()), Boolean.valueOf(sVar.e.b.y() == 0));
            case 13:
                return Integer.valueOf(sVar.e.b.y());
            default:
                return Integer.valueOf(sVar.h().n);
        }
    }
}
