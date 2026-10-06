package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ei implements aaShadow.m0 {
    public final fi a;

    public ei(fi fiVar) {
        this.a = fiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ei) && k71.k.b(this.a, ((ei) obj).a);
    }

    public final int hashCode() {
        fi fiVar = this.a;
        if (fiVar == null) {
            return 0;
        }
        return fiVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationsAsUndone=" + this.a + ")";
    }
}
