package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s3 {
    public final j4 a;
    public final r3 b;
    public final String c;
    public final String d;

    public s3(j4 j4Var, r3 r3Var, String str, String str2) {
        this.a = j4Var;
        this.b = r3Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return k71.k.b(this.a, s3Var.a) && k71.k.b(this.b, s3Var.b) && k71.k.b(this.c, s3Var.c) && k71.k.b(this.d, s3Var.d);
    }

    public final int hashCode() {
        j4 j4Var = this.a;
        int hashCode = (j4Var == null ? 0 : j4Var.hashCode()) * 31;
        r3 r3Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (r3Var != null ? r3Var.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckSuite(workflowRun=");
        sb.append(this.a);
        sb.append(", app=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
