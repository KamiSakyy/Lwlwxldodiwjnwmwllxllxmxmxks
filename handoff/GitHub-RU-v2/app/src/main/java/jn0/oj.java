package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oj {
    public Boolean a;

    public oj(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oj) && k71.k.b(this.a, ((oj) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.e(this.a, "MarkNotificationAsDone(success=", ")");
    }
}
