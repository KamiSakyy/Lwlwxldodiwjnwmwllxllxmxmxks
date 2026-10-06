package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t00 {
    public String a;

    public t00(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t00) && k71.k.b(this.a, ((t00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnNode1(id=", this.a, ")");
    }
}
