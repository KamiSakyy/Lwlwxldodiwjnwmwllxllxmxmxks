package ox0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m {
    public String a;

    public m(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && k71.k.b(this.a, ((m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnMemberFeatureRequestNotification(id=", this.a, ")");
    }
}
