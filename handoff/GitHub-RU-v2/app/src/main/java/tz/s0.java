package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 {
    public final String a;

    public s0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && k71.k.b(this.a, ((s0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnProjectV2FieldCommon7(id=", this.a, ")");
    }
}
