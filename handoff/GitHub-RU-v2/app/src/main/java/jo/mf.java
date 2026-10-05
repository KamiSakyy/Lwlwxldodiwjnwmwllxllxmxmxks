package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mf {
    public final boolean a;
    public final m10.ka b;

    public mf(boolean z, m10.ka kaVar) {
        this.a = z;
        this.b = kaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf)) {
            return false;
        }
        mf mfVar = (mf) obj;
        return this.a == mfVar.a && this.b == mfVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Filter(isEnabled=" + this.a + ", filterGroup=" + this.b + ")";
    }
}
