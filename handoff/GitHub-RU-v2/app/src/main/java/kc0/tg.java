package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tg implements aaShadow.v0 {
    public ug a;

    public tg(ug ugVar) {
        this.a = ugVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tg) && k71.k.b(this.a, ((tg) obj).a);
    }

    public final int hashCode() {
        ug ugVar = this.a;
        if (ugVar == null) {
            return 0;
        }
        return ugVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
