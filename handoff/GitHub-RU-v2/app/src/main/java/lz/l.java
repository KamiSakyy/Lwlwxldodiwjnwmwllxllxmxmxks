package lz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public String a;

    public l(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && k71.k.b(this.a, ((l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnMemberFeatureRequestNotification(id=", this.a, ")");
    }
}
