package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ak {
    public Boolean a;

    public ak(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak) && k71.k.b(this.a, ((ak) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.e(this.a, "MarkNotificationAsUndone(success=", ")");
    }
}
