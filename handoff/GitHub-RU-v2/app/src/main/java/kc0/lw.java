package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lw implements aaShadow.v0 {
    public final mw a;

    public lw(mw mwVar) {
        this.a = mwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lw) && k71.k.b(this.a, ((lw) obj).a);
    }

    public final int hashCode() {
        mw mwVar = this.a;
        if (mwVar == null) {
            return 0;
        }
        return mwVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
