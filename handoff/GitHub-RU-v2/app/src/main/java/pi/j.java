package pi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements p {
    public String a;
    public l b;

    public j(String str, l lVar) {
        this.a = str;
        this.b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && this.b == jVar.b;
    }

    @Override // pi.p
    public final String getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Command(text=" + this.a + ", value=" + this.b + ")";
    }
}
