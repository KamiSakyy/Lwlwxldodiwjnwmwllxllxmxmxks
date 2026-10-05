package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y0 {
    public String a;
    public int b;
    public int c;
    public boolean d;
    public byte e;

    public final z0 a() {
        String str;
        if (this.e == 7 && (str = this.a) != null) {
            return new z0(str, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" processName");
        }
        if ((this.e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        throw new IllegalStateException(no.a.n("Missing required properties:", sb));
    }
}
