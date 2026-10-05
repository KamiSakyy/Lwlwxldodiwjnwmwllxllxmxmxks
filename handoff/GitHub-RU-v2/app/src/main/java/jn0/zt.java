package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zt {
    public final au a;

    public zt(au auVar) {
        this.a = auVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zt) && k71.k.b(this.a, ((zt) obj).a);
    }

    public final int hashCode() {
        au auVar = this.a;
        if (auVar == null) {
            return 0;
        }
        return auVar.hashCode();
    }

    public final String toString() {
        return "RemoveStar(starrable=" + this.a + ")";
    }
}
