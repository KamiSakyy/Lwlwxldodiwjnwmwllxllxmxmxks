package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k1 {
    public final String a;
    public final i1 b;
    public final String c;

    public k1(String str, i1 i1Var, String str2) {
        this.a = str;
        this.b = i1Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return k71.k.b(this.a, k1Var.a) && k71.k.b(this.b, k1Var.b) && k71.k.b(this.c, k1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i1 i1Var = this.b;
        return this.c.hashCode() + ((hashCode + (i1Var == null ? 0 : Boolean.hashCode(i1Var.a))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(id=");
        sb.append(this.a);
        sb.append(", mobilePushNotificationSettings=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
