package aa;

/* loaded from: /home/user/work/p/classes.dex */
public interface g0 {
    e0 a(f0 f0Var);

    g0 b(f0 f0Var);

    Object c(g0 g0Var, a00.a aVar);

    default g0 d(g0 g0Var) {
        k71.k.g(g0Var, "context");
        return g0Var == z.f692a ? this : (g0) g0Var.c(this, new a00.a(7, (byte) 0));
    }
}
