package xz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public String a;

    public b(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && k71.k.b(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnProjectV2Field(id=", this.a, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
