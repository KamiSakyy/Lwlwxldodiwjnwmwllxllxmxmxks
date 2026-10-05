package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n0 {
    public final String a;

    public n0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && k71.k.b(this.a, ((n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnProjectV2FieldCommon3(id=", this.a, ")");
    }
}
