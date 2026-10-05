package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e1 {
    public final String a;
    public final c1 b;
    public final String c;
    public final vx.a d;

    public e1(String str, c1 c1Var, String str2, vx.a aVar) {
        this.a = str;
        this.b = c1Var;
        this.c = str2;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return k71.k.b(this.a, e1Var.a) && k71.k.b(this.b, e1Var.b) && k71.k.b(this.c, e1Var.c) && k71.k.b(this.d, e1Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c1 c1Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (c1Var == null ? 0 : Boolean.hashCode(c1Var.a))) * 31, this.c, 31);
    }

    public final String toString() {
        return "User(__typename=" + this.a + ", mobilePushNotificationSettings=" + this.b + ", id=" + this.c + ", nodeIdFragment=" + this.d + ")";
    }
}
