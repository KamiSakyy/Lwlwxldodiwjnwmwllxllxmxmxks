package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d3 implements i3 {
    public final String a;
    public final String b;

    public d3(String str, String str2) {
        k71.k.g(str, "login");
        k71.k.g(str2, "name");
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
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return k71.k.b(this.a, d3Var.a) && k71.k.b(this.b, d3Var.b);
    }

    @Override // yz0.i3
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Repository(login=", this.a, ", name=", this.b, ")");
    }
}
