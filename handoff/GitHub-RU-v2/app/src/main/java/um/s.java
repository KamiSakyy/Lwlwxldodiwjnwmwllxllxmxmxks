package um;

import com.github.domain.database.GitHubDatabase;
import com.github.rudroid.support.u;
import com.google.android.gms.internal.measurement.d5;
import java.util.ArrayList;
import m7.w;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s {
    public qj.a a;

    public s(qj.a aVar) {
        k71.k.g(aVar, "cachedForUserDatabase");
        this.a = aVar;
    }

    public final Object a(oa.j jVar, ArrayList arrayList, c71.c cVar) {
        w wVar = (w) this.a.a(jVar);
        Object O = y9.a.O(wVar, new a10.b(wVar, new nm.j(this, jVar, arrayList, null, 1), (a71.c) null), cVar);
        return O == b71.a.r ? O : a0.a;
    }

    public final c00.g b(oa.j jVar) {
        k71.k.g(jVar, "user");
        ek.d F = ((GitHubDatabase) this.a.a(jVar)).F();
        return d5.B(F.a, new String[]{"shortcuts"}, new u(17, F));
    }
}
