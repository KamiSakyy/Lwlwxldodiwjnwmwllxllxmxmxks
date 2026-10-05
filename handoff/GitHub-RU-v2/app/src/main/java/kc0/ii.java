package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ii implements aa.m0 {
    public final ji a;

    public ii(ji jiVar) {
        this.a = jiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ii) && k71.k.b(this.a, ((ii) obj).a);
    }

    public final int hashCode() {
        ji jiVar = this.a;
        if (jiVar == null) {
            return 0;
        }
        return jiVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationAsUndone=" + this.a + ")";
    }
}
