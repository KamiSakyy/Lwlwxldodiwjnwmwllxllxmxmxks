package ea1;

/* loaded from: /home/user/work/p/classes5.dex */
public class l extends n {
    public final int a;
    public final int b;
    public final /* synthetic */ int c;

    public l(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    public String toString() {
        String str;
        int i = this.b;
        int i2 = this.a;
        String str2 = i2 == 0 ? ":%s(%3$d)" : i == 0 ? ":%s(%2$dn)" : ":%s(%2$dn%3$+d)";
        switch (this.c) {
            case 0:
                str = "nth-child";
                break;
            case 1:
                str = "nth-last-child";
                break;
            case 2:
                str = "nth-last-of-type";
                break;
            default:
                str = "nth-of-type";
                break;
        }
        return String.format(str2, str, Integer.valueOf(i2), Integer.valueOf(i));
    }
}
