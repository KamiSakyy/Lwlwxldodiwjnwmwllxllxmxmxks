package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sj {
    public final Boolean a;

    public sj(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sj) && k71.k.b(this.a, ((sj) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.e(this.a, "MarkNotificationAsRead(success=", ")");
    }
}
