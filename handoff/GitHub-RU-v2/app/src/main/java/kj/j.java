package kj;

import android.content.Context;
import com.github.domain.database.GitHubDatabase;
import s0.z0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public wj.a a;
    public Context b;

    public j(wj.a aVar, Context context) {
        k71.k.g(aVar, "eventDao");
        this.a = aVar;
        this.b = context;
    }

    public final Object a(oa.j jVar, wj.e eVar, c71.c cVar) {
        boolean f = jVar.f(com.github.rudroid.common.a.r);
        w61.a0 a0Var = w61.a0.a;
        if (f) {
            fi.b.Companion.getClass();
            if (fi.a.d(this.b)) {
                wj.a aVar = this.a;
                aVar.getClass();
                wj.c y = ((GitHubDatabase) aVar.a.a(jVar)).y();
                Object M = m71.a.M(cVar, y.a, false, true, new z0(12, y, new wj.e[]{eVar}));
                b71.a aVar2 = b71.a.r;
                if (M != aVar2) {
                    M = a0Var;
                }
                if (M == aVar2) {
                    return M;
                }
            }
        }
        return a0Var;
    }
}
