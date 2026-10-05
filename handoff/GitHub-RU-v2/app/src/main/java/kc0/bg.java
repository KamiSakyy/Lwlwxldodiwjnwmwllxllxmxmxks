package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bg {
    public final String a;
    public final bn0.e b;

    public bg(String str, bn0.e eVar) {
        this.a = str;
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return k71.k.b(this.a, bgVar.a) && k71.k.b(this.b, bgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node5(__typename=" + this.a + ", globalCodeSearchFragment=" + this.b + ")";
    }
}
