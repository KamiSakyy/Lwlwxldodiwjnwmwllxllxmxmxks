package k41;

import java.util.concurrent.Executor;
import k71.k;
import p41.o;
import v71.b0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements p41.d {
    public static final h s = new h(0);
    public static final h t = new h(1);
    public static final h u = new h(2);
    public static final h v = new h(3);
    public final /* synthetic */ int r;

    public /* synthetic */ h(int i) {
        this.r = i;
    }

    @Override // p41.d
    public final Object f(androidx.lifecycle.b bVar) {
        switch (this.r) {
            case 0:
                Object b = bVar.b(new o(o41.a.class, Executor.class));
                k.f(b, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b0.o((Executor) b);
            case 1:
                Object b2 = bVar.b(new o(o41.c.class, Executor.class));
                k.f(b2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b0.o((Executor) b2);
            case 2:
                Object b3 = bVar.b(new o(o41.b.class, Executor.class));
                k.f(b3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b0.o((Executor) b3);
            default:
                Object b4 = bVar.b(new o(o41.d.class, Executor.class));
                k.f(b4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return b0.o((Executor) b4);
        }
    }
}
