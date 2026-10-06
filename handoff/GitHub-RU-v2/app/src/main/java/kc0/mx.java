package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mx implements aaShadow.v0 {
    public ox a;

    public mx(ox oxVar) {
        this.a = oxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mx) && k71.k.b(this.a, ((mx) obj).a);
    }

    public final int hashCode() {
        ox oxVar = this.a;
        if (oxVar == null) {
            return 0;
        }
        return oxVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
