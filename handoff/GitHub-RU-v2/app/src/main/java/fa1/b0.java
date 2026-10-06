package fa1;

import com.github.rudroid.copilot.h1;
import java.io.IOException;
import java.lang.reflect.Method;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b0 extends x0 {
    public Method d;
    public int e;
    public n f;

    public b0(Method method, int i, n nVar) {
        this.d = method;
        this.e = i;
        this.f = nVar;
    }

    @Override // fa1.x0
    public final void a(n0 n0Var, Object obj) {
        int i = this.e;
        Method method = this.d;
        if (obj == null) {
            throw x0.n(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            n0Var.k = (q81.y) this.f.d(obj);
        } catch (IOException e) {
            throw x0.o(method, e, i, h1.l(obj, "Unable to convert ", " to RequestBody"), new Object[0]);
        }
    }
}
