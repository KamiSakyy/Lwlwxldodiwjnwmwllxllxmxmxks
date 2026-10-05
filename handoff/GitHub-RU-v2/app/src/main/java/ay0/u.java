package ay0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u {
    public final String a;
    public final p b;

    public u(String str, p pVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = pVar;
    }

    public static u a(u uVar, p pVar) {
        String str = uVar.a;
        k71.k.g(str, "__typename");
        return new u(str, pVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && k71.k.b(this.b, uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Items(__typename=" + this.a + ", projectV2GroupItemsFragment=" + this.b + ")";
    }
}
