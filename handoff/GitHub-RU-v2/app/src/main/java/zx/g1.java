package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g1 {
    public final String a;

    public g1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && k71.k.b(this.a, ((g1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnEnterpriseUserAccount(id=", this.a, ")");
    }
}
