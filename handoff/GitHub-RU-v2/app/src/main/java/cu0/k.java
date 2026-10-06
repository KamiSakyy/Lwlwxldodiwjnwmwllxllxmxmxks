package cu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k {
    public String a;

    public k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && k71.k.b(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnUser(id=", this.a, ")");
    }
}
