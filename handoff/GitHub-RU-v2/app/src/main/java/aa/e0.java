package aa;

/* loaded from: /home/user/work/p/classes.dex */
public interface e0 extends g0 {
    @Override // aa.g0
    default e0 a(f0 f0Var) {
        k71.k.g(f0Var, "key");
        if (getKey().equals(f0Var)) {
            return this;
        }
        return null;
    }

    @Override // aa.g0
    default g0 b(f0 f0Var) {
        k71.k.g(f0Var, "key");
        return getKey().equals(f0Var) ? z.f692a : this;
    }

    @Override // aa.g0
    default Object c(g0 g0Var, a00.a aVar) {
        return aVar.s(g0Var, this);
    }

    f0 getKey();
}
