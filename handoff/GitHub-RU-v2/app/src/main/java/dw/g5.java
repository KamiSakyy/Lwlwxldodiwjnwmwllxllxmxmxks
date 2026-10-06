package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g5 {
    public String a;

    public g5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g5) && k71.k.b(this.a, ((g5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnPullRequest(id=", this.a, ")");
    }
}
