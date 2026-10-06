package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h3 implements i3 {
    public String a;

    public h3(String str) {
        this.a = str;
    }

    @Override // yz0.i3
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3) && k71.k.b(this.a, ((h3) obj).a);
    }

    @Override // yz0.i3
    public final String getName() {
        return null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("User(login=", this.a, ")");
    }
}
