package qm;

import a0.q0;
import com.github.domain.database.GitHubDatabase;
import com.google.android.gms.internal.measurement.d5;
import java.util.Arrays;
import java.util.List;
import k71.k;
import oa.j;
import w61.a0;
import y71.i;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public qj.a a;

    public g(qj.a aVar) {
        k.g(aVar, "cachedForUserDatabase");
        this.a = aVar;
    }

    public final i a(j jVar) {
        k.g(jVar, "user");
        return n1Shadow.p(d5.B(((GitHubDatabase) this.a.a(jVar)).A().a, new String[]{"mobile_push_notification_settings"}, new a7.i(4)));
    }

    public final Object b(j jVar, List list, c71.j jVar2) {
        ak.d A = ((GitHubDatabase) this.a.a(jVar)).A();
        ak.e[] eVarArr = (ak.e[]) list.toArray(new ak.e[0]);
        Object M = m71.a.M(jVar2, A.a, false, true, new q0(5, A, (ak.e[]) Arrays.copyOf(eVarArr, eVarArr.length)));
        b71.a aVar = b71.a.r;
        a0 a0Var = a0.a;
        if (M != aVar) {
            M = a0Var;
        }
        return M == aVar ? M : a0Var;
    }

}
