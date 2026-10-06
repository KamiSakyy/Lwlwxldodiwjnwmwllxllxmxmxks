package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ni {
    public Boolean a;

    public ni(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ni) && k71.k.b(this.a, ((ni) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.e(this.a, "MarkNotificationAsUnread(success=", ")");
    }
}
