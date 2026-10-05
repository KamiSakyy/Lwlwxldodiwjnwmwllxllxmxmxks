package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t5 {
    public final k5 a;

    public t5(k5 k5Var) {
        this.a = k5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t5) && k71.k.b(this.a, ((t5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPullRequest(commits=" + this.a + ")";
    }
}
