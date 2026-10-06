package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z8 {
    public String a;

    public z8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z8) && k71.k.b(this.a, ((z8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("DeleteIssueComment(__typename=", this.a, ")");
    }
}
