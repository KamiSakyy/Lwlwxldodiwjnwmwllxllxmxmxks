package in;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0 {
    public final boolean a;
    public final boolean b;

    public /* synthetic */ j0() {
        this(true, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.a == j0Var.a && this.b == j0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "GitHubOkHttpTag(skipAuthHeader=" + this.a + ", skipAcceptHeader=" + this.b + ")";
    }

    public j0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
