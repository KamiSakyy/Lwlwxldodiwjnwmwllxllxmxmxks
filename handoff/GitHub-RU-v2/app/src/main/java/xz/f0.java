package xz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f0 {
    public final String a;

    public f0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && k71.k.b(this.a, ((f0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnProjectV2GroupRepositoryValue(nameWithOwner=", this.a, ")");
    }
}
