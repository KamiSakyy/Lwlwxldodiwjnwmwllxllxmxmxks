package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nl {
    public Boolean a;

    public nl(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nl) && k71.k.b(this.a, ((nl) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.e(this.a, "DeleteSavedNotificationThread(success=", ")");
    }
}
