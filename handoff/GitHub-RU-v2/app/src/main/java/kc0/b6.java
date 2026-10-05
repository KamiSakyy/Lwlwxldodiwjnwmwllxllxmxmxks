package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b6 {
    public final s5 a;

    public b6(s5 s5Var) {
        this.a = s5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6) && k71.k.b(this.a, ((b6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPullRequest(commits=" + this.a + ")";
    }
}
