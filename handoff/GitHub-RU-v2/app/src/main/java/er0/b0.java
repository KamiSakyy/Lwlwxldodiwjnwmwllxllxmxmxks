package er0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b0 {
    public boolean a;
    public boolean b;
    public String c;

    public b0(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.a == b0Var.a && this.b == b0Var.b && k71.k.b(this.c, b0Var.c);
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
