package rb;

import a71.h;
import a71.i;
import com.github.rudroid.common.e;
import j71.c;
import k71.k;
import v71.a0;
import v71.b0;
import v71.q1;
import v71.z;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {
    public static final q1 a(z zVar, h hVar, a0 a0Var, e eVar, c cVar, String str, j71.e eVar2) {
        k.g(zVar, "<this>");
        k.g(hVar, "context");
        k.g(eVar, "crashLogger");
        return b0.y(zVar, hVar.A(new a(cVar, eVar, str, Thread.currentThread().getStackTrace())), a0Var, eVar2);
    }

    public static /* synthetic */ q1 b(z zVar, h hVar, e eVar, String str, j71.e eVar2, int i) {
        if ((i & 1) != 0) {
            hVar = i.r;
        }
        return a(zVar, hVar, a0.r, eVar, new q00.c(20), str, eVar2);
    }
}
