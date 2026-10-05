package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e3 implements i3 {
    public final String a;
    public final String b;

    public e3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // yz0.i3
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return k71.k.b(this.a, e3Var.a) && k71.k.b(this.b, e3Var.b);
    }

    @Override // yz0.i3
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Team(login=", this.a, ", slug=", this.b, ")");
    }
}
