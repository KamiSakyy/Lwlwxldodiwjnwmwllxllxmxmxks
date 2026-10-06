package i50;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 {
    public boolean a;
    public boolean b;
    public String c;

    public a0(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.a == a0Var.a && this.b == a0Var.b && k71.k.b(this.c, a0Var.c);
    }

    public final int hashCode() {
        int e = x.i.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return h1.p(h1.u("PageInfo(hasNextPage=", this.a, ", hasPreviousPage=", this.b, ", startCursor="), this.c, ")");
    }
}
