package s91;

import k71.k;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i implements Comparable {
    public final int r;
    public final int s;
    public final x91.e t;

    public i(int i, int i2, x91.e eVar) {
        this.r = i;
        this.s = i2;
        this.t = eVar;
    }

    public final boolean a() {
        return ((q71.e) this.t.a).s != this.r;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "other");
        int i = iVar.r;
        int i2 = this.r;
        if (i2 != i) {
            return i2 - i;
        }
        if (a() != iVar.a()) {
            return a() ? 1 : -1;
        }
        q71.g gVar = this.t.a;
        int i3 = ((q71.e) gVar).r;
        int i4 = ((q71.e) gVar).s;
        q71.g gVar2 = iVar.t.a;
        int i5 = ((q71.e) gVar2).r;
        int i6 = ((q71.e) gVar2).s;
        int i7 = (i3 + i4) - (i5 + i6);
        if (i7 != 0) {
            return (i3 == i4 || i5 == i6) ? i7 : -i7;
        }
        int i8 = this.s - iVar.s;
        return a() ? -i8 : i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(a() ? "Open" : "Close");
        sb.append(": ");
        sb.append(this.r);
        sb.append(" (");
        sb.append(this.t);
        sb.append(')');
        return sb.toString();
    }
}
