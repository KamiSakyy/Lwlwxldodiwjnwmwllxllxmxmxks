package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bl implements aaShadow.m0 {
    public final cl a;

    public bl(cl clVar) {
        this.a = clVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bl) && k71.k.b(this.a, ((bl) obj).a);
    }

    public final int hashCode() {
        cl clVar = this.a;
        if (clVar == null) {
            return 0;
        }
        return clVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationsAsUnread=" + this.a + ")";
    }
}
