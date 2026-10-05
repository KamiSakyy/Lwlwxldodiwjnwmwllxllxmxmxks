package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sh {
    public final String a;
    public final hz0.e b;

    public sh(String str, hz0.e eVar) {
        this.a = str;
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh)) {
            return false;
        }
        sh shVar = (sh) obj;
        return k71.k.b(this.a, shVar.a) && k71.k.b(this.b, shVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node5(__typename=" + this.a + ", globalCodeSearchFragment=" + this.b + ")";
    }
}
