package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ed {
    public final String a;

    public ed(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed) && k71.k.b(this.a, ((ed) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("File(name=", this.a, ")");
    }
}
