package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o0 {
    public final String a;

    public o0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && k71.k.b(this.a, ((o0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnProjectV2FieldCommon3(id=", this.a, ")");
    }
}
