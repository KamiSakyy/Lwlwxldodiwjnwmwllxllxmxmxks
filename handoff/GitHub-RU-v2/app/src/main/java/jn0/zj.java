package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zj implements aa.m0 {
    public final ak a;

    public zj(ak akVar) {
        this.a = akVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zj) && k71.k.b(this.a, ((zj) obj).a);
    }

    public final int hashCode() {
        ak akVar = this.a;
        if (akVar == null) {
            return 0;
        }
        return akVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationAsUndone=" + this.a + ")";
    }
}
