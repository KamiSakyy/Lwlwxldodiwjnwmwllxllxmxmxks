package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f8 {
    public final String a;

    public f8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8) && k71.k.b(this.a, ((f8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("DeleteIssueComment(__typename=", this.a, ")");
    }
}
