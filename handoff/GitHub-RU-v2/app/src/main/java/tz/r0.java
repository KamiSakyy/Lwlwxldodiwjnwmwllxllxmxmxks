package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 {
    public final String a;

    public r0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && k71.k.b(this.a, ((r0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnProjectV2FieldCommon6(id=", this.a, ")");
    }
}
