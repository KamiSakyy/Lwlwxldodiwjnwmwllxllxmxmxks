package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class od implements aaShadow.v0 {
    public pd a;

    public od(pd pdVar) {
        this.a = pdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof od) && k71.k.b(this.a, ((od) obj).a);
    }

    public final int hashCode() {
        pd pdVar = this.a;
        if (pdVar == null) {
            return 0;
        }
        return pdVar.hashCode();
    }

    public final String toString() {
        return "Data(organization=" + this.a + ")";
    }
}
