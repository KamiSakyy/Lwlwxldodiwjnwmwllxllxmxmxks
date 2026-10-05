package fa1;

import com.google.android.gms.internal.measurement.i4;
import java.lang.reflect.Method;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e0 extends x0 {
    public final /* synthetic */ int d;
    public final Method e;
    public final int f;

    public /* synthetic */ e0(Method method, int i, int i2) {
        this.d = i2;
        this.e = method;
        this.f = i;
    }

    @Override // fa1.x0
    public final void a(n0 n0Var, Object obj) {
        switch (this.d) {
            case 0:
                q81.n nVar = (q81.n) obj;
                if (nVar == null) {
                    throw x0.n(this.e, this.f, "Headers parameter must not be null.", new Object[0]);
                }
                ia.d dVar = n0Var.f;
                dVar.getClass();
                int size = nVar.size();
                for (int i = 0; i < size; i++) {
                    i4.T(dVar, nVar.b(i), nVar.e(i));
                }
                return;
            default:
                if (obj == null) {
                    throw x0.n(this.e, this.f, "@Url parameter is null.", new Object[0]);
                }
                n0Var.c = obj.toString();
                return;
        }
    }
}
