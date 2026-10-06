package t91;

import x.i;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a {
    public final int a;
    public final char b;
    public final int c;

    public a(char c, int i, int i2) {
        this.a = i;
        this.b = c;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((Character.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListMarkerInfo(markerLength=");
        sb.append(this.a);
        sb.append(", markerType=");
        sb.append(this.b);
        sb.append(", markerIndent=");
        return i.j(sb, this.c, ')');
    }
}
