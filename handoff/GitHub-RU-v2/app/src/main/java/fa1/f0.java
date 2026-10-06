package fa1;

import com.github.rudroid.copilot.h1;
import com.google.android.gms.internal.measurement.b4;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f0 extends x0Shadow {
    public final /* synthetic */ int d = 1;
    public Method e;
    public int f;
    public n g;
    public Object h;

    public f0(Method method, int i, n nVar, String str) {
        this.e = method;
        this.f = i;
        this.g = nVar;
        this.h = str;
    }

    @Override // fa1.x0Shadow
    public final void a(n0 n0Var, Object obj) {
        int i = this.d;
        n nVar = this.g;
        Object obj2 = this.h;
        Method method = this.e;
        int i2 = this.f;
        switch (i) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    n0Var.c((q81.n) obj2, (q81.y) nVar.d(obj));
                    return;
                } catch (IOException e) {
                    throw x0.n(method, i2, h1.l(obj, "Unable to convert ", " to RequestBody"), e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw x0.n(method, i2, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw x0.n(method, i2, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw x0.n(method, i2, f1.e.z("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", f1.e.z("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    q81.n nVar2 = q81.n.s;
                    n0Var.c(b4.Z(strArr), (q81.y) nVar.d(value));
                }
                return;
        }
    }

    public f0(Method method, int i, q81.n nVar, n nVar2) {
        this.e = method;
        this.f = i;
        this.h = nVar;
        this.g = nVar2;
    }
}
