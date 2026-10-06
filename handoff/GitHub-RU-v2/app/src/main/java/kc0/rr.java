package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rr implements aaShadow.m0 {
    public final sr a;

    public rr(sr srVar) {
        this.a = srVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rr) && k71.k.b(this.a, ((rr) obj).a);
    }

    public final int hashCode() {
        sr srVar = this.a;
        if (srVar == null) {
            return 0;
        }
        return srVar.hashCode();
    }

    public final String toString() {
        return "Data(removeDashboardSearchShortcut=" + this.a + ")";
    }
}
