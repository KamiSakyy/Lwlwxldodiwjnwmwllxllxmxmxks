package y41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h1 {
    public int a;
    public String b;
    public String c;
    public boolean d;
    public byte e;

    public final i1 a() {
        String str;
        String str2;
        if (this.e == 3 && (str = this.b) != null && (str2 = this.c) != null) {
            return new i1(this.a, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.b == null) {
            sb.append(" version");
        }
        if (this.c == null) {
            sb.append(" buildVersion");
        }
        if ((this.e & 2) == 0) {
            sb.append(" jailbroken");
        }
        throw new IllegalStateException(no.a.n("Missing required properties:", sb));
    }
}
