package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n2 {
    public final int a;

    public n2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2) && this.a == ((n2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("ClosingIssuesReferences(totalCount=", this.a, ")");
    }
}
