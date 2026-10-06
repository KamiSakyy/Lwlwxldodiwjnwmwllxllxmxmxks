package l61;

import androidx.lifecycle.k1;
import androidx.lifecycle.o1;
import b1.m;
import w80.a0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements o1 {
    public static final a0Shadow d = new a0Shadow(7);
    public p61.c a;
    public o1 b;
    public d c;

    public f(p61.c cVar, o1 o1Var, m mVar) {
        this.a = cVar;
        this.b = o1Var;
        this.c = new d(0, mVar);
    }

    public final k1 a(Class cls) {
        if (!this.a.containsKey(cls)) {
            return this.b.a(cls);
        }
        this.c.a(cls);
        throw null;
    }

    public final k1 c(Class cls, t6.c cVar) {
        return this.a.containsKey(cls) ? this.c.c(cls, cVar) : this.b.c(cls, cVar);
    }

}
