package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class te implements aaShadow.v0 {
    public ye a;

    public te(ye yeVar) {
        this.a = yeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te) && k71.k.b(this.a, ((te) obj).a);
    }

    public final int hashCode() {
        ye yeVar = this.a;
        if (yeVar == null) {
            return 0;
        }
        return yeVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
