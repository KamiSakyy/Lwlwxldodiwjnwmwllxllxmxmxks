package fa1;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes5.dex */
public class b implements n {
    public static final b s = new b(0);
    public static final b t = new b(1);
    public static final b u = new b(2);
    public static final b v = new b(3);
    public static final b w = new b(4);
    public static final b x = new b(5);
    public final /* synthetic */ int r;

    public /* synthetic */ b(int i) {
        this.r = i;
    }

    public List a(Executor executor) {
        return Collections.singletonList(new p(executor));
    }

    public List b() {
        return Collections.EMPTY_LIST;
    }

    public String c(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    /* JADX WARN: Finally extract failed */
    @Override // fa1.n
    public Object d(Object obj) {
        switch (this.r) {
            case 0:
                return obj.toString();
            case 1:
                q81.c0 c0Var = (q81.c0) obj;
                try {
                    h91.h hVar = new h91.h();
                    c0Var.r().s(hVar);
                    q81.q m = c0Var.m();
                    long f = c0Var.f();
                    q81.b0 b0Var = q81.c0.r;
                    q81.b0 b0Var2 = new q81.b0(m, f, hVar);
                    c0Var.close();
                    return b0Var2;
                } catch (Throwable th) {
                    c0Var.close();
                    throw th;
                }
            case 2:
                return (q81.y) obj;
            case 3:
                return (q81.c0) obj;
            case 4:
                ((q81.c0) obj).close();
                return w61.a0.a;
            default:
                ((q81.c0) obj).close();
                return null;
        }
    }

    public Object e(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean f(Method method) {
        return false;
    }
}
