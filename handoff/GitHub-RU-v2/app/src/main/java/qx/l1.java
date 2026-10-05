package qx;

import dw.m5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l1 {
    public final String a;
    public final m5 b;

    public l1(String str, m5 m5Var) {
        this.a = str;
        this.b = m5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return k71.k.b(this.a, l1Var.a) && k71.k.b(this.b, l1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProfileReadme(__typename=" + this.a + ", repositoryReadmeFragment=" + this.b + ")";
    }
}
