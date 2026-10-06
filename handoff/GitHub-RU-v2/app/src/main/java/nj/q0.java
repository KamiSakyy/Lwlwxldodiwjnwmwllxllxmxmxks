package nj;

import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 {
    public final int a;
    public final int b;

    public q0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.a == q0Var.a && this.b == q0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return f4.h(this.a, this.b, "FetchParameters(startPage=", ", perPage=", ")");
    }
}
