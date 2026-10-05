package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d1 {
    public f1 a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final e1 a() {
        f1 f1Var;
        String str;
        String str2;
        if (this.e == 1 && (f1Var = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new e1(f1Var, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.e) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(no.a.n("Missing required properties:", sb));
    }
}
