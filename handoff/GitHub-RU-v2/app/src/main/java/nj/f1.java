package nj;

import com.github.domain.database.GitHubDatabase;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f1 {
    public final pj.b a;

    public f1(pj.b bVar) {
        k71.k.g(bVar, "chatThreadsStore");
        this.a = bVar;
    }

    public final Object a(oa.j jVar, String str, String str2, a71.c cVar) {
        tj.d v = ((GitHubDatabase) this.a.a.a(jVar)).v();
        Object M = m71.a.M(cVar, v.a, false, true, new s0.z0(6, v, new tj.a(str, str2)));
        b71.a aVar = b71.a.r;
        w61.a0 a0Var = w61.a0.a;
        if (M != aVar) {
            M = a0Var;
        }
        if (M != aVar) {
            M = a0Var;
        }
        return M == aVar ? M : a0Var;
    }
}
