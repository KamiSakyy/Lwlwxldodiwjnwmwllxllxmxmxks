package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kj implements aaShadow.m0 {
    public lj a;

    public kj(lj ljVar) {
        this.a = ljVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kj) && k71.k.b(this.a, ((kj) obj).a);
    }

    public final int hashCode() {
        lj ljVar = this.a;
        if (ljVar == null) {
            return 0;
        }
        return ljVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationsAsUnread=" + this.a + ")";
    }
}
