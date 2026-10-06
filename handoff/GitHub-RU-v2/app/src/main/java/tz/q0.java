package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 {
    public final String a;

    public q0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && k71.k.b(this.a, ((q0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnProjectV2FieldCommon5(id=", this.a, ")");
    }
}
