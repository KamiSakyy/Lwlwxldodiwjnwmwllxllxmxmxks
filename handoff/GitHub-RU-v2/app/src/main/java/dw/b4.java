package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b4 {
    public final int a;

    public b4(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4) && this.a == ((b4) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("ViewerCodingAgents(totalCount=", this.a, ")");
    }
}
