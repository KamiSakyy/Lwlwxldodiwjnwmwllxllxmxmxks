package ea1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i extends n {
    public final int a;
    public final /* synthetic */ int b;

    public i(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return String.format(":eq(%d)", Integer.valueOf(this.a));
            case 1:
                return String.format(":gt(%d)", Integer.valueOf(this.a));
            default:
                return String.format(":lt(%d)", Integer.valueOf(this.a));
        }
    }
}
