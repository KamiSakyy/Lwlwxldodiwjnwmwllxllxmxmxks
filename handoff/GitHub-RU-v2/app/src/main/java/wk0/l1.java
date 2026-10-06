package wk0;

import oj0.o3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l1 {
    public String a;
    public o3 b;

    public l1(String str, o3 o3Var) {
        this.a = str;
        this.b = o3Var;
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
