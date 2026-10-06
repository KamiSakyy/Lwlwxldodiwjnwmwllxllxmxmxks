package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b0 extends n2 {
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public m2 k;
    public s1 l;
    public p1 m;

    public b0(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, m2 m2Var, s1 s1Var, p1 p1Var) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = m2Var;
        this.l = s1Var;
        this.m = p1Var;
    }

    public final a0 a() {
        a0 a0Var = new a0();
        a0Var.a = this.b;
        a0Var.b = this.c;
        a0Var.c = this.d;
        a0Var.d = this.e;
        a0Var.e = this.f;
        a0Var.f = this.g;
        a0Var.g = this.h;
        a0Var.h = this.i;
        a0Var.i = this.j;
        a0Var.j = this.k;
        a0Var.k = this.l;
        a0Var.l = this.m;
        a0Var.m = (byte) 1;
        return a0Var;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        m2 m2Var;
        s1 s1Var;
        p1 p1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            b0 b0Var = (b0) ((n2) obj);
            p1 p1Var2 = b0Var.m;
            s1 s1Var2 = b0Var.l;
            m2 m2Var2 = b0Var.k;
            String str4 = b0Var.h;
            String str5 = b0Var.g;
            String str6 = b0Var.f;
            if (this.b.equals(b0Var.b) && this.c.equals(b0Var.c) && this.d == b0Var.d && this.e.equals(b0Var.e) && ((str = this.f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.h) != null ? str3.equals(str4) : str4 == null) && this.i.equals(b0Var.i) && this.j.equals(b0Var.j) && ((m2Var = this.k) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((s1Var = this.l) != null ? s1Var.equals(s1Var2) : s1Var2 == null) && ((p1Var = this.m) != null ? p1Var.equals(p1Var2) : p1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        m2 m2Var = this.k;
        int hashCode5 = (hashCode4 ^ (m2Var == null ? 0 : m2Var.hashCode())) * 1000003;
        s1 s1Var = this.l;
        int hashCode6 = (hashCode5 ^ (s1Var == null ? 0 : s1Var.hashCode())) * 1000003;
        p1 p1Var = this.m;
        return hashCode6 ^ (p1Var != null ? p1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
