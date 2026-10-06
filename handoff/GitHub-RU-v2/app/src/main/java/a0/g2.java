package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class g2 implements zShadow {

    /* renamed from: a, reason: collision with root package name */
    public int f89a;

    /* renamed from: b, reason: collision with root package name */
    public int f90b;

    /* renamed from: c, reason: collision with root package name */
    public a0 f91c;

    public g2(int i, int i10, a0 a0Var) {
        this.f89a = i;
        this.f90b = i10;
        this.f91c = a0Var;
    }

    @Override // a0.o
    public final i2 a(h2 h2Var) {
        return new u2(this.f89a, this.f90b, this.f91c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g2) {
            g2 g2Var = (g2) obj;
            if (g2Var.f89a == this.f89a && g2Var.f90b == this.f90b && k71.k.b(g2Var.f91c, this.f91c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f91c.hashCode() + (this.f89a * 31)) * 31) + this.f90b;
    }

    @Override // a0.zShadow, a0.d0, a0.o
    public final k2 a_dup(h2 h2Var) {
        return new u2(this.f89a, this.f90b, this.f91c);
    }

    @Override // a0.d0, a0.o
    public final l2 a_dup_dup(h2 h2Var) {
        return new u2(this.f89a, this.f90b, this.f91c);
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class u2 {
        public u2() {
        }
    }
}
