package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ui implements aaShadow.m0 {
    public vi a;

    public ui(vi viVar) {
        this.a = viVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ui) && k71.k.b(this.a, ((ui) obj).a);
    }

    public final int hashCode() {
        vi viVar = this.a;
        if (viVar == null) {
            return 0;
        }
        return viVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationSubjectAsRead=" + this.a + ")";
    }
}
