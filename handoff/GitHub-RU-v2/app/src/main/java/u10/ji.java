package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ji {
    public final Boolean a;

    public ji(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ji) && k71.k.b(this.a, ((ji) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.e(this.a, "MarkNotificationsAsUnread(success=", ")");
    }
}
