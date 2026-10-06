package n51;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import sy.pShadow;
import t.q;
import w21.o;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements f, g {
    public k41.c a;
    public Context b;
    public p51.b c;
    public Set d;
    public Executor e;

    public d(Context context, String str, Set set, p51.b bVar, Executor executor) {
        this.a = new k41.c(context, str);
        this.d = set;
        this.e = executor;
        this.c = bVar;
        this.b = context;
    }

    public final o a() {
        if (!pShadow.p(this.b)) {
            return q.k("");
        }
        return q.f(this.e, new c(this, 0));
    }

    public final void b() {
        if (this.d.size() <= 0) {
            q.k((Object) null);
        } else if (!pShadow.p(this.b)) {
            q.k((Object) null);
        } else {
            q.f(this.e, new c(this, 1));
        }
    }
}
