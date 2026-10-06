package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t0 {
    public final String a;

    public t0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && k71.k.b(this.a, ((t0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnProjectV2FieldCommon8(id=", this.a, ")");
    }
}
