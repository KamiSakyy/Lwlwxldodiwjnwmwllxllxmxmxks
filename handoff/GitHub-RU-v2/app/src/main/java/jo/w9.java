package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w9 {
    public final String a;

    public w9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w9) && k71.k.b(this.a, ((w9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("DeleteIssueComment(__typename=", this.a, ")");
    }
}
