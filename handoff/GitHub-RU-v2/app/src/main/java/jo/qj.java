package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qj {
    public final boolean a;
    public final String b;

    public qj(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj)) {
            return false;
        }
        qj qjVar = (qj) obj;
        return this.a == qjVar.a && k71.k.b(this.b, qjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return com.github.rudroid.m0.f("CopilotProPlus(success=", ", message=", this.b, ")", this.a);
    }
}
