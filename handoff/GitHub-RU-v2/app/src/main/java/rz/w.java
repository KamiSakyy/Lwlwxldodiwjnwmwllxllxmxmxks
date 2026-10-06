package rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public String a;
    public tz.c b;

    public w(String str, tz.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.a, wVar.a) && k71.k.b(this.b, wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProjectsV2(__typename=" + this.a + ", projectV2ConnectionFragment=" + this.b + ")";
    }
}
