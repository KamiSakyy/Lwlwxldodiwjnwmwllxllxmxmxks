package wf;

import com.github.rudroid.common.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public m0 a;
    public String b;

    public k(m0 m0Var, String str) {
        this.a = m0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && k71.k.b(this.b, kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FilterSortReactionItem(filter=" + this.a + ", emoji=" + this.b + ")";
    }
}
