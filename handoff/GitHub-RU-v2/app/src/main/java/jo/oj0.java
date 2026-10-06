package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oj0 {
    public final String a;

    public oj0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oj0) && k71.k.b(this.a, ((oj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnIssue(id=", this.a, ")");
    }
}
