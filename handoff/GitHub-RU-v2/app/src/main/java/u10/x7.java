package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x7 {
    public final String a;

    public x7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7) && k71.k.b(this.a, ((x7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("DeleteIssueComment(__typename=", this.a, ")");
    }
}
