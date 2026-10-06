package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eo implements aaShadow.v0 {
    public jo a;

    public eo(jo joVar) {
        this.a = joVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eo) && k71.k.b(this.a, ((eo) obj).a);
    }

    public final int hashCode() {
        jo joVar = this.a;
        if (joVar == null) {
            return 0;
        }
        return joVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
