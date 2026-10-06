package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yq implements aaShadow.v0 {
    public dr a;

    public yq(dr drVar) {
        this.a = drVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yq) && k71.k.b(this.a, ((yq) obj).a);
    }

    public final int hashCode() {
        dr drVar = this.a;
        if (drVar == null) {
            return 0;
        }
        return drVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
