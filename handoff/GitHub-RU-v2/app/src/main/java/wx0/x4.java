package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x4 {
    public final String a;

    public x4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4) && k71.k.b(this.a, ((x4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnOrganization(login=", this.a, ")");
    }
}
