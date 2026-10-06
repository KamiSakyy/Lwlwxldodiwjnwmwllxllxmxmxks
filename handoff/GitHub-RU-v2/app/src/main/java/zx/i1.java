package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i1 {
    public String a;

    public i1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && k71.k.b(this.a, ((i1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnOrganization(id=", this.a, ")");
    }
}
