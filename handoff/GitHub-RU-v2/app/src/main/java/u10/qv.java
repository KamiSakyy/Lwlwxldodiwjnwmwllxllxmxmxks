package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qv {
    public String a;
    public String b;
    public String c;

    public qv(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv)) {
            return false;
        }
        qv qvVar = (qv) obj;
        return k71.k.b(this.a, qvVar.a) && k71.k.b(this.b, qvVar.b) && k71.k.b(this.c, qvVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((str == null ? 0 : str.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Repository(licenseContents=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }
}
