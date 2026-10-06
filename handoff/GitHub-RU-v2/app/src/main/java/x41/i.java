package x41;

import a0.s0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public static final i c = new i(0, 0);
    public int a;
    public int b;

    public i(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(i.class.getSimpleName());
        sb.append("[position = ");
        sb.append(this.a);
        sb.append(", length = ");
        return s0.l(sb, this.b, "]");
    }
}
