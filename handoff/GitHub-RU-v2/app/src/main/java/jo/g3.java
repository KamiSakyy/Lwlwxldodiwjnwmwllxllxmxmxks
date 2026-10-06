package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g3 {
    public String a;

    public g3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3) && k71.k.b(this.a, ((g3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnOrganization(id=", this.a, ")");
    }
}
