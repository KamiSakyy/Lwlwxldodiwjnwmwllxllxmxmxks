package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sm implements aaShadow.v0 {
    public final um a;

    public sm(um umVar) {
        this.a = umVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm) && k71.k.b(this.a, ((sm) obj).a);
    }

    public final int hashCode() {
        um umVar = this.a;
        if (umVar == null) {
            return 0;
        }
        return umVar.hashCode();
    }

    public final String toString() {
        return "Data(organization=" + this.a + ")";
    }
}
