package vz;

import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 {
    public boolean a;
    public String b;

    public a0(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.a == a0Var.a && k71.k.b(this.b, a0Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return m0.f("PageInfo(hasNextPage=", ", endCursor=", this.b, ")", this.a);
    }
}
