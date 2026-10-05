package zx;

import dw.e7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q1 {
    public final String a;
    public final e7 b;

    public q1(String str, e7 e7Var) {
        this.a = str;
        this.b = e7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return k71.k.b(this.a, q1Var.a) && k71.k.b(this.b, q1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnIssue(__typename=" + this.a + ", subIssuesFragment=" + this.b + ")";
    }
}
