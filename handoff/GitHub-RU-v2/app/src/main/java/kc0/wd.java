package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wd implements aaShadow.v0 {
    public final ae a;

    public wd(ae aeVar) {
        this.a = aeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wd) && k71.k.b(this.a, ((wd) obj).a);
    }

    public final int hashCode() {
        ae aeVar = this.a;
        if (aeVar == null) {
            return 0;
        }
        return aeVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
