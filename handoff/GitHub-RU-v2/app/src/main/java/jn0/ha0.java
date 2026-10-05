package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ha0 implements aa.m0 {
    public final ja0 a;

    public ha0(ja0 ja0Var) {
        this.a = ja0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ha0) && k71.k.b(this.a, ((ha0) obj).a);
    }

    public final int hashCode() {
        ja0 ja0Var = this.a;
        if (ja0Var == null) {
            return 0;
        }
        return ja0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateIssueComment=" + this.a + ")";
    }
}
