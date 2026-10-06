package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class td0 {
    public Boolean a;

    public td0(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof td0) && k71.k.b(this.a, ((td0) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.e(this.a, "UpdateNotificationSettings(success=", ")");
    }
}
