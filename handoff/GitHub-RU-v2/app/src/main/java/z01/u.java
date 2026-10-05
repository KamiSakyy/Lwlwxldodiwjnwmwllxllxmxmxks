package z01;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public u(String str, String str2, String str3, String str4, String str5, String str6) {
        k71.k.g(str, "encryptionAlias");
        k71.k.g(str2, "hMacAlias");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && k71.k.b(this.b, uVar.b) && k71.k.b(this.c, uVar.c) && k71.k.b(this.d, uVar.d) && k71.k.b(this.e, uVar.e) && k71.k.b(this.f, uVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("NotificationCipherKeys(encryptionAlias=", this.a, ", hMacAlias=", this.b, ", encryptionKey=");
        f1.e.x(o, this.c, ", hMacKey=", this.d, ", verificationMessage=");
        return x.i.k(o, this.e, ", encryptedPayload=", this.f, ")");
    }
}
