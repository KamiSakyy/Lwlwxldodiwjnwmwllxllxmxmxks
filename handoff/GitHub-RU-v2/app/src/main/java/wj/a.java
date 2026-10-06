package wj;

import com.github.domain.database.GitHubDatabase;
import k71.k;
import oa.g;
import oa.j;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements g {
    public qj.a a;

    public a(qj.a aVar) {
        k.g(aVar, "databaseFactory");
        this.a = aVar;
    }

    public final Object a(j jVar) {
        k.g(jVar, "user");
        return ((GitHubDatabase) this.a.a(jVar)).y();
    }

    public Object a(Object) { return null; }
}
