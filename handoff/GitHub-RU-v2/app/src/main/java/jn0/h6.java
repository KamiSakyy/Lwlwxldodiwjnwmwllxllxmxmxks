package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h6 {
    public final y5 a;

    public h6(y5 y5Var) {
        this.a = y5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h6) && k71.k.b(this.a, ((h6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPullRequest(commits=" + this.a + ")";
    }
}
