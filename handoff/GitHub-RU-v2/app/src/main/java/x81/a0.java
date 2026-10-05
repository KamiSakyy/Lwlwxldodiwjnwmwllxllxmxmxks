package x81;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a0 {
    public int a;
    public final int[] b = new int[10];

    public final int a() {
        if ((this.a & 16) != 0) {
            return this.b[4];
        }
        return 65535;
    }

    public final void b(a0 a0Var) {
        k71.k.g(a0Var, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & a0Var.a) != 0) {
                c(i, a0Var.b[i]);
            }
        }
    }

    public final void c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return;
            }
            this.a = (1 << i) | this.a;
            iArr[i] = i2;
        }
    }
}
