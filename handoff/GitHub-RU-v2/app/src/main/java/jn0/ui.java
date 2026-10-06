package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ui {
    public ri a;
    public vi b;

    public ui(ri riVar, vi viVar) {
        this.a = riVar;
        this.b = viVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui)) {
            return false;
        }
        ui uiVar = (ui) obj;
        return k71.k.b(this.a, uiVar.a) && k71.k.b(this.b, uiVar.b);
    }

    public final int hashCode() {
        ri riVar = this.a;
        int hashCode = (riVar == null ? 0 : riVar.hashCode()) * 31;
        vi viVar = this.b;
        return hashCode + (viVar != null ? viVar.hashCode() : 0);
    }

    public final String toString() {
        return "LockLockable(actor=" + this.a + ", lockedRecord=" + this.b + ")";
    }
}
