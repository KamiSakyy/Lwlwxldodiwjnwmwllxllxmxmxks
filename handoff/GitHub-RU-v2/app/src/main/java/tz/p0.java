package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p0 {
    public String a;

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
        return f1.e.z("OnProjectV2FieldCommon4(id=", this.a, ")");
    }
}
