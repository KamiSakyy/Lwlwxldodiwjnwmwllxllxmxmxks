package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w0 {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final x0 a() {
        String str;
        if (this.f == 7 && (str = this.b) != null) {
            return new x0(this.a, str, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.b == null) {
            sb.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb.append(" importance");
        }
        throw new IllegalStateException(no.a.n("Missing required properties:", sb));
    }
}
