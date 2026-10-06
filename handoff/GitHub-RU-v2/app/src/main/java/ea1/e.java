package ea1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e extends n {
    public static boolean b = false;
    public final /* synthetic */ int a;

    @Override // ea1.n
    public int a() {
        switch (this.a) {
            case 0:
                return 10;
            case 6:
                return 1;
            case 7:
                return -1;
            case 8:
                return 1;
            default:
                return super.a();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "*";
            case 1:
                return ":empty";
            case 2:
                return ":first-child";
            case 3:
                return ":last-child";
            case 4:
                return ":only-child";
            case 5:
                return ":only-of-type";
            case 6:
                return ":root";
            case 7:
                return ":matchText";
            default:
                return ">";
        }
    }
    public Object g(Object p1, Object p2) { return null; }
    public Object z(Object p1, Object p2, Object p3) { return null; }
}
