package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p0 {
    public final String a;

    public p0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && k71.k.b(this.a, ((p0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnProjectV2FieldCommon5(id=", this.a, ")");
    }
}
