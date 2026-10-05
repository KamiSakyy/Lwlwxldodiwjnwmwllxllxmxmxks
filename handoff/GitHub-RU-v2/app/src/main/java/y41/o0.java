package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o0 {
    public long a;
    public String b;
    public d2 c;
    public e2 d;
    public f2 e;
    public i2 f;
    public byte g;

    public final p0 a() {
        String str;
        d2 d2Var;
        e2 e2Var;
        if (this.g == 1 && (str = this.b) != null && (d2Var = this.c) != null && (e2Var = this.d) != null) {
            return new p0(this.a, str, d2Var, e2Var, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" app");
        }
        if (this.d == null) {
            sb.append(" device");
        }
        throw new IllegalStateException(no.a.n("Missing required properties:", sb));
    }







}
