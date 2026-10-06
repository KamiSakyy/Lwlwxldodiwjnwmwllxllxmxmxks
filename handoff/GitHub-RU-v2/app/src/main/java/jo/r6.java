package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r6 {
    public final i6 a;

    public r6(i6 i6Var) {
        this.a = i6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r6) && k71.k.b(this.a, ((r6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPullRequest(commits=" + this.a + ")";
    }
}
