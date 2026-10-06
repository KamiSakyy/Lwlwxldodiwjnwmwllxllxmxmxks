package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gd {
    public final id a;

    public gd(id idVar) {
        this.a = idVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gd) && k71.k.b(this.a, ((gd) obj).a);
    }

    public final int hashCode() {
        id idVar = this.a;
        if (idVar == null) {
            return 0;
        }
        return idVar.hashCode();
    }

    public final String toString() {
        return "Diff(patch=" + this.a + ")";
    }
}
