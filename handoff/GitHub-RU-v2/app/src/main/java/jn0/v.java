package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v implements aaShadow.m0 {
    public final t a;

    public v(t tVar) {
        this.a = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && k71.k.b(this.a, ((v) obj).a);
    }

    public final int hashCode() {
        t tVar = this.a;
        if (tVar == null) {
            return 0;
        }
        return tVar.hashCode();
    }

    public final String toString() {
        return "Data(addMobileDeviceToken=" + this.a + ")";
    }
}
