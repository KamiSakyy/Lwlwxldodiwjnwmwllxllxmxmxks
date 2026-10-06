package a61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z0 {
    public String a;
    public String b;
    public int c;
    public long d;
    public k e;
    public String f;
    public String g;

    public z0(String str, String str2, int i, long j, k kVar, String str3, String str4) {
        k71.k.g(str, "sessionId");
        k71.k.g(str2, "firstSessionId");
        k71.k.g(str4, "firebaseAuthenticationToken");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = kVar;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return k71.k.b(this.a, z0Var.a) && k71.k.b(this.b, z0Var.b) && this.c == z0Var.c && this.d == z0Var.d && k71.k.b(this.e, z0Var.e) && k71.k.b(this.f, z0Var.f) && k71.k.b(this.g, z0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + com.github.rudroid.copilot.h1.i((this.e.hashCode() + x.i.c(a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), 31, this.d)) * 31, this.f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return a0.s0.m(sb, this.g, ')');
    }
}
