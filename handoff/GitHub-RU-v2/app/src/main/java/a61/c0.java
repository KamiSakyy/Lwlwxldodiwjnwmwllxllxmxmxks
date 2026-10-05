package a61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c0 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public c0(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return k71.k.b(this.a, c0Var.a) && this.b == c0Var.b && this.c == c0Var.c && this.d == c0Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int b = a0.s0.b(this.c, a0.s0.b(this.b, this.a.hashCode() * 31, 31), 31);
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return b + i;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", isDefaultProcess=" + this.d + ')';
    }
}
