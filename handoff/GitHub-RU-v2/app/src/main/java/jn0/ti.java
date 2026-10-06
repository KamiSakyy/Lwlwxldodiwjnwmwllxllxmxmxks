package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ti implements aaShadow.m0 {
    public ui a;

    public ti(ui uiVar) {
        this.a = uiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ti) && k71.k.b(this.a, ((ti) obj).a);
    }

    public final int hashCode() {
        ui uiVar = this.a;
        if (uiVar == null) {
            return 0;
        }
        return uiVar.hashCode();
    }

    public final String toString() {
        return "Data(lockLockable=" + this.a + ")";
    }
}
