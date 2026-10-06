package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ia {
    public String a;

    public ia(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia) && k71.k.b(this.a, ((ia) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("Owner(id=", this.a, ")");
    }
}
