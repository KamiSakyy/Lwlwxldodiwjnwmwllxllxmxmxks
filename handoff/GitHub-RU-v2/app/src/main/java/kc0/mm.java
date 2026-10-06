package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mm implements aaShadow.v0 {
    public om a;

    public mm(om omVar) {
        this.a = omVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mm) && k71.k.b(this.a, ((mm) obj).a);
    }

    public final int hashCode() {
        om omVar = this.a;
        if (omVar == null) {
            return 0;
        }
        return omVar.hashCode();
    }

    public final String toString() {
        return "Data(organization=" + this.a + ")";
    }
}
