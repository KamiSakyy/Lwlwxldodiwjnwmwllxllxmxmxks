package androidx.compose.foundation.layout;

/* loaded from: /home/user/work/p/classes.dex */
public final class w1 extends v2.x0 {

    /* renamed from: a, reason: collision with root package name */
    public float f1283a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1284b;

    public w1(float f6, boolean z10) {
        this.f1283a = f6;
        this.f1284b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        w1 w1Var = obj instanceof w1 ? (w1) obj : null;
        return w1Var != null && this.f1283a == w1Var.f1283a && this.f1284b == w1Var.f1284b;
    }

    @Override // v2.x0
    public final w1.q g() {
        x1 x1Var = new x1();
        x1Var.F = this.f1283a;
        x1Var.G = this.f1284b;
        return x1Var;
    }

    @Override // v2.x0
    public final void h(w1.q qVar) {
        x1 x1Var = (x1) qVar;
        x1Var.F = this.f1283a;
        x1Var.G = this.f1284b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1284b) + (Float.hashCode(this.f1283a) * 31);
    }






















    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class j {
        public j() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q {
        public q() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class r {
        public r() {
        }
    }
}
